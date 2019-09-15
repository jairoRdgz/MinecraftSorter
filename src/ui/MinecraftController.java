package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private Pane pos0;

    @FXML
    private Label pos;

    @FXML
    private Button next;

    @FXML
    private Pane pos11;

    @FXML
    private Pane pos21;

    @FXML
    private Pane pos31;

    @FXML
    private Pane pos41;

    @FXML
    private Pane pos51;

    @FXML
    private Pane pos61;

    @FXML
    private Pane pos71;

    @FXML
    private Pane pos81;

    @FXML
    private Pane pos91;

    @FXML
    private Pane pos12;

    @FXML
    private Pane pos22;

    @FXML
    private Pane pos32;

    @FXML
    private Pane pos42;

    @FXML
    private Pane pos52;

    @FXML
    private Pane pos62;

    @FXML
    private Pane pos72;

    @FXML
    private Pane pos82;

    @FXML
    private Pane pos92;

    @FXML
    private Pane pos13;

    @FXML
    private Pane pos23;

    @FXML
    private Pane pos33;

    @FXML
    private Pane pos43;

    @FXML
    private Pane pos53;

    @FXML
    private Pane pos63;

    @FXML
    private Pane pos73;

    @FXML
    private Pane pos83;

    @FXML
    private Pane pos93;

    @FXML
    private ChoiceBox<?> blockList;

    @FXML
    private TextField addedAmount;

    @FXML
    private ImageView prevImage;

    @FXML
    private Label preNumber;

    @FXML
    void addBlocks(ActionEvent event) {

    }

    @FXML
    void next(ActionEvent event) {
    	if(pos.getText().equals("n")) {
    		pos.setText("1");
    	}else if(Integer.parseInt(pos.getText())<99){
    		pos.setText((Integer.parseInt(pos.getText())+1)+"");
    	}else {
    		pos.setText("1");
    	}
    }

    @FXML
    void initialize() {
    	Image backGround = new Image("Images/square.jpg");
    	Image nextButton = new Image("Images/nextB.png");

    	next.setBackground(new Background(new BackgroundImage(nextButton, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(60, 60, false, false, false, true))));

    	pos0.setBackground(new Background(new BackgroundImage(backGround, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, new BackgroundSize(66.66, 66.66, false, false, false, true))));
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




