/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 *
 * @author labso03
 */
@Entity
@Table(name = "autos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autos.findAll", query = "SELECT a FROM Autos a"),
    @NamedQuery(name = "Autos.findById", query = "SELECT a FROM Autos a WHERE a.id = :id"),
    @NamedQuery(name = "Autos.findByModelo", query = "SELECT a FROM Autos a WHERE a.modelo = :modelo"),
    @NamedQuery(name = "Autos.findByMarca", query = "SELECT a FROM Autos a WHERE a.marca = :marca"),
    @NamedQuery(name = "Autos.findByPlacas", query = "SELECT a FROM Autos a WHERE a.placas = :placas"),
    @NamedQuery(name = "Autos.findByPrecio", query = "SELECT a FROM Autos a WHERE a.precio = :precio"),
    @NamedQuery(name = "Autos.findByDescripcion", query = "SELECT a FROM Autos a WHERE a.descripcion = :descripcion")})
public class Autos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 2147483647)
    @Column(name = "marca")
    private String marca;
    @Size(max = 2147483647)
    @Column(name = "placas")
    private String placas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;

    public Autos() {
    }

    public Autos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autos)) {
            return false;
        }
        Autos other = (Autos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cars_tw.entity.Autos[ id=" + id + " ]";
    }
    
}
