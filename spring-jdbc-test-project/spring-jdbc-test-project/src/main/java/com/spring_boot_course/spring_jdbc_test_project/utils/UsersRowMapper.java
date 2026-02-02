package com.spring_boot_course.spring_jdbc_test_project.utils;

import com.spring_boot_course.spring_jdbc_test_project.Entities.Category;
import com.spring_boot_course.spring_jdbc_test_project.Entities.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//public class UserRowMapper implements RowMapper<Users> {
//
//    @Override
//    public Users mapRow(ResultSet rs,int rowNum) throws SQLException{
//        Users users=new Users();
//        users.setId(rs.getInt("id"));
//        users.setName(rs.getString("name"));
//        users.setEmail(rs.getString("email"));
//        return users;
//    }
//}


public class UsersRowMapper implements RowMapper<Users> {

    @Override
    public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
        Users users=new Users();
        users.setId(rs.getInt("id"));
        users.setName(rs.getString("name"));
        users.setEmail(rs.getString("email"));
        return users;
    }
}