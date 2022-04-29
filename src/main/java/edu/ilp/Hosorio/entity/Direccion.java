package edu.ilp.Hosorio.entity;

import javax.persistence.*;

@Entity
@Table(name = "direccion")

public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="calle")
    private String calle;

    @Column(name="ciudad")
    private String ciudad;

    @Column(name="estado")
    private String estado;

    @Column(name="codigoPostal")
    private String codigoPostal;

    @Column(name="pais")
    private String pais;

    public long getId() {
        return id;
    }
    public void setId (long id){
        this.id=id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString(){
        return
                "id="+id+
                        ",calle='"+calle+'\''+
                        ",ciudad='"+ciudad+'\''+
                        ",estado='"+estado+'\''+
                        ",codigoPostal='"+codigoPostal+'\''+
                        ",pais='"+pais+'\'';

    }
}
