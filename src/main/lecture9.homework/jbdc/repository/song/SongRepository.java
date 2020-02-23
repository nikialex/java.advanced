package jbdc.repository.song;


import jbdc.repository.mapper.SongRowMapper;

import jbdc.repository.song.Song;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SongRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public SongRepository(final NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(final Song song) {
        final String sql = "INSERT INTO songs (name, date_of_song_creation, duration_in_seconds, fk_artist_id) "
                + "VALUES (:name, :date_of_song_creation, :duration_in_seconds, :fk_artist_id)";


        java.sql.Date date = java.sql.Date.valueOf(song.getDateOfSongCreation());
        final Map<String, Object> params = new HashMap<>();
        params.put("id", song.getId());
        params.put("name", song.getName());
        params.put("date_of_song_creation", date);
        params.put("duration_in_seconds", song.getDurationInSec());
        params.put("fk_artist_id", song.getArtistId());


        jdbcTemplate.update(sql, params);
    }

    public void delete(final long id) {
        final String sql = "DELETE FROM songs WHERE id = " + id;

        jdbcTemplate.update(sql, new HashMap<>());
    }

    public Song get(final long id) {
        final String sql = "SELECT * FROM songs WHERE id = " + id;

        return jdbcTemplate.queryForObject(sql, new HashMap<>(), new SongRowMapper());
    }

    public List<Song> getAll() {
        final String sql = "SELECT * FROM songs";

        return jdbcTemplate.query(sql, new SongRowMapper());
    }

    public void update(final Song song) {
        final String sql = "UPDATE songs "
                + "SET name = :name,"
                + "date_of_song_creation = :date_of_song_creation,"
                + "duration_in_seconds = :duration_in_seconds"
                + " WHERE id = :id";

        java.sql.Date date = java.sql.Date.valueOf(song.getDateOfSongCreation());
        final Map<String, Object> params = new HashMap<>();
        params.put("id", song.getId());
        params.put("name", song.getName());
        params.put("date_of_song_creation", date);
        params.put("duration_in_seconds", song.getDurationInSec());
        params.put("fk_artist_id", song.getArtistId());

        jdbcTemplate.update(sql, params);
    }
}
