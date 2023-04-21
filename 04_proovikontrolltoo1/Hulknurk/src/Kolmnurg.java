import java.util.List;

public class Kolmnurg {
    List<Double> xCoords;
    List<Double> yCoords;
    public Kolmnurg(List<Double> xCoords, List<Double> yCoords) {
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    public double lisaJaAnnaYmbermoot(double newX, double newY){
        xCoords.add(newX);
        yCoords.add(newY);

    }

}
