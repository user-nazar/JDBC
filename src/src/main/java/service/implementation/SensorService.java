package src.main.java.service.implementation;


import src.main.java.DAO.IGeneralDAO;
import src.main.java.DAO.implementation.SensorDAO;
import src.main.java.model.implementation.Sensor;

public class SensorService extends GeneralService<Sensor> {
    private final IGeneralDAO<Sensor, Integer> sensorDAOImplementation = new SensorDAO();
    //private final GeneralDAO<Sensor> SENSOR_LEVEL_DAO = new SensorDAO();
    @Override
    public final IGeneralDAO<Sensor, Integer> getDAO() {
        return sensorDAOImplementation;
    }
}
//public IGeneralDAO<Sensor> getDAO() {
//return SENSOR_LEVEL_DAO;
//}
//}