package homework.repository.mapper;


import homework.repository.song.Song;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SongRowMapper implements RowMapper<Song> {


    @Override
    public Song mapRow(ResultSet resultSet, int i) throws SQLException {

        final Song song = new Song();
        song.setId(resultSet.getInt("id"));
        song.setDateOfSongCreation((resultSet.getDate("date_of_song_creation").toLocalDate()));
        song.setName(resultSet.getString("name"));
        song.setDurationInSec(resultSet.getInt("duration_in_seconds"));
        song.setArtistId(resultSet.getInt("fk_artist_id"));

        return song;
    }
}
