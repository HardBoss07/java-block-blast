package ch.bosshard.matteo.blockblast;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private static final int GRID_WIDTH = 10;
    private static final int GRID_HEIGHT = 10;
    private static final int CELL_SIZE = 25;
    private static final Color GRID_COLOR = Color.LIGHTGRAY;
    private static final Color[] BLOCK_COLORS = {
            Color.DARKBLUE, Color.DARKGREEN, Color.DARKRED
    };

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane mainGrid = new GridPane();
        HBox selectionPanel = new HBox();

        BorderPane root = new BorderPane();
        root.setTop(selectionPanel);
        root.setCenter(mainGrid);

        Scene scene = new Scene(root, 350, 600);
        primaryStage.setTitle("Tetris Block Placer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}