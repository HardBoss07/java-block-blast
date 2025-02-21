module ch.bosshard.matteo.blockblast {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.bosshard.matteo.blockblast to javafx.fxml;
    exports ch.bosshard.matteo.blockblast;
}