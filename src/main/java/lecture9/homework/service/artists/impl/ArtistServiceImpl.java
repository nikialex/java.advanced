package homework.service.artists.impl;


import homework.repository.artist.ArtistRepository;
import org.springframework.stereotype.Service;

import homework.repository.artist.Artist;
import homework.service.artists.ArtistService;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(final ArtistRepository userRepository) {
        this.artistRepository = userRepository;
    }

    @Override
    public void addArtist(final Artist artist) {
        artistRepository.add(artist);
    }

    @Override
    public void deleteArtist(final int id) {
        artistRepository.delete(id);
    }

    @Override
    public Artist getArtist(final int id) {
        return artistRepository.get(id);
    }

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.getAll();
    }

    @Override
    public void update(final Artist artist) {
        artistRepository.update(artist);
    }
}
