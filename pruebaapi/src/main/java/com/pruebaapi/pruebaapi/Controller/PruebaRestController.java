package com.pruebaapi.pruebaapi.Controller;

//import java.util.concurrent.atomic.AtomicLong;

import com.pruebaapi.pruebaapi.Models.Casa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaRestController{

    private final static String template="Hola, %s";
    //private final AtomicLong contador= new AtomicLong();

    @GetMapping("/casa")
    public Casa casa(@RequestParam(value ="Nombre",defaultValue ="Casa")String nombre, 
                    @RequestParam(value = "Id",defaultValue = "1")int id){
        return new Casa(12,String.format(template,nombre),"Avenida Iquitos 120");
    }
    
}