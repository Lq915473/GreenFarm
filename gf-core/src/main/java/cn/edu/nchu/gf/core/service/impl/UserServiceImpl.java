package cn.edu.nchu.gf.core.service.impl;

import cn.edu.nchu.gf.core.dao.TUserMapper;
import cn.edu.nchu.gf.core.model.TUser;
import cn.edu.nchu.gf.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service()
public class UserServiceImpl implements UserService {
    @Autowired
    private TUserMapper tUserMapper;
    private TUser user = new TUser();
    @Override
    public TUser getRegister(TUser tUser) {
        tUserMapper.insert(tUser);
        return tUser;
    }

    @Override
    public TUser getLogin(String userId,String passWord,String role) {
        user = tUserMapper.select(userId,passWord,role);
        if(user != null){
            return user;
        }
        return null;
    }
}
