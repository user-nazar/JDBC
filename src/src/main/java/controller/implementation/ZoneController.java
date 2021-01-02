package src.main.java.controller.implementation;


import src.main.java.model.implementation.Zone;
import src.main.java.service.implementation.GeneralService;
import src.main.java.service.implementation.ZoneService;

public class ZoneController extends GeneralController<Zone> {

    private static final ZoneService ZONE_SERVICE = new ZoneService();
    //private final GeneralService<Zone> zoneSettingsService = new ZoneService();


    @Override
    public final GeneralService<Zone> getService() {
        return ZONE_SERVICE;
    }
    //public final IGeneralService<ZoneService> getService() {
    //return zoneServiceService;
}
