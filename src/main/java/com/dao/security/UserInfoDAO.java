package com.dao.security;

import java.util.List;

import com.user.CrmUser;

public interface UserInfoDAO {
    
    public CrmUser findUserInfo(String userName);
    
    // [USER,AMIN,..]
    public List<String> getUserRoles(String userName);
    
    
}