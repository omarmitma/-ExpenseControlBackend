package com.gm.model;

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
@Table(name="presupuestomensual")
public class Presupuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Column(name = "mes")
    private String mes;
    
    @NotNull
    @Column(name = "monto")
    private double monto;

    public Presupuesto() {
    }

    public Presupuesto(int id, String mes, double monto) {
        this.id = id;
        this.mes = mes;
        this.monto = monto;
    }
    
    
}
