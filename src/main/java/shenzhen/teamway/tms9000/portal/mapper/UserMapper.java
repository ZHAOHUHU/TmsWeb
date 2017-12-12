package shenzhen.teamway.tms9000.portal.mapper;


import shenzhen.teamway.tms9000.portal.domain.User;

public interface UserMapper {

	int getUserMatch(String userName, String password);

	User findUserByUserName(String userName);

}
