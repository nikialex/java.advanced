package lecture10.homework.service.artists.impl;


import com.google.common.collect.Lists;
import lecture10.homework.repository.artist.Artist;
import lecture10.homework.repository.artist.ArtistRepository;
import lecture10.homework.service.artists.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ArtistServiceImpl implements ArtistService {
    @Autowired
    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(final ArtistRepository userRepository) {
        this.artistRepository = userRepository;
    }

    @Override
    public void addArtist(final Artist artist) {
        artistRepository.save(artist);
    }


    @Override
    public void deleteArtist(final int id) {
        artistRepository.deleteById(id);
    }

    @Override
    public Artist getArtist(final int id) {
        return artistRepository.findById(id);
    }

    @Override
    public List<Artist> getAllArtists() {

        return Lists.newArrayList(artistRepository.findAll());

    }

    @Override
    public void update(final Artist artist) {

        artistRepository.save(artist);
    }
}
