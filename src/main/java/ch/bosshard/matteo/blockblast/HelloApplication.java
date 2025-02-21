package ch.bosshard.matteo.blockblast;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Game game = new Game();
        game.initGame();

        VBox mainLayout = new VBox();
        Label titleLabel = new Label("Block Blast");
        titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-alignment: center;");

        HBox footer = new HBox();
        Label footerLabel = new Label("Footer");
        footer.getChildren().add(footerLabel);
        footer.setStyle("-fx-alignment: center; -fx-padding: 10px;");

        mainLayout.getChildren().addAll(titleLabel, game.getGridContainer(), footer);

        Scene scene = new Scene(mainLayout, 450, 650);
        primaryStage.setTitle("BlockBlast");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}