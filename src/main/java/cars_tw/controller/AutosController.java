/**
 * Autor: Jazziel Pérez Hernández
 * Creación: 22/11/2022
 * Actualización: 30/11/2022
 * Descripción: Clase AutosController
 */
package cars_tw.controller;

import cars_tw.entity.Autos;
import cars_tw.service.AutosServiceImpl;
import cars_tw.service.IAutosService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
/**
 * Definición se nombra en bean como car para instanciarlos y poder llamar a 
 * los métodos getters y setter al igual que controlar el ciclo de vida
 */
@RequestScoped
@ManagedBean(name = "car")
public class AutosController {

    /**
     * Se declaran 2 objetos de IAutosService y Autos al igual que una lista de 
     * objetos Auto  
     */
    private IAutosService service;
    private Autos autos;
    private List<Autos> listaRegistros;

    @PostConstruct
    public void init() {
        service = new AutosServiceImpl();
        autos = new Autos();
        listaRegistros = service.obtenerRegistros();
    }

    public void crearRegistro() {
        service.insertarRegistro(autos);
        listaRegistros = service.obtenerRegistros();
        System.out.println("guardardado exitosamente");
    }

    public void setAutos(Autos autos) {
        this.autos = autos;
    }

    public Autos getAutos() {
        return autos;
    }

    public List<Autos> getListaRegistros() {
        return listaRegistros;
    }

    public void onRowEdit(RowEditEvent event) {
        autos = (Autos) event.getObject();
        service.actualizarRegistro(autos);
        listaRegistros = service.obtenerRegistros();
        FacesMessage mensaje = 
                new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().
                addMessage(null, mensaje);

    }

    public void eliminarRegistro(Autos autos) {
        service.eliminarRegistro(autos);
        listaRegistros = service.obtenerRegistros();
        System.out.println("Eliminando exitosamente...");
    }

     public void limpiar(){
        this.autos= new Autos();
    }
}
