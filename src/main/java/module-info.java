module eus.ehu.multiscene {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens eus.ehu.multiscene to javafx.fxml;
    exports eus.ehu.multiscene;
}
