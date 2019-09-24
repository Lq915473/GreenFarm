package cn.edu.nchu.gf.core.service;

import cn.edu.nchu.gf.core.model.TUser;

public interface UserService {
    TUser getRegister(TUser tUser);
    TUser getLogin(String userId,String passWord,String role);
}
