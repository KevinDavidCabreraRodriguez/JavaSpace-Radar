package dad.javaspace.radar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class RadarController extends VBox implements Initializable {

    @FXML
    private VBox rootPane;

    @FXML
    private Pane radarPane;

    @FXML
    private Polygon playerTriangle;
    
	private RadarModel model = new RadarModel();

	public RadarController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("RadarView.fxml"));
			loader.setController(this);
			loader.setRoot(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		playerTriangle.translateXProperty().bind(model.playerXProperty());
		playerTriangle.translateYProperty().bind(model.playerYProperty());
		playerTriangle.rotateProperty().bind(model.playerRotationProperty());
	}

	public RadarModel getModel() {
		return model;
	}

	public void setModel(RadarModel model) {
		this.model = model;
	}

}
