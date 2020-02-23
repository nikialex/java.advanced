package homework.repository.mapper;

import homework.repository.user.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        final User user = new User();
        user.setId(rs.getInt("id"));
        user.setFirstName(rs.getString("first_name"));
        user.setLastName(rs.getString("last_name"));
        user.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
        user.setPaid(rs.getBoolean("is_paid"));
        return user;
    }
}
