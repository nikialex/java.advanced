package lecture9.homework.service.users.impl;

import lecture9.homework.repository.song.Song;
import lecture9.homework.repository.user.User;
import lecture9.homework.repository.user.UserRepository;
import lecture9.homework.service.SongServiceImpl;
import lecture9.homework.service.users.UserService;
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
        userRepository.add(user);
    }

    @Override
    public void deleteUser(final int id) {
        userRepository.delete(id);
    }

    @Override
    public User getUser(final int id) {
        return userRepository.get(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAll();
    }

    @Override
    public void update(final User user) {
        userRepository.update(user);
    }

    @Override
    public void playSong(int userId, int songId) {
        //example =>http://localhost:8080/users/play/10?songId=2
        Song song = songService.getSong(songId);
        User user = userRepository.get(userId);
        System.out.println("song with name " + song.getName() + " is played by user with name " + user.getFirstName());

    }
}
