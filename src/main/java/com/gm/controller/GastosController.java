package com.gm.controller;

import com.gm.model.Gastos;
import com.gm.service.GastosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Gastos")
@CrossOrigin
public class GastosController {
    @Autowired
    private GastosService service;
    
    @GetMapping("/FilterDay")
    public List<Gastos> Filter_Day(@RequestParam("fecha")String fecha){
        return service.Filter_Day(fecha);
    }
    
    @PostMapping("/AddGasto")
    public void Add_Gasto(@RequestBody Gastos gastos){
        try{
            service.Add_Gasto(gastos);
        }catch(Exception e){
            e.getMessage();
        }
    }
    
}
