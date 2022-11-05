module com.example.localdemo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.localdemo2 to javafx.fxml;
    exports com.example.localdemo2;
}