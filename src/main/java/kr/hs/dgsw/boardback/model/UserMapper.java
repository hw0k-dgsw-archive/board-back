package kr.hs.dgsw.boardback.model;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select id, account, username, email, created, updated from users")
    List<User> findAll();

    User findById(@Param("id") Long id);

    Long add(User user);

    int update(User user);

    @Delete("delete from users where id = #{id}")
    int deleteById(@Param("id") Long id);
}
