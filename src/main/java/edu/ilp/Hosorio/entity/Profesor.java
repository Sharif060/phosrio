package edu.ilp.Hosorio.entity;

import javax.persistence.*;

@Entity
@Table(name = "profesor")

public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="salario")
    private String salario;

    public long getId() {
        return id;
    }
    public void setId (long id){
        this.id=id;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return
                "id="+id+
                        ",salario='"+salario+'\'';
    }
}
