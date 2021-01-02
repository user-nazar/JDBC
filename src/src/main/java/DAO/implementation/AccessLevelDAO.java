package src.main.java.DAO.implementation;




import src.main.java.DAO.IGeneralDAO;
import src.main.java.model.implementation.AccessLevel;
import src.main.java.persistance.ConnectionManager;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class AccessLevelDAO implements IGeneralDAO<AccessLevel, Integer> {

    private static final String GET_ALL = "SELECT * FROM laboratorna4.access_level";
    private static final String GET_BY_ID = "SELECT * FROM  laboratorna4.access_level WHERE id=?";
    private static final String CREATE = "INSERT laboratorna4.access_level"
            + "(id, range_sensor, resolution) VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE laboratorna4.access_level"
            + " SET range_sensor=?, resolution=? WHERE id=?";
    private static final String DELETE = "DELETE FROM laboratorna4.access_level WHERE id=?";

    @Override
    public final List<AccessLevel> getAll() throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        List<AccessLevel> accessLevels = new LinkedList<>();

        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(GET_ALL)) {
                while (resultSet.next()) {
                    Integer id = resultSet.getInt(1);
                    double rangeSensor = resultSet.getDouble(2);
                    double resolution = resultSet.getDouble(3);
                    accessLevels.add(new AccessLevel(id, rangeSensor, resolution));
                }
            }
        }
        return accessLevels;
    }

    @Override
    public final AccessLevel getById(final Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        AccessLevel accessLevel = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Integer foundId = resultSet.getInt(1);
                    double range = resultSet.getDouble(2);
                    double resolution = resultSet.getDouble(3);
                    accessLevel = (new AccessLevel(foundId, range, resolution));
                }
            }
        }

        return accessLevel;
    }

    @Override
    public final int create(final AccessLevel entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, entity.getId());
            ps.setDouble(2, entity.getRangeSensor());
            ps.setDouble(3, entity.getResolution());
            return ps.executeUpdate();
        }
    }
    //public class AccessLevelDAO extends GeneralDAO<AccessLevel> {

    @Override
    public final int update(final AccessLevel entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setInt(1, entity.getId());
            ps.setDouble(2, entity.getRangeSensor());
            ps.setDouble(3, entity.getResolution());
            return ps.executeUpdate();
        }
    }
    //public final Class<AccessLevel> getClazz() {
        //return AccessLevel.class;

    @Override
    public final int delete(final Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(DELETE)) {
            ps.setInt(1, id);
            return ps.executeUpdate();
        }
    }
}
