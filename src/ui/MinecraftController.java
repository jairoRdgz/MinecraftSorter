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
    private Pane wall;

    @FXML
    private Pane pos1;

    @FXML
    private ImageView obj1;

    @FXML
    private Pane pos2;

    @FXML
    private ImageView obj2;

    @FXML
    private Pane pos3;

    @FXML
    private ImageView obj3;

    @FXML
    private Pane pos4;

    @FXML
    private ImageView obj4;

    @FXML
    private Pane pos5;

    @FXML
    private ImageView obj5;

    @FXML
    private Pane pos6;

    @FXML
    private ImageView obj6;

    @FXML
    private Pane pos7;

    @FXML
    private ImageView obj7;

    @FXML
    private Pane pos8;

    @FXML
    private ImageView obj8;

    @FXML
    private Pane pos9;

    @FXML
    private ImageView obj9;

    @FXML
    private Pane pos0;

    @FXML
    private Label pos;

    @FXML
    private Button next;

    @FXML
    private ChoiceBox<String> blockList;

    @FXML
    private TextField addedAmount;

    @FXML
    private ImageView prevImage;

    @FXML
    private Label preNumber;
    
    private int diferentBLocks;
    
    private int allBlocks;
    
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
    		allBlocks = Integer.parseInt(value);
    		if(Integer.parseInt(value)<=allBlocks) {
        		if(Integer.parseInt(value)>64) {
        			preNumber.setText("+64");
        			
        		}else {
        			preNumber.setText(addedAmount.getText());
        		}
        	}else {
        		messageAlert("Sorry But there is no more space in the inventary");
        	}
    	}
    	previewBLocks();
    }

    private void previewBLocks() {
    	
    	String block = blockList.getValue()+"";
    	switch(block) {
    	 case "Andesite":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Bookshelf":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Bricks":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Chest":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Coal":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Cobblestone":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Crafting Table":
    		 prevImage.setImage(new Image("Images/"+"CraftingTable"+".png"));
    		 break;
    	 case "Diamond":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Diorite":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Dirt":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Furnace":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Glass":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "GlassPane":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Gold":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Granite":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "HayBale":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Iron":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "OakWood":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "OakWoodenPlanks":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Obsidian":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Pumpkin":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Quartz":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Sand":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "SoulSand":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "Stone":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "TNT":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    	 	break;
    	 case "Wool":
    		 prevImage.setImage(new Image("Images/"+block+".png"));
    		 break;
    	 case "":
    	 	System.out.println("no hay nada");
    	 	break;
    	}
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
    	diferentBLocks++;
    }

    @FXML
    private void next(ActionEvent event) {
    	clearPreview();
    	if(pos.getText().equals("n")) {
    		pos.setText("1");
    	}else if(Integer.parseInt(pos.getText())<diferentBLocks){
    		pos.setText((Integer.parseInt(pos.getText())+1)+"");
    	}else {
    		pos.setText("1");
    	}
    }
    
    private void clearPreview() {
    	
    }
    
    private void setBackgrounds() {
    	Image nextButton = new Image("Images/nextB.png");
    	next.setBackground(new Background(new BackgroundImage(nextButton, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(60, 60, false, false, false, true))));
    	
    	Image fondo = new Image("Images/fondo.jpg");
    	wall.setBackground(new Background(new BackgroundImage(fondo, null, null, null, null)));
    	
    	Image backGround = new Image("Images/square.jpg");
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
    	diferentBLocks = 0;
    	allBlocks = 0;
    }
}




