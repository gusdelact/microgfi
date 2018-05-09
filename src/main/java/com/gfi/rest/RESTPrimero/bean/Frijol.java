package com.gfi.rest.RESTPrimero.bean;

public class Frijol {
    private int entero;
    private String cadena;
    private int[] arreglo;
    
    public Frijol() {
        entero=0;
        cadena="";
    }
    
    public Frijol(int elEntero, String laCadena) {
        entero=elEntero;
        cadena=laCadena;
        arreglo = new int[10];
        for (int i=0;i<10;i++) {
            arreglo[i] = i + 1;
        }
    }
    
    public int[] getArreglo() {
        return arreglo;
    }
    public int getEntero() {
        return entero;
    }
    
    public String getCadena() {
        return cadena;
    }
    
    @Override
    public String toString() {
        return String.format("Frijol %s %s ", entero, cadena);
    }

}