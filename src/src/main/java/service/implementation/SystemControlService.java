package src.main.java.service.implementation;


import src.main.java.DAO.IGeneralDAO;
import src.main.java.DAO.implementation.SystemControlDAO;
import src.main.java.model.implementation.SystemControl;

public class SystemControlService extends GeneralService <SystemControl> {
    private final IGeneralDAO<SystemControl, Integer> systemControlDAOImplementation = new SystemControlDAO();
    //private final GeneralDAO<SystemControl> SYSTEM_CONTROL_DAO = new SystemControlDAO();
    @Override
    public final IGeneralDAO<SystemControl, Integer> getDAO() {
        return systemControlDAOImplementation;
    }
}
//public IGeneralDAO<SystemControl> getDAO() {
//return SYSTEM_CONTROL_DAO
//}
//}