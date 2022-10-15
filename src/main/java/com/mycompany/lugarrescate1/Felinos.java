/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lugarrescate1;

/**
 *
 * @author KAREN RAMIREZ
 */
public class Felinos {
    private String nombre;
    private String raza;
    private String color;
    private String toxo;
    private int edad;

    public Felinos() {
        nombre = "";
        raza = "";
        color = "";
        toxo = "";
        edad = 0;
       
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
     * @return the toxo
     */
    public String getToxo() {
        return toxo;
    }

    /**
     * @param toxo the toxo to set
     */
    public void setToxo(String toxo) {
        this.toxo = toxo;
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
      public String datos(){
        return "El gato "+nombre+" es de raza "+raza+ ", es de color " +color + ", tiene "+edad+" años de edad y "+ toxo + " vacuna contra la toxoplasmosis";
      }

}
