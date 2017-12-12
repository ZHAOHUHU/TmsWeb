
package shenzhen.teamway.tms9000.portal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import shenzhen.teamway.tms9000.portal.domain.User;


public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getUserMatch(String userName, String password) {
        String sql = " select count(*) from user where name = ? and password = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] { userName, password }, Integer.class);
    }

    public User findUserByUserName(final String userName) {
        String sql = " select id, name, password, group_id, role_id, status, password_status from user where name = ?";

        final User user = new User();
        jdbcTemplate.query(sql, new Object[]{userName},
                new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet resultSet) throws SQLException {
                        user.setId(resultSet.getInt("id"));
                        user.setUserName(userName);
                        user.setPassword(resultSet.getString("password"));
                        user.setGroupId(resultSet.getInt("group_id"));
                        user.setRoleId(resultSet.getInt("role_id"));
                        user.setStatus(resultSet.getInt("status"));
                        user.setPasswordStatus(resultSet.getInt("password_status"));
                    }
                });
        return user;
    }
}
