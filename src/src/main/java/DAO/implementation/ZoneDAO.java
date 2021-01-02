package src.main.java.DAO.implementation;


import src.main.java.DAO.IGeneralDAO;
import src.main.java.model.implementation.Zone;
import src.main.java.persistance.ConnectionManager;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ZoneDAO implements IGeneralDAO<Zone, Integer> {

    private static final String GET_ALL = "SELECT * FROM laboratorna4.zone";
    private static final String GET_BY_ID = "SELECT * FROM laboratorna4.zone WHERE id=?";
    private static final String CREATE = "INSERT laboratorna4.zone"
            + "(id, quantity_rooms, level_range) VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE laboratorna4.zone"
            + " SET quantity_rooms=?, level_range=? WHERE id=?";
    private static final String DELETE = "DELETE FROM laboratorna4.zone WHERE id=?";

    @Override
    public final List<Zone> getAll() throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        List<Zone> zones = new LinkedList<>();

        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(GET_ALL)) {
                while (resultSet.next()) {
                    Integer id = resultSet.getInt(1);
                    int quantityRooms = resultSet.getInt(2);
                    double levelRange = resultSet.getDouble(3);
                    zones.add(new Zone(id, quantityRooms, levelRange));
                }
            }
        }
        return zones;
    }

    @Override
    public final Zone getById(final Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        Zone zone = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Integer foundId = resultSet.getInt(1);
                    int quantityRooms = resultSet.getInt(2);
                    double levelRange = resultSet.getDouble(3);
                    zone = new Zone(foundId, quantityRooms, levelRange);
                }
            }
        }

        return zone;
    }

    @Override
    public final int create(final Zone entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(CREATE)) {
            ps.setInt(1, entity.getId());
            ps.setInt(2, entity.getQuantityRooms());
            ps.setDouble(3, entity.getLevelRange());
            return ps.executeUpdate();
        }
    }

    @Override
    public final int update(final Zone entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(UPDATE)) {
            ps.setInt(1, entity.getId());
            ps.setInt(2, entity.getQuantityRooms());
            ps.setDouble(3, entity.getLevelRange());
            return ps.executeUpdate();
        }
    }
    //public class ZoneDAO extends GeneralDAO<Zone> {

    @Override
    public final int delete(final Integer id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement ps = connection.prepareStatement(DELETE)) {
            ps.setInt(1, id);
            return ps.executeUpdate();
        }
        //public final Class<Zone> getClazz() {
        //return Zone.class;
    }
}