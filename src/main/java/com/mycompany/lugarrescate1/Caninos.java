/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lugarrescate1;

/**
 *
 * @author KAREN RAMIREZ
 */
public class Caninos {
    private String nombre ="";
    private String raza="";
    private String color="";
    private int edad=0;
    private int entrenamiento=0;

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
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the entrenamiento
     */
    public int getEntrenamiento() {
        return entrenamiento;
    }

    /**
     * @param entrenamiento the entrenamiento to set
     */
    public void setEntrenamiento(int entrenamiento) {
        this.entrenamiento = entrenamiento;
    }
  public String datos(){
        return "El Perro se llama "+nombre+" es de raza "+raza+ ", tiene el color " +color + ", tiene "+edad+" años de edad y tiene un nivel de entrenamiento de "+ entrenamiento ;
      }
}
