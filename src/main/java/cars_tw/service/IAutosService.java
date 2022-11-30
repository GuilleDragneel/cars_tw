/**
 * Autor: Jazziel Pérez Hernández
 * Creación: 22/11/2022
 * Actualización: 30/11/2022
 * Descripción: Interface IAutosService
 */
package cars_tw.service;

import cars_tw.entity.Autos;
import java.util.List;

/**
 *
 * Definición Interface IAutosService
 */
public interface IAutosService {

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
