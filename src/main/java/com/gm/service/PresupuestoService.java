package com.gm.service;

import com.gm.model.Data_Month;
import com.gm.model.Presupuesto;
import com.gm.repository.PresupuestoRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PresupuestoService {
    @Autowired
    PresupuestoRepository repository;
    
    public List<Data_Month> Get_Data_Month(){
        return repository.Get_Data_Month();
    }
    
    public void Add_Presupuesto_Mensual(Presupuesto presupuesto) {
        repository.Add_Presupuesto_Mensual(presupuesto.getMes(),presupuesto.getMonto());
    }
    
    public void Add_More_Presupuesto(Presupuesto presupuesto){
        repository.Add_More_Presupuesto(presupuesto.getId(),presupuesto.getMonto());
    }
    
    public List<Presupuesto> Find_Month(String mes){
        return repository.Find_Month(mes);
    }
}
