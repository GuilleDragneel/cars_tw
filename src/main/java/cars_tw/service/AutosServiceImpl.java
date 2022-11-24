/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cars_tw.service;

import cars_tw.entity.Autos;
import cars_tw.model.AutosModelImpl;
import cars_tw.model.IAutosModel;
import java.util.List;

/**
 *
 * @author labso21
 */
public class AutosServiceImpl implements IAutosService{
    IAutosModel model = new AutosModelImpl();
    
    @Override
    public void insertarRegistro(Autos auto) {
        model.insertarRegistro(auto);
    }

    @Override
    public void actualizarRegistro(Autos auto) {
        model.actualizarRegistro(auto);
    }

    @Override
    public void eliminarRegistro(Autos auto) {
        model.eliminarRegistro(auto);
    }

    @Override
    public List<Autos> obtenerRegistros() {
        return model.obtenerRegistros();
    }
    
}
