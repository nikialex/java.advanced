package jbdc.service.songs;

import jbdc.repository.song.Song;

import java.util.List;

public interface SongService {

  void addSong(Song song);

  void deleteSong(int id);

  Song getSong(int id);

  List<Song> getAllSongs();

  void update(Song song);
}
