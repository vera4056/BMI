public class BmiService {
    public double calculate(double weight, double height) {

        double bmi;
        bmi = weight / (height / 100) / (height / 100);

        return bmi;

    }

}
