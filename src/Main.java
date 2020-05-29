public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int weight = 75;
        int height = 181;
        double bmi = bmiService.calculate(weight, height);

        System.out.println(bmi);
    }
}
