/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cars_tw.service;

import cars_tw.entity.Autos;
import java.util.List;

/**
 *
 * @author labso21
 */
public interface IAutosService {

    public void insertarRegistro(Autos auto);

    public void actualizarRegistro(Autos auto);

    public void eliminarRegistro(Autos auto);

    public List<Autos> obtenerRegistros();
}
