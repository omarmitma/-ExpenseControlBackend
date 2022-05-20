package com.gm.repository;

import com.gm.model.Gastos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface GastosRepository extends JpaRepository<Gastos, Integer>{
    
    @Procedure
    List<Gastos>Filter_Day(String fecha);
    
    @Procedure
    void Add_Gasto(int idpresupuesto, String nombre, String fecha, double gasto);
}