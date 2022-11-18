package cars_tw.model;

import cars_tw.entity.Usuarios;
import java.util.List;

public interface IUsuariosModel {

    public void insertarRegistro(Usuarios user);

    public void actualizarRegistro(Usuarios user);
    
    public void eliminarRegistro(Usuarios user);

    public List<Usuarios> obtenerRegistros();
}
