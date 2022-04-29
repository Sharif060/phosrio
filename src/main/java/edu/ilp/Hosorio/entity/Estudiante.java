package edu.ilp.Hosorio.entity;

import sun.security.mscapi.CPublicKey;

import javax.persistence.*;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name="serie")
    private String serie;

    public long getId() {
        return id;
    }
    public void setId (long id){
        this.id=id;
    }

    public String getCodigo(){return codigo;}

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getSerie(){return serie;}

    public void setSerie(String serie) {
        this.serie = serie;
    }
    @Override
    public String toString(){
        return
                "id="+id+
                        ",codigo='"+codigo+'\''+
                        ",serie='"+serie+'\'';
    }
}
