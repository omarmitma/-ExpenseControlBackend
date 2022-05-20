package com.gm.controller;

import com.gm.model.Data_Month;
import com.gm.model.Presupuesto;
import com.gm.service.PresupuestoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Presupuesto")
@CrossOrigin
public class PresupuestoController {
    @Autowired
    private PresupuestoService service;
    
    @GetMapping("/DataMonth")
    public List<Data_Month> Get_Data_Month(){
        return service.Get_Data_Month();
    }
    
    @PostMapping("/AddPresupuestoMensual")
    public void Add_Presupuesto_Mensual(@RequestBody Presupuesto presupuesto) {
         try{
            service.Add_Presupuesto_Mensual(presupuesto);
        }catch(Exception e){
            e.getMessage();
        }
    }
    
    @PutMapping("/AddMorePresupuesto")
    public void Add_More_Presupuesto(@RequestBody Presupuesto presupuesto) {
         try{
            service.Add_More_Presupuesto(presupuesto);
        }catch(Exception e){
            e.getMessage();
        }
    }
    
    @GetMapping("/FindMonth")
    public List<Presupuesto> Find_Month(@RequestParam("mes")String mes){
        return service.Find_Month(mes);
    }
}
