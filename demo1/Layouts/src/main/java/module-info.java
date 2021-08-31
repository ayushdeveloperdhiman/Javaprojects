module com.example.layouts {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens com.example.layouts to javafx.fxml;
    exports com.example.layouts;
}