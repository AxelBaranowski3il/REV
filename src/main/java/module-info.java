module tp {
    requires javafx.controls;
    requires javafx.fxml;


    opens tp to javafx.fxml;
    exports tp;
}