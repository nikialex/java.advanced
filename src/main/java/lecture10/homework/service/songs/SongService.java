package lecture10.homework.service.songs;


import lecture10.homework.repository.song.Song;

import java.util.List;

public interface SongService {

    void addSong(Song song);

    void deleteSong(int id);

    Song getSong(int id);

    List<Song> getAllSongs();

    void update(Song song);
}
