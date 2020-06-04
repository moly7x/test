module theYoung.CertiScript {
    requires javafx.controls;
    requires javafx.fxml;

    opens theYoung.CertiScript to javafx.fxml;
    exports theYoung.CertiScript;
}