package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.StageStyle;

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
    private ChoiceBox<String> blockList;

    @FXML
    private TextField addedAmount;

    @FXML
    private ImageView prevImage;

    @FXML
    private Label preNumber;
    
    private int amount;
    
    private void messageAlert(String message) {
    	Alert info = new Alert(AlertType.ERROR);
    	info.setTitle("Minecraft");
    	info.setHeaderText(null);
    	info.initStyle(StageStyle.UTILITY);
    	info.setContentText(message);
    	info.show();
    }
    
    @FXML
    private void preview() {
    	String value = addedAmount.getText();
    	if(value.equals("")) {
    	}else {
    		if(Integer.parseInt(value)<=64) {
        		preNumber.setText(addedAmount.getText());
        	}else {
        		messageAlert("Please introduce a valid number (The max value is a stack or 64 elements)");
        	}
    	}
    }

    @FXML
    private void previewBLocks(MouseEvent event) {
    	messageAlert("Sisa perro vi el bloque");
    }
    
    private void setComboBoxElements() {
    	blockList.getItems().add("Andesite");
    	blockList.getItems().add("Bookshelf");
    	blockList.getItems().add("Bricks");
    	blockList.getItems().add("Chest");
    	blockList.getItems().add("Coal");
    	blockList.getItems().add("Cobblestone");
    	blockList.getItems().add("Crafting Table");
    	blockList.getItems().add("Diamond");
    	blockList.getItems().add("Diorite");
    	blockList.getItems().add("Dirt");
    	blockList.getItems().add("Furnace");
    	blockList.getItems().add("Glass");
    	blockList.getItems().add("GlassPane");
    	blockList.getItems().add("Gold");
    	blockList.getItems().add("Granite");
    	blockList.getItems().add("HayBale");
    	blockList.getItems().add("Iron");
    	blockList.getItems().add("OakWood");
    	blockList.getItems().add("OakWoodenPlanks");
    	blockList.getItems().add("Obsidian");
    	blockList.getItems().add("Pumpkin");
    	blockList.getItems().add("Quartz");
    	blockList.getItems().add("Sand");
    	blockList.getItems().add("SoulSand");
    	blockList.getItems().add("Stone");
    	blockList.getItems().add("TNT");
    	blockList.getItems().add("Wool");
    }
    
    @FXML
    private void addBlocks(ActionEvent event) {
    	amount++;
    }

    @FXML
    private void next(ActionEvent event) {
    	if(pos.getText().equals("n")) {
    		pos.setText("1");
    	}else if(Integer.parseInt(pos.getText())<amount){
    		pos.setText((Integer.parseInt(pos.getText())+1)+"");
    	}else {
    		pos.setText("1");
    	}
    }
    
    private void setBackgrounds() {
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

    @FXML
    private void initialize() {
    	preview();
    	setBackgrounds();
    	setComboBoxElements();
    	amount = 0;
    }
}




