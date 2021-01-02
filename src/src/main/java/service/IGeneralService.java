package src.main.java.service;


import src.main.java.DAO.IGeneralDAO;

import java.sql.SQLException;
import java.util.List;

public interface IGeneralService<T> {
    IGeneralDAO<T, Integer> getDAO();
    //IGeneralDAO<T> getDAO();

    List<T> getAll() throws SQLException;

    T getById(Integer id) throws SQLException;

    int create(T entity) throws SQLException;

    int update(T entity) throws SQLException;

    int delete(Integer id) throws SQLException;

    /*
    List<T> getAll(Session session) throws SQLException;

    T getById(Integer id, Session session) throws SQLException;

    void create(T entity, Session session) throws SQLException;

    void update(T entity, Session session) throws SQLException;

    void delete(Integer id, Session session) throws SQLException;

     */

}