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
public class LlenarFelinos extends LugarRescate1 {
    public String Input(String text) {
        return JOptionPane.showInputDialog(text);
    }

    public int Input1(String edad) {
        return Integer.parseInt(JOptionPane.showInputDialog(edad));
    }

    public int Input2(String Ne) {
        return Integer.parseInt(JOptionPane.showInputDialog(Ne));
    }

    public void LlenaGato() {
        String nombre = Input("Nombre del gato: ");
        String raza = Input("Nombre de la raza: ");
        String color = Input("Color del gato");
        int edad = Input1("Edad del gato");
        String tx= Input("El gato tiene vacuna contra la toxoplasmosis (Si o No");
        Felinos Feli = new Felinos();
        Feli.setNombre(nombre);
        Feli.setRaza(raza);
        Feli.setColor(color);
        Feli.setEdad(edad);
        Feli.setToxo(tx);
        Felino.add(Feli);
    }

    public void getFelino() {
        Iterator it = Felino.iterator();
        //verifica si existe otro elemento con el método hasNext()
        while (it.hasNext()) {
            Object objeto = it.next();
            Felinos feli = (Felinos) objeto;
            JOptionPane.showMessageDialog(null, feli.datos());
        }
    }

    public void limpiar() {
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion a eliminar"));
        Felino.remove(opcion);
    }

    void addFel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void addFeli() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
