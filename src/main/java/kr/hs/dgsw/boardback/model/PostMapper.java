package kr.hs.dgsw.boardback.model;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PostMapper {
    @Select("select id, user_id, title, content from posts")
    List<Post> findAll();

    List<Post> findByUserId(Long userId);

    Post findById(@Param("id") Long id);

    Long add(Post post);

    Long addWithHashMap(HashMap<String, Object> map);

    int update(Post post);

    @Delete("delete from posts where id = #{id}")
    int deleteById(@Param("id") Long id);
}
