/**
 * Autor: Guillermo Daniel Cruz Ortega
 * Creación: 22/11/2022
 * Actualización: 29/11/2022
 * Descripción: Clase AutosModelImpl
 */
package cars_tw.model;

import cars_tw.entity.Autos;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * 
 * Clase de AutosModelImpl implementando IAutosModel
 */
public class AutosModelImpl implements IAutosModel  {
    /**
     * Se incializan variables de sesión
     */
    private SessionFactory sf;
    private Session sesion;
    /**
     * 
     * @param auto : Método encargado de insertar registros
     */
    @Override
    public void insertarRegistro(Autos auto) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.save(auto);
            sesion.getTransaction().commit();
            sesion.close();
            sf.close();
        } catch (HibernateException e) {
        }
    }
    /**
     * 
     * @return Método encargado de obtener registros por medio de una lista
     */
    @Override
    public List<Autos> obtenerRegistros() {
        List<Autos> listaUsuarios = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            listaUsuarios = sesion.createCriteria(Autos.class).list();
            sesion.close();
            sf.close();
        } catch (HibernateException e) {
        }
        return listaUsuarios;
    }
    /**
     * 
     * @param auto : Método encargado de actualizar un registro
     */
    @Override
    public void actualizarRegistro(Autos auto) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.update(auto);
            sesion.getTransaction().commit();
            sesion.close();
            sf.close();
        } catch (HibernateException e) {
        }
    }
    /**
     * 
     * @param auto : Método encargado de eliminar un registro
     */
    @Override
    public void eliminarRegistro(Autos auto) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.delete(auto);
            sesion.getTransaction().commit();
            sesion.close();
            sf.close();
        } catch (HibernateException e) {
        }
    }
}
