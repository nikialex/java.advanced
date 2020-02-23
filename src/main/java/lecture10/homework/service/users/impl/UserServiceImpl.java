package lecture10.homework.service.users.impl;


import lecture10.homework.repository.song.Song;
import lecture10.homework.repository.user.User;
import lecture10.homework.repository.user.UserRepository;
import lecture10.homework.service.SongServiceImpl;
import lecture10.homework.service.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Autowired
    private SongServiceImpl songService;


    public UserServiceImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(final User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(final int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUser(final int id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void update(final User user) {
        userRepository.save(user);
    }

    @Override
    public void playSong(int userId, int songId) {
        //example =>http://localhost:8080/users/play/10?songId=2
        Song song = songService.getSong(songId);
        User user = userRepository.findById(userId);
        System.out.println("song with name " + song.getName() + " is played by user with name " + user.getFirstName());

    }
}
