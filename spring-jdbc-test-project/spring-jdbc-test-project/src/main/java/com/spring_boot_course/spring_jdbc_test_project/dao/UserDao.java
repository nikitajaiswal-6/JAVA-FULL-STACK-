package com.spring_boot_course.spring_jdbc_test_project.dao;

import com.spring_boot_course.spring_jdbc_test_project.Entities.Users;
import com.spring_boot_course.spring_jdbc_test_project.utils.UsersRowMapper;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Users Insert(Users users){
        String Query="insert into user(id,name,email) values(?,?,?)";
        int rows=jdbcTemplate.update(Query,users.getId(),users.getName(),users.getEmail());
        System.out.println(rows+" rows affected");
        return users;
    }

    public Users Update(int userId ,Users newMail){
        String Query="update user set email=? where id=?";
        int u= jdbcTemplate.update(Query,newMail.getEmail(),newMail.getName(),userId);
        System.out.println("updated rows:"+u);
        return newMail;

    }

    public void delete(){
        String Query="delete from user where id=?";
        jdbcTemplate.update(Query);
    }

    public Users getById(int userId){
        String Query="select * from user where id=?";
        return jdbcTemplate.queryForObject(Query,new UsersRowMapper(),userId);
    }

    public List<Users> Getall(){
        String Query="select * from user";
        return jdbcTemplate.query(Query,new UsersRowMapper());
    }

    public List<Users> SearchByName(String name){
        String Query="select * from user where name like ?";
        return jdbcTemplate.query(Query,new UsersRowMapper(),"%"+name+"%");
    }

    public int count(){
        String Query="select count(*) from user";
        return jdbcTemplate.queryForObject(Query, Integer.class);
    }

    //processing me h abhi

//    public Map<String, Object> getSingle(int userId){
//        String Query="select * from user where id=?";
//        return jdbcTemplate.queryForMap(Query,new UsersRowMapper(),userId);
//    }

    //processing me h abhi

//    public Map<String,Object> getMap()
//    {
//        String query="select * fom users";
//        Map<String, @Nullable Object> map = jdbcTemplate.queryForMap(query, new UsersRowMapper(), Users.class);
//
//        return map;
//    }

    public void batchInsert(List<Users> users){
        String Query="insert into user(id ,name,email) values(?,?,?)";
        jdbcTemplate.batchUpdate(Query, users, users.size(), (ps, argument) -> {
            ps.setInt(1, argument.getId());
            ps.setString(2, argument.getName());
            ps.setString(3, argument.getEmail());
        });
    }


//    public List<Users> batchUpdate(List<Users> ids,List<Users> newMail){
//        String Query="update user set email=? where id=?";
//        jdbcTemplate.batchUpdate(Query, users, users.size(), (ps, argument) -> {
//            ps.setString(1, argument.getName());
//            ps.setString(2, argument.getEmail());
//        });








}
