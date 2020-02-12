package com.pruebaapi.pruebaapi.Models;


public class Casa{
    private int id;
    private String nombre, direccion;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    
    public Casa(int id,String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    public Casa(int id,String nombre,String direccion){
        this.id=id;
        this.nombre=nombre;
        this.direccion=direccion;
    }
}