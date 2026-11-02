package com.mycompany.tienda;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextArea txaProductos;

    @FXML
    private TextField txfSeleccion;

    @FXML
    private TextArea txaPedido;

    // Instanciamos la clase Products
    private producto prodStock = new producto();

    @FXML
    public void initialize() {
        // Llenamos el arreglo de características en Products
        prodStock.inicializarElementos();

        // Rellenamos el TextArea superior con los productos
        StringBuilder impresion = new StringBuilder();
        for (int i = 0; i < prodStock.elementos.length; i++) {
            caracteristicas c = prodStock.elementos[i];
            if (c != null) {
                impresion.append(c.getNum())
                         .append(", ")
                         .append(c.getNombre())
                         .append(", ")
                         .append(c.getPrecio())
                         .append("\n");
            }
        }
        txaProductos.setText(impresion.toString());
        txaProductos.setEditable(false);
        txaPedido.setEditable(false);
    }

    @FXML
    private void Imprimir() {
        String textoCod = txfSeleccion.getText().trim();

        try {
            int codigoBuscado = Integer.parseInt(textoCod);
            caracteristicas encontrado = null;

            // Buscamos el elemento dentro del arreglo
            for (int i = 0; i < prodStock.elementos.length; i++) {
                caracteristicas c = prodStock.elementos[i];
                if (c != null && c.getNum() == codigoBuscado) {
                    encontrado = c;
                    break;
                }
            }

            // Concatenamos el nuevo pedido usando appendText
            if (encontrado != null) {
                txaPedido.appendText("Pediste unos " + encontrado.getNombre() + " de " + encontrado.getPrecio() + " pesos\n");
            } else {
                txaPedido.appendText("Código de producto no válido.\n");
            }

        } catch (NumberFormatException e) {
            txaPedido.appendText("Por favor, ingresa un número válido.\n");
        }
        
        // Opcional: Limpia el campo de selección para ingresar el siguiente código fácilmente
        txfSeleccion.clear();
    }
}