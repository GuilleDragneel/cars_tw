/**
 * Autor: Jazziel Pérez Hernández
 * Creación: 22/11/2022
 * Actualización: 01/12/2022
 * Descripción: Clase UsuariosController
 */
package cars_tw.controller;

import cars_tw.entity.Usuarios;
import cars_tw.service.IUsuariosService;
import cars_tw.service.UsuariosServiceImpl;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 * Definición se nombra en bean como user para instanciarlos y poder llamar a
 * los métodos getters y setter al igual que controlar el ciclo de vida
 */
@RequestScoped
@ManagedBean(name = "user")
public class UsuariosController implements Serializable {

    /**
     * Se declaran 2 objetos de IUsuariosService y Usuarios al igual que una
     * lista de objetos Usuarios
     */
    private IUsuariosService service;
    private Usuarios usuarios;
    private List<Usuarios> listaRegistros;

    /**
     *método que inicializa los artibutos de la clase
     */
    @PostConstruct
    public void init() {
        service = new UsuariosServiceImpl();
        usuarios = new Usuarios();
        listaRegistros = service.obtenerRegistros();
    }

    /**
     *método para insertar registro
     */
    public void crearRegistro() {
        service.insertarRegistro(usuarios);
        listaRegistros = service.obtenerRegistros();
    }

    /**
     *
     * @return metodo get de usuarios
     */
    public Usuarios getUsuarios() {
        return usuarios;
    }

    /**
     *
     * @param usuarios metodo set de usuarios
     */
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    /**
     *
     * @return metodo get de listaRegistros
     */
    public List<Usuarios> getListaRegistros() {
        return listaRegistros;
    }

    /**
     *
     * @param event método para actualizar registro.
     */
    public void onRowEdit(RowEditEvent event) {
        usuarios = (Usuarios) event.getObject();
        service.actualizarRegistro(usuarios);
        listaRegistros = service.obtenerRegistros();
        FacesMessage mensaje
                = new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().
                addMessage(null, mensaje);
    }

    /**
     *
     * @param usuarios método para eliminar registro
     */
    public void eliminarRegistro(Usuarios usuarios) {
        service.eliminarRegistro(usuarios);
        listaRegistros = service.obtenerRegistros();
    }

    /**
     *Metodo para eliminar el contenido del objeto autos
     */
    public void limpiar() {
        this.usuarios = new Usuarios();
    }
}
