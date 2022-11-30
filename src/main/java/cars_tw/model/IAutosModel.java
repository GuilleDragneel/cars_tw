/**
 * Autor: Guillermo Daniel Cruz Ortega
 * Creación: 22/11/2022
 * Actualización: 29/11/2022
 * Descripción: Interface de IAutosModel
 */
package cars_tw.model;

import cars_tw.entity.Autos;
import java.util.List;
/**
 * 
 * Definición de la interface IAutosModel
 */
public interface IAutosModel {
    /**
     * 
     * @param auto : Definición método para insertar registro
     */
    public void insertarRegistro(Autos auto);
    /**
     * 
     * @param auto : Definición método para actualizar registro
     */
    public void actualizarRegistro(Autos auto);
    /**
     * 
     * @param auto : Definición método para eliminar registro
     */
    public void eliminarRegistro(Autos auto);
    /**
     * 
     * @return Método que devuelve una lista con registros
     */
    public List<Autos> obtenerRegistros();

}
