/**
 * Autor: Jazziel Pérez Hernández
 * Creación: 22/11/2022
 * Actualización: 30/11/2022
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

    
    private IUsuariosService service;
    private Usuarios usuarios;
    private List<Usuarios> listaRegistros;

    @PostConstruct
    public void init() {
        service = new UsuariosServiceImpl();
        usuarios = new Usuarios();
        listaRegistros = service.obtenerRegistros();
    }

    public void crearRegistro() {
        service.insertarRegistro(usuarios);
        listaRegistros = service.obtenerRegistros();
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuarios> getListaRegistros() {
        return listaRegistros;
    }

    public void onRowEdit(RowEditEvent event) {

        usuarios = (Usuarios) event.getObject();
        //System.out.println(usuarios.getIdUser());
        //System.out.println(usuarios.getNombre());

        service.actualizarRegistro(usuarios);
        FacesMessage mensaje = 
                new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().
                addMessage(null, mensaje);
    }

    public void eliminarRegistro(Usuarios usuarios) {
        service.eliminarRegistro(usuarios);
        listaRegistros = service.obtenerRegistros();
        System.out.println("Eliminando...");
    }

    public void limpiar(){
        this.usuarios= new Usuarios();
    }
}
