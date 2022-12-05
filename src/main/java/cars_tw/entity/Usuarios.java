/**
 * Autor: Guillermo Daniel Cruz Ortega
 * Creación: 22/11/2022
 * Actualización: 29/11/2022
 * Descripción: Clase creada a partir de la base de datos de usuarios
 */
package cars_tw.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * Definición de la entidad y asignación de nombre
 */
@Entity
@Table(name = "usuarios")
@javax.xml.bind.annotation.XmlRootElement
@NamedQueries({
/**
  * Seleccion de usuarios
  */
    @NamedQuery(name = "Usuarios.findAll", 
            query = "SELECT u FROM Usuarios u"),
    /**
     * Seleccion del id de usuarios
     */
    @NamedQuery(name = "Usuarios.findByIdUser", 
            query = "SELECT u FROM Usuarios u WHERE u.idUser = :idUser"),
    /**
     * Seleccion de la contraseña usuarios
     */
    @NamedQuery(name = "Usuarios.findByContrase\u00f1a", 
 query = "SELECT u FROM Usuarios u WHERE u.contrase\u00f1a = :contrase\u00f1a"),
    /**
     * Seleccion del nombre usuarios
     */
    @NamedQuery(name = "Usuarios.findByNombre", 
            query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre"),
    /**
     * Seleccion del rol de usuario
     */
    @NamedQuery(name = "Usuarios.findByRol", 
            query = "SELECT u FROM Usuarios u WHERE u.rol = :rol")})
/**
  * Seleccion del id de usuarios
  */
public class Usuarios implements Serializable {
    /**
     * Definición del campo id
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user")
    private Integer idUser;
    @Size(max = 255)
    /**
     * Definición del campo contraseña
     */
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    @Size(max = 255)
    /**
     * Definición del campo nombre
     */
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    /**
     * Definición del campo rol
     */
    @Column(name = "rol")
    private String rol;
    /**
     * Constructor vacio
     */
    public Usuarios() {
    }
    /**
     * 
     * @param idUser : Constructor inicializado con idUser
     */
    public Usuarios(Integer idUser) {
        this.idUser = idUser;
    }
    /**
     * 
     * @return Método getIdUser donde devuelve idUser
     */
    public Integer getIdUser() {
        return idUser;
    }
    /**
     * 
     * @param idUser : setId donde setea id al método usuarios
     */
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    /**
     * 
     * @return Método getContraseña donde devuelve contraseña
     */
    public String getContraseña() {
        return contraseña;
    }
    /**
     * 
     * @param contraseña : setContraseña donde setea contraseña al método
     * usuarios
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    /**
     * 
     * @return Método getNombre donde devuelve nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre : setNombre donde setea nombre al método usuarios
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return Método getRol donde devuelve rol 
     */
    public String getRol() {
        return rol;
    }
    /**
     * 
     * @param rol : setRol donde setea rol al método usuarios
     */
    public void setRol(String rol) {
        this.rol = rol;
    }
    /**
     * 
     * @return Método que devuelve hash
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }
    /**
     * 
     * @param object : Método que recibe un object y lo ocupa para
     * @return Devuelve un valor booleano
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUser == null && other.idUser != null) ||
               (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }
    /**
     * 
     * @return Método que devuelve un String
     */
    @Override
    public String toString() {
        return "cars_tw.entity.Usuarios[ idUser=" + idUser + " ]";
    }
    
}
