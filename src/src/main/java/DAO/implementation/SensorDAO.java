package src.main.java.DAO.implementation;


import src.main.java.DAO.IGeneralDAO;
import src.main.java.model.implementation.Sensor;
import src.main.java.persistance.ConnectionManager;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class SensorDAO implements IGeneralDAO<Sensor, Integer> {

    private static final String GET_ALL = "SELECT * FROM laboratorna4.sensor";
    private static final String GET_BY_ID = "SELECT * FROM laboratorna4.sensor WHERE id=?";
    private static final String CREATE = "INSERT laboratorna4.sensor"
            + "(id, processing_time, name_model, type_sensor, calibration, classification) VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE laboratorna4.sensor"
            + " SET processing_time=?,  name_model=?, type_sensor=?, calibration=?, classification=? WHERE id=?";
    private static final String DELETE = "DELETE FROM laboratorna4.sensor WHERE id=?";

    @Override
    public final List<Sensor> getAll() throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        List<Sensor> sensors = new LinkedList<>();

        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(GET_ALL)) {
                while (resultSet.next()) {
                    Integer id = resultSet.getInt(1);
                    double processingTime = resultSet.getDouble(2);
                    String nameRoom = resultSet.getString(3);
                    String type = resultSet.getString(4);
                    Integer calibration = resultSet.getInt(5);
                    String classification = resultSet.getString(6);
                    sensors.add(new Sensor(id, processingTime, nameRoom, type, calibration, classification));
                }
            }
        }
        return sensors;
    }

    @Override
    public final Sensor getById(final Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        Sensor sensor = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Integer foundId = resultSet.getInt(1);
                    double processingTime = resultSet.getDouble(2);
                    String nameRoom = resultSet.getString(3);
                    String type = resultSet.getString(4);
                    int calibration = resultSet.getInt(5);
                    String classification = resultSet.getString(6);
                    sensor = new Sensor(foundId, processingTime, nameRoom, type, calibration, classification);
                }
            }
        }

        return sensor;
    }

    @Override
    public final int create(final Sensor entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, entity.getId());
            ps.setDouble(2, entity.getProcessingTime());
            ps.setString(3, entity.getNameModel());
            ps.setString(4, entity.getTypeSensor());
            ps.setInt(5, entity.getCalibration());
            ps.setString(6, entity.getClassification());
            return ps.executeUpdate();
        }
    }

    @Override
    public final int update(final Sensor entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setInt(1, entity.getId());
            ps.setDouble(2, entity.getProcessingTime());
            ps.setString(3, entity.getNameModel());
            ps.setString(4, entity.getTypeSensor());
            ps.setInt(5, entity.getCalibration());
            ps.setString(6, entity.getClassification());
            return ps.executeUpdate();
        }
    }
    //public class SensorDAO extends GeneralDAO<Sensor> {

    @Override
    public final int delete(final Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(DELETE)) {
            ps.setInt(1, id);
            return ps.executeUpdate();
        }
        //public final Class<Sensor> getClazz() {
        //return Sensor.class;
    }
}
