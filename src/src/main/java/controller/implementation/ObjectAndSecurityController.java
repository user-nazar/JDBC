package src.main.java.controller.implementation;


import src.main.java.model.implementation.ObjectAndSecurity;
import src.main.java.service.implementation.GeneralService;
import src.main.java.service.implementation.ObjectAndSecurityService;

public class ObjectAndSecurityController extends GeneralController<ObjectAndSecurity> {

    private static final ObjectAndSecurityService OBJECT_AND_SECURITY_SERVICE = new ObjectAndSecurityService();
    //private final GeneralService<ObjectAndSecurity> objectAndSecurityService = new ObjectAndSecurityService();

    @Override
    public final GeneralService<ObjectAndSecurity> getService() {
        return OBJECT_AND_SECURITY_SERVICE;
    }
    //public final IGeneralService<ObjectAndSecurity> getService() {
    //return objectAndSecurityService;
}