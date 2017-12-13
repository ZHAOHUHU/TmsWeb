package shenzhen.teamway.tms9000.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shenzhen.teamway.tms9000.portal.domain.Girl;
import shenzhen.teamway.tms9000.portal.mapper.GirlMapper;
import shenzhen.teamway.tms9000.portal.service.CheckGirl;

@Service
public class CheckGirlImp implements CheckGirl {
    @Autowired
    private GirlMapper girlMapper;

    @Override
    public Girl checkGirl(Girl girl) {


         Girl key = girlMapper.selectByPrimaryKey(girl);
        return key;


    }
}
