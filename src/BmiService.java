public class BmiService {
    public float calculate(float weight, int height) {

        return weight / ((height * height) / 10000);
    }
}
