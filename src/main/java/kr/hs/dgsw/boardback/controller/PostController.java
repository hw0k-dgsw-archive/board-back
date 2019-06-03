package kr.hs.dgsw.boardback.controller;

import kr.hs.dgsw.boardback.model.Post;
import kr.hs.dgsw.boardback.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public List<Post> findAll() {
        return postService.findAll();
    }

    @GetMapping("/userid/{id}")
    public List<Post> findByUserId(@PathVariable Long userId) {
        return postService.findByUserId(userId);
    }

    @GetMapping("/postid/{id}")
    public Post findById(@PathVariable Long id) {
        return postService.findById(id);
    }

    @PostMapping("/")
    public Long add(@RequestBody Post post) {
        return postService.add(post);
    }

    @PostMapping("/hashmap")
    public Long addWithHashMap(@RequestBody Post post) {
        return postService.addWithHashMap(post);
    }

    @PutMapping("/")
    public int update(@RequestBody Post post) {
        return postService.update(post);
    }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable Long id) {
        return postService.deleteById(id);
    }
}