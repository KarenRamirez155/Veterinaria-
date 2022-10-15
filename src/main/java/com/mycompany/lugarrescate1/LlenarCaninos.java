/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lugarrescate1;

import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author KAREN RAMIREZ
 */
public class LlenarCaninos  extends LugarRescate1{
    public String Input(String text) {
        return JOptionPane.showInputDialog(text);
    }

    public int Input1(String edad) {
        return Integer.parseInt(JOptionPane.showInputDialog(edad));
    }

    public int Input2(String Ne) {
        return Integer.parseInt(JOptionPane.showInputDialog(Ne));
    }

    public void addCa() {
        Caninos Can = new Caninos();
        String nombre = Input("Nombre del perro");
        Can.setNombre(nombre);
        String raza = Input("Nombre de la raza");
        Can.setRaza(raza);
        String color = Input("Color del Perro");
        Can.setColor(color);
        int edad = Input1("Edad del Perro");
        Can.setEdad(edad);
        int Ne = Input2("Ingrese El nivel de 1 a 10 de entrenamiento del perro");
        Can.setEntrenamiento(Ne);
        if (Ne > 10) {
            JOptionPane.showMessageDialog(null, "Solo de 1 a 10");
        }
        Canino.add(Can);
    }

    public void getCanino() {
        Iterator it = Canino.iterator();
        //verifica si existe otro elemento con el método hasNext()
        while (it.hasNext()) {
            Object objeto = it.next();
            Caninos cani = (Caninos) objeto;
            JOptionPane.showMessageDialog(null, cani.datos());
        }

    }

    public void limpiar() {
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el la posicion a eliminar "));
        Canino.remove(opcion);
    }
    
}
