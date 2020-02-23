package lecture9.homework.service;


import lecture9.homework.repository.song.Song;
import lecture9.homework.repository.song.SongRepository;
import lecture9.homework.service.songs.SongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SongServiceImpl implements SongService {

    public final SongRepository songRepository;

    public SongServiceImpl(final SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public void addSong(Song song) {
        songRepository.add(song);
    }

    @Override
    public void deleteSong(int id) {
        songRepository.delete(id);

    }

    @Override
    public Song getSong(int id) {
        return songRepository.get(id);
    }

    @Override
    public List<Song> getAllSongs() {
        return songRepository.getAll();
    }

    @Override
    public void update(Song song) {
        songRepository.update(song);
    }

}
