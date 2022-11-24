package cars_tw.model;

import cars_tw.entity.Autos;
import java.util.List;

public interface IAutosModel {

    public void insertarRegistro(Autos auto);

    public void actualizarRegistro(Autos auto);

    public void eliminarRegistro(Autos auto);

    public List<Autos> obtenerRegistros();

}
