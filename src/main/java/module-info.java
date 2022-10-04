module com.example.coourse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coourse to javafx.fxml;
    exports com.example.coourse;
}