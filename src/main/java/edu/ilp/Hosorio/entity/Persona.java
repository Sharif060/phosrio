package edu.ilp.Hosorio.entity;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="telefono")
    private String telefono;

    @Column(name="email")
    private String email;

    public long getId() {
        return id;
    }
    public void setId (long id){
        this.id=id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return
                "id="+id+
                        ",nombre='"+nombre+'\''+
                        ",telefono='"+telefono+'\''+
                        ",email='"+email+'\'';
    }
}
