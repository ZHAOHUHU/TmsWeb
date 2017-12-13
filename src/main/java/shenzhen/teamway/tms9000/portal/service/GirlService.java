package shenzhen.teamway.tms9000.portal.service;

import shenzhen.teamway.tms9000.portal.domain.Girl;

import java.util.List;

public interface GirlService {
    /*
    登陆验证
     */
    Girl checkGirl(Girl girl);
    /*
    显示girl列表
     */
    List<Girl> selectById(int id);
}
