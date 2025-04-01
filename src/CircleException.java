public class CircleException {
    private double radius;

    public CircleException(double newRadius){
        setRadius(newRadius);
    }

    public void setRadius(double newRadius) throws IllegalArgumentException{
        if (newRadius > 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius must be positive!");
    }
}
