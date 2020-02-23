package jbdc.repository.user;


import jbdc.repository.mapper.UserRowMapper;
import jbdc.repository.user.User;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public UserRepository(final NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(final User user) {
        final String sql = "INSERT INTO users (first_name, last_name, date_of_birth, is_paid) "
                + "VALUES (:first_name, :last_name, :date_of_birth, :is_paid)";


        java.sql.Date date = java.sql.Date.valueOf(user.getDateOfBirth());
        final Map<String, Object> params = new HashMap<>();
        params.put("first_name", user.getFirstName());
        params.put("last_name", user.getLastName());
        params.put("date_of_birth", date);
        params.put("is_paid", user.isPaid());


        jdbcTemplate.update(sql, params);
    }

    public void delete(final long id) {
        final String sql = "DELETE FROM users WHERE id = " + id;

        jdbcTemplate.update(sql, new HashMap<>());
    }

    public User get(final long id) {
        final String sql = "SELECT * FROM users WHERE id = " + id;

        return jdbcTemplate.queryForObject(sql, new HashMap<>(), new UserRowMapper());
    }

    public List<User> getAll() {
        final String sql = "SELECT * FROM users";

        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    public void update(final User user) {
        final String sql = "UPDATE users "
                + "SET first_name = :first_name,"
                + "last_name = :last_name,"
                + "date_of_birth = :date_of_birth,"
                + "is_paid = :is_paid"
                + " WHERE id = :id";

        final Map<String, Object> params = new HashMap<>();
        params.put("id", user.getId());
        params.put("first_name", user.getFirstName());
        params.put("last_name", user.getLastName());
        params.put("date_of_birth", java.sql.Date.valueOf(user.getDateOfBirth()));
        params.put("is_paid", user.isPaid());

        jdbcTemplate.update(sql, params);
    }
}
