package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;

public class MinecraftController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane pos1;

    @FXML
    private Pane pos2;

    @FXML
    private Pane pos3;

    @FXML
    private Pane pos4;

    @FXML
    private Pane pos5;

    @FXML
    private Pane pos6;

    @FXML
    private Pane pos7;

    @FXML
    private Pane pos8;

    @FXML
    private Pane pos9;

    @FXML
    void initialize() {
    	
    	Image backGround = new Image("Images/square.jpg");
    	
    	pos1.setBackground(new Background(new BackgroundImage(backGround, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, new BackgroundSize(66.66, 66.66, false, false, false, false))));
    	pos2.setBackground(new Background(new BackgroundImage(backGround, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, new BackgroundSize(66.66, 66.66, false, false, false, false))));
    	pos3.setBackground(new Background(new BackgroundImage(backGround, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, new BackgroundSize(66.66, 66.66, false, false, false, false))));
    	pos4.setBackground(new Background(new BackgroundImage(backGround, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, new BackgroundSize(66.66, 66.66, false, false, false, false))));
    	pos5.setBackground(new Background(new BackgroundImage(backGround, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, new BackgroundSize(66.66, 66.66, false, false, false, false))));
    	pos6.setBackground(new Background(new BackgroundImage(backGround, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, new BackgroundSize(66.66, 66.66, false, false, false, false))));
    	pos7.setBackground(new Background(new BackgroundImage(backGround, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, new BackgroundSize(66.66, 66.66, false, false, false, false))));
    	pos8.setBackground(new Background(new BackgroundImage(backGround, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, new BackgroundSize(66.66, 66.66, false, false, false, false))));
    	pos9.setBackground(new Background(new BackgroundImage(backGround, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, new BackgroundSize(66.66, 66.66, false, false, false, false))));
    	
    	
    }
}
