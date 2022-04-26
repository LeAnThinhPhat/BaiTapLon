package com.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.user.CrmUser;

public class UserInfoMapper implements RowMapper<CrmUser> {

    @Override
    public CrmUser mapRow(ResultSet rs, int rowNum) throws SQLException {

        String userName = rs.getString("Username");
        String password = rs.getString("Password");

        return new CrmUser(userName, password);
    }

}