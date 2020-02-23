package lecture10.homework.rest;


import lecture10.homework.repository.song.Song;
import lecture10.homework.service.songs.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private final SongService songService;

    public SongController(final SongService songService) {
        this.songService = songService;
    }

    @PostMapping
    public void addSong(@RequestBody final Song song) {
        songService.addSong(song);
    }

    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable final int id) {
        songService.deleteSong(id);
    }

    @GetMapping("/{id}")
    public Song getSong(@PathVariable final int id) {
        return songService.getSong(id);
    }

    @GetMapping
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @PutMapping
    public void update(@RequestBody final Song song) {
        songService.update(song);
    }
}