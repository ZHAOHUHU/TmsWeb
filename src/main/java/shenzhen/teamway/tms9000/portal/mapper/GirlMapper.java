package shenzhen.teamway.tms9000.portal.mapper;

import java.util.List;

import shenzhen.teamway.tms9000.portal.domain.Account;
import shenzhen.teamway.tms9000.portal.domain.Girl;

public interface GirlMapper {

    /*
    用户登陆的认证
     */
    Girl selectByPrimaryKey(Girl girl);

    /*
    根据account的id查出girl也即是一家银行有几个girl
     */
    List<Girl> selectById(int id);

}