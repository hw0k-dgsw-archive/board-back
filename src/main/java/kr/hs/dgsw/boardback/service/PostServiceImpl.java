package kr.hs.dgsw.boardback.service;

import kr.hs.dgsw.boardback.model.Post;
import kr.hs.dgsw.boardback.model.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostMapper postMapper;

    @Autowired
    public PostServiceImpl(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    @Override
    public List<Post> findAll() {
        return postMapper.findAll();
    }

    @Override
    public List<Post> findByUserId(Long userId) {
        return postMapper.findByUserId(userId);
    }

    @Override
    public Post findById(Long id) {
        return postMapper.findById(id);
    }

    @Override
    public Long add(Post post) {
        return postMapper.add(post);
    }

    @Override
    public Long addWithHashMap(Post post) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", post.getUserId());
        map.put("title", post.getTitle());
        map.put("content", post.getContent());

        return postMapper.addWithHashMap(map);
    }

    @Override
    public int update(Post post) {
        return postMapper.update(post);
    }

    @Override
    public int deleteById(Long id) {
        return postMapper.deleteById(id);
    }
}
