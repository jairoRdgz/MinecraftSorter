package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.StageStyle;
import model.Blocks;
import model.MineHash;

public class MinecraftController {

	private MineHash mineHash;

	private int allBlocks;
	private int diferentBLocks;
	private int id;

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
	private void addBlocks(ActionEvent event) {
		mineHash.addBlock(new Blocks(id, Integer.parseInt(addedAmount.getText())));
	}

	@FXML
	private void next(ActionEvent event) {
		if (pos.getText().equals("n")) {
			pos.setText("1");
		} else if (Integer.parseInt(pos.getText()) < diferentBLocks) {
			pos.setText((Integer.parseInt(pos.getText()) + 1) + "");
		} else {
			pos.setText("1");
		}
	}

	@FXML
	private void preview() {
		String value = addedAmount.getText();
		if (value.equals("")) {
		} else {
			allBlocks = Integer.parseInt(value);
			if (Integer.parseInt(value) <= allBlocks) {
				if (Integer.parseInt(value) > 64) {
					preNumber.setText("+64");

				} else {
					preNumber.setText(addedAmount.getText());
				}
			} else {
				messageAlert("Sorry But there is no more space in the inventary");
			}
		}
		previewBLocks();
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

	protected void previewBLocks() {
		String block = blockList.getValue() + "";
		switch (block) {
		case "Andesite":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 1;
			break;
		case "Bookshelf":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 2;
			break;
		case "Bricks":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 3;
			break;
		case "Chest":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 4;
			break;
		case "Coal":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 5;
			break;
		case "Cobblestone":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 6;
			break;
		case "Crafting Table":
			prevImage.setImage(new Image("Images/" + "CraftingTable" + ".png"));
			id = 7;
			break;
		case "Diamond":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 8;
			break;
		case "Diorite":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 9;
			break;
		case "Dirt":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 10;
			break;
		case "Furnace":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 11;
			break;
		case "Glass":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 12;
			break;
		case "GlassPane":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 13;
			break;
		case "Gold":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 14;
			break;
		case "Granite":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 15;
			break;
		case "HayBale":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 16;
			break;
		case "Iron":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 17;
			break;
		case "OakWood":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 18;
			break;
		case "OakWoodenPlanks":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 19;
			break;
		case "Obsidian":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 20;
			break;
		case "Pumpkin":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 21;
			break;
		case "Quartz":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 22;
			break;
		case "Sand":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 23;
			break;
		case "SoulSand":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 24;
			break;
		case "Stone":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 25;
			break;
		case "TNT":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 26;
			break;
		case "Wool":
			prevImage.setImage(new Image("Images/" + block + ".png"));
			id = 27;
			break;
		case "":
			System.out.println("no hay nada");
			break;
		}
	}

	private void messageAlert(String message) {
		Alert info = new Alert(AlertType.ERROR);
		info.setTitle("Minecraft");
		info.setHeaderText(null);
		info.initStyle(StageStyle.UTILITY);
		info.setContentText(message);
		info.show();
	}

	@FXML
	private void initialize() {
		mineHash = new MineHash();
		mineHash.init();
		preview();
		setComboBoxElements();
		allBlocks = 0;
		diferentBLocks = 0;
		id = 0;
	}
}