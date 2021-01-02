package src.main.java.controller.implementation;


import src.main.java.model.implementation.User;
import src.main.java.service.implementation.GeneralService;
import src.main.java.service.implementation.UserService;

public class UserController  extends GeneralController<User> {

    private static final UserService USER_SERVICE = new UserService();
    //private final GeneralService<User> userService = new userService();


    @Override
    public final GeneralService<User> getService() {
        return USER_SERVICE;
    }
    //public final IGeneralService<User> getService() {
    //return userService;
}

