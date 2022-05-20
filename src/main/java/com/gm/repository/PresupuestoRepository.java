package com.gm.repository;

import com.gm.model.Data_Month;
import com.gm.model.Presupuesto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface PresupuestoRepository extends JpaRepository<Presupuesto, Integer>{
    @Procedure
    void Add_Presupuesto_Mensual(String mes, double monto);
    
    /*Ponemos Presupuesto que es la clase con ese nombre que creamos en ves de presupuestoMensual que es la tabla */
    @Query("SELECT new com.gm.model.Data_Month(p.id,p.mes, p.monto, SUM(g.gasto) as gasto) FROM Presupuesto as p inner join Gastos as g on g.idpresupuesto = p.id GROUP BY p.id,p.mes,p.monto")
    List<Data_Month> Get_Data_Month();
    
    @Procedure
    List<Presupuesto> Find_Month(String mes);
    
    @Procedure
    void Add_More_Presupuesto(int id, double monto);
}
