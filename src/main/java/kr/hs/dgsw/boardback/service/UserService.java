package kr.hs.dgsw.boardback.service;

import kr.hs.dgsw.boardback.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    Long add(User user);
    int update(User user);
    int deleteById(Long id);
}
