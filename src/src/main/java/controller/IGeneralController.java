package src.main.java.controller;


import src.main.java.service.IGeneralService;

import java.sql.SQLException;

public interface IGeneralController<T> {

    void create(T entity) throws SQLException;

    void update(T entity) throws SQLException;

    void delete(int id) throws SQLException;

    void getAll() throws SQLException;

    void getById(int id) throws SQLException;

    /*
    void create(T entity, Session session) throws SQLException;

    void update(T entity, Session session) throws SQLException;

    void delete(int id, Session session) throws SQLException;

    void getAll(Session session) throws SQLException;

    void getById(int id, Session session) throws SQLException;
    */

    IGeneralService<T> getService();

}
