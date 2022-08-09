module pl.com.a2ya.program {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.com.a2ya.program to javafx.fxml;
    exports pl.com.a2ya.program;
}