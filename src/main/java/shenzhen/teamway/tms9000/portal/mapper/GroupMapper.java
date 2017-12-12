package shenzhen.teamway.tms9000.portal.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import shenzhen.teamway.tms9000.portal.domain.Group;

public interface GroupMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("name") String name);

    int insert(Group record);

    List<Group> selectAll();
}