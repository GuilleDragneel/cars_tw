/**
 * Autor: Jazziel Pérez Hernández
 * Creación: 22/11/2022
 * Actualización: 30/11/2022
 * Descripción: Clase UsuariosServiceImpl
 */
package cars_tw.service;

import cars_tw.entity.Usuarios;
import cars_tw.model.IUsuariosModel;
import cars_tw.model.UsuariosModelImpl;
import java.util.List;

/**
 *
 * Clase de UsuariosServiceImpl implementando IUsuariosService
 */
public class UsuariosServiceImpl implements IUsuariosService {

    /**
     * Se crea un objeto de IUsuariosModel
     */
    IUsuariosModel model = new UsuariosModelImpl();

    /**
     *
     * @param user : Método encargado de insertar registros
     */
    
    @Override
    public void insertarRegistro(Usuarios user) {
        model.insertarRegistro(user);
    }

    /**
     *
     * @return Método encargado de obtener registros por medio de una lista
     */
    @Override
    public List<Usuarios> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    /**
     *
     * @param user : Método encargado de actualizar un registro
     */
    @Override
    public void actualizarRegistro(Usuarios user) {
        model.actualizarRegistro(user);
    }

    /**
     *
     * @param user : Método encargado de eliminar un registro
     */
    @Override
    public void eliminarRegistro(Usuarios user) {
        model.eliminarRegistro(user);
    }
}
