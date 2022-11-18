package cars_tw.model;

import cars_tw.entity.Usuarios;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UsuariosModelImpl implements IUsuariosModel {

    private SessionFactory sf;
    private Session sesion;

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
//    public static void main(String[] args) {
//        IUsuariosModel model = new UsuariosModelImpl();
//        Usuarios user = new Usuarios();
//        user.setNombre("dos");
//        model.insertarRegistro(user);
//        List<Usuarios> listauser = model.obtenerRegistros();
//
//        System.out.println(listauser.size());
//    }
}
