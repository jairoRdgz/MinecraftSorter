package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MinecraftController {
	
	private int diferentBLocks;
	private int allBlocks;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane wall;

    @FXML
    private Pane pos0;

    @FXML
    private Button next;

    @FXML
    private ChoiceBox<String> blockList;

    @FXML
    private TextField addedAmount;

    @FXML
    private Label preNumber;

    @FXML
    private ImageView prevImage;

    @FXML
    private Label pos;

    @FXML
    private ImageView obj1;

    @FXML
    private ImageView obj11;

    @FXML
    private ImageView obj111;

    @FXML
    private ImageView obj1111;

    @FXML
    private ImageView obj11111;

    @FXML
    void addBlocks(ActionEvent event) {

    }

    @FXML
    void next(ActionEvent event) {

    }

    @FXML
    void preview(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	setComboBoxElements();
    	diferentBLocks = 0;
		allBlocks = 0;
    }
    
	protected void setComboBoxElements() {
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
}