package ch.bosshard.matteo.blockblast;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    Game game;
    Render render;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {;
        VBox root = new VBox(20);

        game = new Game();
        game.initializeGame();

        render = new Render(game);

        HBox header = render.getHeader();
        GridPane playGrid = render.getPlayGrid();
        HBox blockSelection = render.getBlockGrid();

        int[][] testData = {
                {0,1,0,3,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,2,0,0,1,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,1,0,0,3,0},
                {0,0,0,0,2,0,0,0},
                {0,0,0,0,0,0,2,0},
                {0,0,1,1,2,3,2,0}
        };

        render.setPlayGridWithData(testData);

        root.getChildren().addAll(header, playGrid, blockSelection);

        Scene scene = new Scene(root, 350, 600);
        primaryStage.setTitle("Block Blast");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}