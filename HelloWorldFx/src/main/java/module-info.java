module com.ayush.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ayush.helloworldfx to javafx.fxml;
    exports com.ayush.helloworldfx;
}