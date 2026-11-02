module com.mycompany.tienda {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tienda to javafx.fxml;
    exports com.mycompany.tienda;
}
