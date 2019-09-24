package cn.edu.nchu.gf.core.dao;

import cn.edu.nchu.gf.common.base.BaseMapper;
import cn.edu.nchu.gf.core.model.TUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
@Repository
@Mapper
public interface TUserMapper{
    @Insert("insert into t_user(user_name,nick_name,password,phone,role,email,user_state) values(#{userName},#{nickName},#{password},#{phone},#{role},#{email},'买家')")
    void insert(TUser user);
    @Select("select * from t_user where user_id = #{userId} and password = #{passWord} and role = #{role}")
    TUser select(@Param("userId")String userId, @Param("passWord")String passWord, @Param("role")String role);
}