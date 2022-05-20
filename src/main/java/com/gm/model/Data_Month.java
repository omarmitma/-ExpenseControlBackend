package com.gm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Data_Month {
    
    private int id;
    private String mes;
    private double monto;
    private double gasto;

}
