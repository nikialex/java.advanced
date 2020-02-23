package lecture9.homework.service.songs;


import lecture9.homework.repository.song.Song;

import java.util.List;

public interface SongService {

  void addSong(Song song);

  void deleteSong(int id);

  Song getSong(int id);

  List<Song> getAllSongs();

  void update(Song song);
}
