
package cars_tw.model;

import cars_tw.entity.Autos;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AutosModelImpl implements IAutosModel  {
    private SessionFactory sf;
    private Session sesion;

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
            System.out.println("Error" + e.getMessage());
        }
    }

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
            System.out.println("Error" + e.getMessage());
        }
        return listaUsuarios;
    }

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
            System.out.println("Error" + e.getMessage());
        }
    }
    
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
            System.out.println("Error" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        IAutosModel model = new AutosModelImpl();
        Autos auto = new Autos();
        auto.setMarca("Nissan");
        model.insertarRegistro(auto);
        List<Autos> listauser = model.obtenerRegistros();

        System.out.println(listauser.size());
    }
}
