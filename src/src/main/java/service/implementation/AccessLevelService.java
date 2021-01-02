package src.main.java.service.implementation;


import src.main.java.DAO.IGeneralDAO;
import src.main.java.DAO.implementation.AccessLevelDAO;
import src.main.java.model.implementation.AccessLevel;

public class AccessLevelService extends GeneralService<AccessLevel> {
    private final IGeneralDAO<AccessLevel, Integer> accessLevelDAOImplementation = new AccessLevelDAO();
    //private final GeneralDAO<AccessLevel> ACCESS_LEVEL_DAO = new AccessLevelDAO();
    @Override
    public final IGeneralDAO<AccessLevel, Integer> getDAO() {
        return accessLevelDAOImplementation;
    }
}
    //public IGeneralDAO<AccessLevel> getDAO() {
        //return ACCESS_LEVEL_DAO;
    //}
//}