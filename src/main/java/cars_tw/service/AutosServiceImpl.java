/**
 * Autor: Jazziel Pérez Hernández
 * Creación: 22/11/2022
 * Actualización: 30/11/2022
 * Descripción: Clase AutosServiceImpl
 */
package cars_tw.service;

import cars_tw.entity.Autos;
import cars_tw.model.AutosModelImpl;
import cars_tw.model.IAutosModel;
import java.util.List;

/**
 *
 * Clase de AutosServiceImpl implementando IAutosService
 */
public class AutosServiceImpl implements IAutosService {

    /**
     * Se crea un objeto de IAutosModel
     */
    IAutosModel model = new AutosModelImpl();

    /**
     *
     * @param auto : Método encargado de insertar registros
     */
    @Override
    public void insertarRegistro(Autos auto) {
        model.insertarRegistro(auto);
    }

    /**
     *
     * @return: Método encargado de obtener registros por medio de una lista
     */
    @Override
    public void actualizarRegistro(Autos auto) {
        model.actualizarRegistro(auto);
    }

    /**
     *
     * @param auto : Método encargado de actualizar un registro
     */
    @Override
    public void eliminarRegistro(Autos auto) {
        model.eliminarRegistro(auto);
    }

    /**
     *
     * @param: Método encargado de eliminar un registro
     */
    @Override
    public List<Autos> obtenerRegistros() {
        return model.obtenerRegistros();
    }

}
