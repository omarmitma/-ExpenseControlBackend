package com.gm.service;

import com.gm.model.Gastos;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.gm.repository.GastosRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class GastosService {
    @Autowired
    GastosRepository repository;
    
    public List<Gastos> Filter_Day(String fecha){
        return repository.Filter_Day(fecha);
    }
    
    public void Add_Gasto(Gastos gastos) {
        repository.Add_Gasto(gastos.getIdpresupuesto(), gastos.getNombre(), gastos.getFecha(), gastos.getGasto());
    }
}
