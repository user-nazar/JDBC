package src.main.java.DAO;

import java.sql.SQLException;
import java.util.List;

public interface IGeneralDAO<T, ID> {
    //public interface IGeneralDAO<T> {

    List<T> getAll() throws SQLException;
    //List<T> getAll(Session session) throws SQLException;

    T getById(ID id) throws SQLException;
    //T getById(Integer id, Session session) throws SQLException;


    int create(T entity) throws SQLException;
    //void create(T entity, Session session) throws SQLException;

    int update(T entity) throws SQLException;
    //void update(T entity, Session session) throws SQLException;


    int delete(ID id) throws SQLException;
    //void delete(Integer id, Session session) throws SQLException;
}
