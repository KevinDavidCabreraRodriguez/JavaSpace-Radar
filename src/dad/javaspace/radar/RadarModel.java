package dad.javaspace.radar;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class RadarModel {

	private DoubleProperty playerX = new SimpleDoubleProperty(this, "playerX", 0);
	private DoubleProperty playerY = new SimpleDoubleProperty(this, "playerY", 0);
	private DoubleProperty playerRotation = new SimpleDoubleProperty(this, "playerRotation", 0);

	public final DoubleProperty playerXProperty() {
		return this.playerX;
	}

	public final double getPlayerX() {
		return this.playerXProperty().get();
	}

	public final void setPlayerX(final double playerX) {
		this.playerXProperty().set(playerX);
	}

	public final DoubleProperty playerYProperty() {
		return this.playerY;
	}

	public final double getPlayerY() {
		return this.playerYProperty().get();
	}

	public final void setPlayerY(final double playerY) {
		this.playerYProperty().set(playerY);
	}

	public final DoubleProperty playerRotationProperty() {
		return this.playerRotation;
	}

	public final double getPlayerRotation() {
		return this.playerRotationProperty().get();
	}

	public final void setPlayerRotation(final double playerRotation) {
		this.playerRotationProperty().set(playerRotation);
	}

}
