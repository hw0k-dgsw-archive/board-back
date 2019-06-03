package kr.hs.dgsw.boardback.controller;

import kr.hs.dgsw.boardback.model.User;
import kr.hs.dgsw.boardback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/")
    public Long add(@RequestBody User user) {
        return userService.add(user);
    }

    @PutMapping("/")
    public int update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable Long id) {
        return userService.deleteById(id);
    }
}
