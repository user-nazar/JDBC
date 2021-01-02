package src.main.java.controller.implementation;


import src.main.java.controller.IGeneralController;
import src.main.java.model.IGeneralModel;
import src.main.java.service.implementation.GeneralService;

import java.sql.SQLException;
import java.util.List;


public abstract class GeneralController<T extends IGeneralModel> implements IGeneralController<T> {

    @Override
    public abstract GeneralService<T> getService();
    //public abstract IGeneralService<T> getService();

    @Override
    public final void create(final T entity) throws SQLException {
        getService().create(entity);
        //public final void create(final T entity, final Session session) throws SQLException {
            //getService().create(entity, session);
        System.out.println("Entity has been created now");
        System.out.println(entity);
    }

    @Override
    public final void update(final T entity) throws SQLException {
        getService().update(entity);
        //public final void update(final T entity, final Session session) throws SQLException {
            //getService().update(entity, session);
        System.out.println("Entity has been updated now");
        System.out.println(entity.getId());
        //System.out.println(entity);
    }

    @Override
    public final void delete(final int id) throws SQLException {
        getService().delete(id);
        //public final void delete(final int id, final Session session) throws SQLException {
            //getService().delete(id, session);
        System.out.println("Entity has been deleted now");
    }

    @Override
    public final void getAll() throws SQLException {
        List<T> ts =  getService().getAll();
        for (T t: ts) {
            //public final void getAll(final Session session) throws SQLException {
                //List<T> ts = getService().getAll(session);
                //for (T t : ts){
            System.out.println(t);
        }
    }

    @Override
    public final void getById(final int id) throws SQLException {
        T t = getService().getById(id);
        //public final void getById(final int id, final Session session) throws SQLException {
            //T t = getService().getById(id, session);
        if (t != null) {
            System.out.println("Entity with id " + id + " found");
            System.out.println(t);
        } else {
            System.out.println("Entity with id " + id + " not found");
        }
    }
}
