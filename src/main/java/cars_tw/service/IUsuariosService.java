/**
 * Autor: Jazziel Pérez Hernández
 * Creación: 22/11/2022
 * Actualización: 30/11/2022
 * Descripción:Interface IUsuariosService
 */
package cars_tw.service;

import cars_tw.entity.Usuarios;
import java.util.List;

/**
 *
 * Definición Interface IUsuariosService
 */
public interface IUsuariosService {

    /**
     *
     * @param user : Definición método para insertar registro
     */
    public void insertarRegistro(Usuarios user);

    /**
     *
     * @param user : Definición método para actualizar registro
     */
    public void actualizarRegistro(Usuarios user);

    /**
     *
     * @param user : Definición método para eliminar registro
     */
    public void eliminarRegistro(Usuarios user);

    /**
     *
     * @return Método que devuelve una lista con registros
     */
    public List<Usuarios> obtenerRegistros();
}
