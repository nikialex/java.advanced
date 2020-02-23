package lecture10.homework.service;


import lecture10.homework.repository.song.Song;
import lecture10.homework.repository.song.SongRepository;
import lecture10.homework.service.songs.SongService;
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
        songRepository.save(song);
    }

    @Override
    public void deleteSong(int id) {
        songRepository.deleteById(id);

    }

    @Override
    public Song getSong(int id) {
        return songRepository.findById(id);
    }

    @Override
    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    @Override
    public void update(Song song) {
        songRepository.save(song);
    }

}
