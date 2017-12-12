
package shenzhen.teamway.tms9000.portal.service;

import shenzhen.teamway.tms9000.portal.domain.User;

public interface UserService {

    public boolean hasMatchUser(String userName, String password);

    /**
     * 用户登录 根据用户名验证查询用户信息
     * @param userName
     * @return
     */
	public User getUserByName(String userName);
}
