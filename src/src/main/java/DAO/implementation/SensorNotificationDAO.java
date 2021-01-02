package src.main.java.DAO.implementation;


import src.main.java.DAO.IGeneralDAO;
import src.main.java.model.implementation.SensorNotification;
import src.main.java.persistance.ConnectionManager;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class SensorNotificationDAO implements IGeneralDAO<SensorNotification, Integer> {

    private static final String GET_ALL = "SELECT * FROM laboratorna4.sensor_notification";
    private static final String GET_BY_ID = "SELECT * FROM laboratorna4.sensor_notification WHERE id=?";
    private static final String CREATE = "INSERT laboratorna4.sensor_notification"
            + "(id, range_level, resolution_level, system_id) VALUES (?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE laboratorna4.sensor_notification"
            + " SET range_level=?, resolution_level=?, system_id=? WHERE id=?";
    private static final String DELETE = "DELETE FROM laboratorna4.sensor_notification WHERE id=?";

    @Override
    public final List<SensorNotification> getAll() throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        List<SensorNotification> sensorNotifications = new LinkedList<>();

        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(GET_ALL)) {
                while (resultSet.next()) {
                    Integer id = resultSet.getInt(1);
                    double rangeLevel = resultSet.getDouble(2);
                    double resolutionLevel = resultSet.getDouble(3);
                    Integer systemId = resultSet.getInt(4);
                    sensorNotifications.add(new SensorNotification(id, rangeLevel, resolutionLevel, systemId));
                }
            }
        }
        return sensorNotifications;
    }

    @Override
    public final SensorNotification getById(final Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        SensorNotification sensorNotification = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Integer foundId = resultSet.getInt(1);
                    double rangeLevel = resultSet.getDouble(2);
                    double resolutionLevel = resultSet.getDouble(3);
                    Integer systemId = resultSet.getInt(4);
                    sensorNotification = new SensorNotification(foundId, rangeLevel, resolutionLevel, systemId);
                }
            }
        }

        return sensorNotification;
    }

    @Override
    public final int create(final SensorNotification entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, entity.getId());
            ps.setDouble(2, entity.getRangeLevel());
            ps.setDouble(3, entity.getResolutionLevel());
            ps.setInt(4, entity.getSystemId());
            return ps.executeUpdate();
        }
    }

    @Override
    public final int update(final SensorNotification entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setInt(1, entity.getId());
            ps.setDouble(2, entity.getRangeLevel());
            ps.setDouble(3, entity.getResolutionLevel());
            ps.setInt(4, entity.getSystemId());
            return ps.executeUpdate();
        }
    }
    //public class SensorNotificationDAO extends GeneralDAO<SensorNotification> {

    @Override
    public final int delete(final Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(DELETE)) {
            ps.setInt(1, id);
            return ps.executeUpdate();
        }
        //public final Class<SensorNotification> getClazz() {
        //return SensorNotification.class;
    }
}

