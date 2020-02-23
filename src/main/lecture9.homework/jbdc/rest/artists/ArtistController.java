package jbdc.rest.artists;

import jbdc.repository.artist.Artist;
import jbdc.repository.song.Song;
import jbdc.service.SongServiceImpl;
import jbdc.service.artists.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    private final ArtistService artistService;

    @Autowired
    private SongServiceImpl songService;

    public ArtistController(final ArtistService artistService) {
        this.artistService = artistService;
    }

    @PostMapping
    public void addCustomer(@RequestBody final Artist artist) {
        artistService.addArtist(artist);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable final int id) {
        artistService.deleteArtist(id);
    }

    @GetMapping("/{id}")
    public Artist getCustomer(@PathVariable final int id) {
        return artistService.getArtist(id);
    }

    @GetMapping
    public List<Artist> getAllCustomers() {
        return artistService.getAllArtists();
    }

    @PutMapping
    public void update(@RequestBody final Artist artist) {
        artistService.update(artist);
    }

    @DeleteMapping("/songs/{id}")
    public void deleteSong(@PathVariable final int id) {
        songService.deleteSong(id);
    }

    @PutMapping("/songs")
    public void updateSong(@RequestBody final Song song) {
        songService.update(song);
    }

    @PostMapping("/songs")
    public void addSong(@RequestBody final Song song) {
        songService.addSong(song);
    }


}