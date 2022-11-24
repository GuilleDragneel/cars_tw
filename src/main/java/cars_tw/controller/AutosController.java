/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

@RequestScoped
@ManagedBean(name = "car")
public class AutosController {

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
        System.out.println("guardardado");
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
        FacesMessage mensaje = new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }

    public void eliminarRegistro(Autos autos) {
        service.eliminarRegistro(autos);
        System.out.println("Eliminando...");
    }

}
