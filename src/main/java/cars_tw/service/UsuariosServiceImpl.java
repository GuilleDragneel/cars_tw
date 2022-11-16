package cars_tw.service;

import cars_tw.entity.Usuarios;
import cars_tw.model.IUsuariosModel;
import cars_tw.model.UsuariosModelImpl;
import java.util.List;

public class UsuariosServiceImpl implements  IUsuariosService{

    IUsuariosModel model = new UsuariosModelImpl();
    
    @Override
    public void insertarRegistro(Usuarios user) {
        model.insertarRegistro(user);
    }

    @Override
    public List<Usuarios> obtenerRegistros() {
        return model.obtenerRegistros();
    }

   
}
