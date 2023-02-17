module com.mycompany.demo_ca2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.demo_ca2 to javafx.fxml;
    exports com.mycompany.demo_ca2;
}
