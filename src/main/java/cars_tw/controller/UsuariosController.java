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
        System.out.println("guardardado");
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
    
    public void onRowEdit(RowEditEvent event, Usuarios usuarios){
        //System.out.println(usuarios.getIdUser());
        //System.out.println(usuarios.getNombre());
        service.actualizarRegistro(usuarios);
        FacesMessage mensaje = new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
    
    
}
