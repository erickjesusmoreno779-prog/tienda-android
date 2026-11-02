package com.mycompany.tienda;

public class producto {
    public caracteristicas[] elementos = new caracteristicas[4];

    public void inicializarElementos() {
        elementos[0] = new caracteristicas(1, "Hamburguesas", 25);
        elementos[1] = new caracteristicas(2, "Chetos", 17);
        elementos[2] = new caracteristicas(3, "Mazapan", 5);
        elementos[3] = new caracteristicas(4, "CocaCola", 25);
    }
}