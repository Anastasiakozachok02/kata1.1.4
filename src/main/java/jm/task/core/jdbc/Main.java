package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("name1", "lastName1", (byte) 1);
        userService.saveUser("name2", "lastName2", (byte) 2);
        userService.saveUser("name3", "lastName3", (byte) 3);
        userService.saveUser("name4", "lastName4", (byte) 4);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeConnection();

    }
}
