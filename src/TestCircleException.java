public class TestCircleException {
    public static void main(String[] args){
        try {
            CircleException circleException = new CircleException(2);
            CircleException circleException1 = new CircleException(-2);
            CircleException circleException2 = new CircleException(3);
        }
        catch(IllegalArgumentException exception){
            System.out.println(exception);
        }
    }
}
