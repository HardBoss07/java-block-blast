module ch.bosshard.matteo.blockblast {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.bosshard.matteo.blockblast to javafx.fxml;
    exports ch.bosshard.matteo.blockblast;
    exports ch.bosshard.matteo.blockblast.blocks;
    opens ch.bosshard.matteo.blockblast.blocks to javafx.fxml;
}