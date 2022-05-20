package com.gm.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="gastos")
public class Gastos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Column(name = "idpresupuesto")
    private int idpresupuesto;
    
    @NotNull
    @Column(name = "nombre")
    private String nombre;
    
    @NotNull
    @Column(name = "fecha")
    private String fecha;
    
    @NotNull
    @Column(name = "gasto")
    private double gasto;

    public Gastos() {
    }

    public Gastos(int id, int idpresupuesto, String nombre, String fecha, double gasto) {
        this.id = id;
        this.idpresupuesto = idpresupuesto;
        this.nombre = nombre;
        this.fecha = fecha;
        this.gasto = gasto;
    }
}
