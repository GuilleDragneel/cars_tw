/**
 * Autor: Guillermo Daniel Cruz Ortega
 * Creación: 22/11/2022
 * Actualización: 29/11/2022
 * Descripción: Clase creada a partir de la base de datos de autos
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Definición de la entidad y asignación de nombre
 */
@Entity
@Table(name = "autos")
@XmlRootElement
@NamedQueries({
/**
 * Seleccion de autos
 */
    @NamedQuery(name = "Autos.findAll", 
            query = "SELECT a FROM Autos a"),
/**
 * Seleccion del id de autos
 */
    @NamedQuery(name = "Autos.findById", 
            query = "SELECT a FROM Autos a WHERE a.id = :id"),
/**
 * Seleccion del modelo de autos
 */
    @NamedQuery(name = "Autos.findByModelo", 
            query = "SELECT a FROM Autos a WHERE a.modelo = :modelo"),
/**
 * Seleccion de la marca de autos
 */
    @NamedQuery(name = "Autos.findByMarca", 
            query = "SELECT a FROM Autos a WHERE a.marca = :marca"),
/**
 * Seleccion de las placas de autos
 */
    @NamedQuery(name = "Autos.findByPlacas", 
            query = "SELECT a FROM Autos a WHERE a.placas = :placas"),
/**
 * Seleccion del precio de autos
 */
    @NamedQuery(name = "Autos.findByPrecio", 
            query = "SELECT a FROM Autos a WHERE a.precio = :precio"),
/**
 * Seleccion de la descripción de autos
 */
    @NamedQuery(name = "Autos.findByDescripcion", 
           query = "SELECT a FROM Autos a WHERE a.descripcion = :descripcion")})

/**
 * Clase autos que incluye los Métodos de los atributos de la tabla
 */
public class Autos implements Serializable {
    /**
     * Definición del campo id
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    /**
     * Definición del campo modelo
     */
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 2147483647)
    /**
     * Definición del campo marca
     */
    @Column(name = "marca")
    private String marca;
    @Size(max = 2147483647)
    /**
     * Definición del campo placas
     */
    @Column(name = "placas")
    private String placas;
    /**
     * Definición del campo precio
     */
    @Column(name = "precio")
    private Double precio;
    @Size(max = 2147483647)
    /**
     * Definición del campo descripcion
     */
    @Column(name = "descripcion")
    private String descripcion;
    /**
     * Constructor vacio
     */
    public Autos() {
    }

    /**
     * 
     * @param id : Constructor inicializado con id
     */
    public Autos(Integer id) {
        this.id = id;
    }
    /**
     * 
     * @return Método getId donde devuelve id
     */
    public Integer getId() {
        return id;
    }
    /**
     * 
     * @param id : setId donde setea id al método autos
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * 
     * @return Método getModel donde devuelve model
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * 
     * @param modelo : setModelo donde setea modelo al método autos
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * 
     * @return Método getMarca donde devuelce marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * 
     * @param marca : setMarca donde setea marca al método autos
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * 
     * @return Método getPlacas donde devuelce placas
     */
    public String getPlacas() {
        return placas;
    }
    /**
     * 
     * @param placas : setPlacas donde setea placas al método autos
     */
    public void setPlacas(String placas) {
        this.placas = placas;
    }
    /**
     * 
     * @return Método getPrecio donde devuelce precio
     */
    public Double getPrecio() {
        return precio;
    }
    /**
     * 
     * @param precio : setPrecio donde setea precio al método autos
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    /**
     * 
     * @return Método getDescripcion donde devuelce descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * 
     * @param descripcion : setDescripcion donde setea descripcion al método 
     * autos
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * 
     * @return Método que devuelve hash
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    /**
     * 
     * @param object : Método que recibe un object y lo ocupa para conpaciones
     * @return Devuelve un valor booleano
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Autos)) {
            return false;
        }
        Autos other = (Autos) object;
        if ((this.id == null && other.id != null) || 
                (this.id != null && !this.id.equals(other.id))) {
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
        return "cars_tw.entity.Autos[ id=" + id + " ]";
    }
    
}
