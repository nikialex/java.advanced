package lecture10.homework.service.artists;

import lecture10.homework.repository.artist.Artist;

import java.util.List;

public interface ArtistService {

    void addArtist(Artist artist);

    void deleteArtist(int id);

    Artist getArtist(int id);

    List<Artist> getAllArtists();

    void update(Artist artist);
}
