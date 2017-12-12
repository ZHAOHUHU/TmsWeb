package shenzhen.teamway.tms9000.portal.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import shenzhen.teamway.tms9000.portal.domain.User;
import shenzhen.teamway.tms9000.portal.mapper.UserMapper;
import shenzhen.teamway.tms9000.portal.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	  //private UserDao userDao;
	@Resource
    private UserMapper userDao;

    public boolean hasMatchUser(String userName, String password) {
        int matchCount = userDao.getUserMatch(userName, password);
        return matchCount > 0;
    }

	public User getUserByName(String userName) {
		return userDao.findUserByUserName(userName);
	}
}
