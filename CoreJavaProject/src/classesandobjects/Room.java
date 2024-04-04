package classesandobjects;

public class Room {
	int length;
	int width;
	int height;
	
	int calculateFloorArea() {
		int floorArea = length * width;
		return floorArea;
	}
	
	int calculateWallPaintingCost(int paintingRate) {
		// first calculate the wall area
		int wallArea = calculateWallArea();
		// second calculate the painting cost
		int paintingCost = wallArea * paintingRate;
		return paintingCost;
	}
	
	int calculateWallArea() {
		int wallArea = (2 * height * (width + length));
		return wallArea;
	}
}