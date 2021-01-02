package src.main.java.service.implementation;


import src.main.java.DAO.IGeneralDAO;
import src.main.java.service.IGeneralService;

import java.sql.SQLException;
import java.util.List;

public abstract class GeneralService<T> implements IGeneralService<T> {

    @Override
    public abstract IGeneralDAO<T, Integer> getDAO();
    // public abstract IGeneralDAO<T> getDAO();

    @Override
    public final List<T> getAll() throws SQLException {
        return getDAO().getAll();
        //  public List<T> getAll(Session session) throws SQLException {
        //  return getDAO().getAll(session);
    }

    @Override
    public final T getById(final Integer id) throws SQLException {
        return getDAO().getById(id);
        // public T getById(Integer id, Session session) throws SQLException {
        // return (T) getDAO().getById(id, session);
    }

    @Override
    public final int create(final T entity) throws SQLException {
        return getDAO().create(entity);
        //  public void create(T entity, Session session) throws SQLException {
        //  getDAO().create(entity, session);
    }

    @Override
    public final int update(final T entity) throws SQLException {
        return getDAO().update(entity);
        //  public void update(T entity, Session session) throws SQLException {
        //  getDAO().update(entity, session);
    }

    @Override
    public final int delete(final Integer id) throws SQLException {
        return getDAO().delete(id);
        //  public void delete(Integer id, Session session) throws SQLException {
        //  getDAO().delete(id, session);
    }

}
