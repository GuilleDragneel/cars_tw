/**
 * Autor: Guillermo Daniel Cruz Ortega
 * Creación: 22/10/2022
 * Actualización: 29/10/2022
 * Descripción: Interface de UsuariosModelImpl
 */
package cars_tw.model;

import cars_tw.entity.Usuarios;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * 
 * Clase de UsuariosModelImpl implementando IUsuariosModel
 */
public class UsuariosModelImpl implements IUsuariosModel {
    /**
     * Se incializan variables de sesión
     */
    private SessionFactory sf;
    private Session sesion;
    /**
     * 
     * @param user : Método encargado de insertar registros
     */
    @Override
    public void insertarRegistro(Usuarios user) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.save(user);
            sesion.getTransaction().commit();
            sesion.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    /**
     * 
     * @return  Método encargado de obtener registros por medio de una lista
     */
    @Override
    public List<Usuarios> obtenerRegistros() {
        List<Usuarios> listaUsuarios = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            listaUsuarios = sesion.createCriteria(Usuarios.class).list();
            sesion.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
        return listaUsuarios;
    }
    /**
     * 
     * @param user : Método encargado de actualizar un registro
     */
    @Override
    public void actualizarRegistro(Usuarios user) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.update(user);
            sesion.getTransaction().commit();
            sesion.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    /**
     * 
     * @param user : Método encargado de eliminar un registro
     */
    @Override
    public void eliminarRegistro(Usuarios user) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.delete(user);
            sesion.getTransaction().commit();
            sesion.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
