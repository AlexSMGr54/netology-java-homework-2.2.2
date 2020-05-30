public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        float weight = 75.5F;
        int height = 181;
        float bmi = bmiService.calculate(weight, height);

        System.out.println(String.format("%.02f", bmi));
    }
}
