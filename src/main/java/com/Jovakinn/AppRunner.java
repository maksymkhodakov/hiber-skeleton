package com.Jovakinn;

import com.Jovakinn.models.Auto;
import com.Jovakinn.models.User;
import com.Jovakinn.service.UserService;

import java.sql.SQLException;

public class AppRunner {

    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();

        User user = new User("Max", 15);
        userService.saveUser(user);

        Auto ferrari = new Auto("Ferrari", "black");
        ferrari.setUser(user);
        user.addAuto(ferrari);

        Auto ford = new Auto("Ford", "red");
        ford.setUser(user);
        user.addAuto(ford);

        userService.updateUser(user);
    }
}
