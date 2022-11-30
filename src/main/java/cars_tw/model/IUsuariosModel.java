/**
 * Autor: Guillermo Daniel Cruz Ortega
 * Creación: 22/11/2022
 * Actualización: 29/11/2022
 * Descripción: Interface de IUsuariosModel
 */
package cars_tw.model;

import cars_tw.entity.Usuarios;
import java.util.List;
/**
 * 
 * Definición de la interface IUsuariosModel
 */
public interface IUsuariosModel {
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
