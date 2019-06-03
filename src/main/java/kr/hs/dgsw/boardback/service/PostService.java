package kr.hs.dgsw.boardback.service;

import kr.hs.dgsw.boardback.model.Post;

import java.util.List;

public interface PostService {
    List<Post> findAll();

    List<Post> findByUserId(Long userId);

    Post findById(Long id);

    Long add(Post post);

    Long addWithHashMap(Post post);

    int update(Post post);

    int deleteById(Long id);
}
