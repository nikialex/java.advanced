package lecture9.homework.repository.mapper;




import lecture9.homework.repository.artist.Artist;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArtistRowMapper implements RowMapper<Artist> {


    @Override
    public Artist mapRow(ResultSet resultSet, int i) throws SQLException {
        final Artist artist = new Artist();
        artist.setId(resultSet.getInt("id"));
        artist.setDateOfBirth((resultSet.getDate("date_of_birth").toLocalDate()));
        artist.setFirstName(resultSet.getString("first_name"));
        artist.setLastName(resultSet.getString("last_name"));
        artist.setGenre(resultSet.getString("genre"));

        return artist;
    }
}
