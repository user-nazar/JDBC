package src.main.java.service.implementation;


import src.main.java.DAO.IGeneralDAO;
import src.main.java.DAO.implementation.UserDAO;
import src.main.java.model.implementation.User;

public class UserService extends GeneralService<User> {
    private final IGeneralDAO<User, Integer> userDAOImplementation = new UserDAO();
    //private final GeneralDAO<User> USER_DAO = new UserDAO();
    @Override
    public final IGeneralDAO<User, Integer> getDAO() {
        return userDAOImplementation;
    }
}

//public IGeneralDAO<User> getDAO() {
//return USER_DAO;
//}
//}