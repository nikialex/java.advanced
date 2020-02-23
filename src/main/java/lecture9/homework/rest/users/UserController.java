package lecture9.homework.rest.users;


import lecture9.homework.repository.user.User;
import lecture9.homework.service.users.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody final User user) {
        userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable final int id) {
        userService.deleteUser(id);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable final int id) {
        return userService.getUser(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping
    public void update(@RequestBody final User user) {
        userService.update(user);
    }


    @GetMapping("/play/{id}")
    public void playSong(@PathVariable final int id,int songId) {
        userService.playSong(id,songId);

    }
}
