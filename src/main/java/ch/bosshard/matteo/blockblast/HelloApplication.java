package ch.bosshard.matteo.blockblast;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private static final int GRID_SIZE = 8;
    private static final int CELL_SIZE = 40;
    private static final Color GRID_COLOR = Color.LIGHTGRAY;
    private static final Color[] BLOCK_COLORS = {
            Color.DARKBLUE, Color.DARKGREEN, Color.DARKRED
    };

    Game game;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {;
        VBox root = new VBox(20);

        game = new Game(GRID_SIZE, CELL_SIZE, GRID_COLOR, BLOCK_COLORS);
        game.initializeGame();

        HBox header = createHeader();
        GridPane playGrid = game.getPlayGrid();
        HBox blockSelection = game.getBlockGrid();

        root.getChildren().addAll(header, playGrid, blockSelection);

        Scene scene = new Scene(root, 350, 600);
        primaryStage.setTitle("Block Blast");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private HBox createHeader() {
        HBox header= new HBox(10);

        Label scoreLabel = new Label(String.valueOf("Score: " + game.getScore()));
        Label multiplierLabel = new Label(String.valueOf("Multiplier: " + game.getMultiplier()));
        header.getChildren().addAll(scoreLabel, multiplierLabel);

        return header;
    }
}