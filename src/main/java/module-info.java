module com.proyectofinal.estructuradatos.proyectofinalestructuradatos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.proyectofinal.estructuradatos.proyectofinalestructuradatos to javafx.fxml;
    exports com.proyectofinal.estructuradatos.proyectofinalestructuradatos;
}