public class BmiService {
    public double calculate(int weight, int height) {

        return (double) weight / ((height * height) / 10000);
    }
}
