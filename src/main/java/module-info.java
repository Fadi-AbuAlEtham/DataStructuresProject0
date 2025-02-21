module com.datastructuresproject0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.datastructuresproject0 to javafx.fxml;
    exports com.datastructuresproject0;
}