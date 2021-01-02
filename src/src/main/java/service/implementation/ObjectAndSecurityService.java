package src.main.java.service.implementation;

import src.main.java.DAO.IGeneralDAO;
import src.main.java.DAO.implementation.ObjectAndSecurityDAO;
import src.main.java.model.implementation.ObjectAndSecurity;

public class ObjectAndSecurityService extends GeneralService<ObjectAndSecurity> {
    private final IGeneralDAO<ObjectAndSecurity, Integer> objectAndSecurityDAOImplementation = new ObjectAndSecurityDAO();
    //private final GeneralDAO<ObjectAndSecurity>OBJECT_AND_SECURITY_DAO = new ObjectAndSecurityDAO();
    @Override
    public final IGeneralDAO<ObjectAndSecurity, Integer> getDAO() {
        return objectAndSecurityDAOImplementation;
    }
}
//public IGeneralDAO<ObjectAndSecurity> getDAO() {
//return OBJECT_AND_SECURITY_DAO;
//}
//}