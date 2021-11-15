
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sergi
 */
@Entity
public class Perro implements Serializable {

    
     // Se designa una primary key la cual se generara automaticamente para evitar un error humano a futuro
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String numCliente;
    private String nombrePerro;
    private String raza;
    private String color;
    private boolean alergico;
    private boolean atenEspecial;
    private String nombreDuenio;
    private String celularDuenio;
    private String observaciones;

    public Perro() {
    }

    //En el contructor no se pide la id, debido que es la base de datos la que la asignara
    public Perro(String numCliente, String nombrePerro, String raza, String color, boolean alergico, boolean atenEspecial, String nombreDuenio, String celularDuenio, String observaciones) {
        this.numCliente = numCliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atenEspecial = atenEspecial;
        this.nombreDuenio = nombreDuenio;
        this.celularDuenio = celularDuenio;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtenEspecial() {
        return atenEspecial;
    }

    public void setAtenEspecial(boolean atenEspecial) {
        this.atenEspecial = atenEspecial;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getCelularDuenio() {
        return celularDuenio;
    }

    public void setCelularDuenio(String celularDuenio) {
        this.celularDuenio = celularDuenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "-----------------------------------------" + "\nPerro" + "\nid=" + id + "\nnumCliente=" + numCliente + "\nnombrePerro=" + nombrePerro + "/nraza=" + raza + "\ncolor=" + color + "\nalergico=" + alergico + "\natenEspecial=" + atenEspecial + "\nnombreDuenio=" + nombreDuenio + "\ncelularDuenio=" + celularDuenio + "\nobservaciones=" + observaciones + "\n-----------------------------------------";
    }

}
