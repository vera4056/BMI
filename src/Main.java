
public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75; // kg
        double height = 172; // cm
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);

    }
}
