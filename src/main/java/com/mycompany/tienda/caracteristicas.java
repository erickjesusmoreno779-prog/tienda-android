package com.mycompany.tienda;

public class caracteristicas {
    public int num;
    public String nombre;
    public int precio;

    public caracteristicas(int num, String nombre, int precio) {
        this.num = num;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getNum() {
        return num;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}