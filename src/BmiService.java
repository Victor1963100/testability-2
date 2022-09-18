public class BmiService {
    public double calculate(double weight, double growth) {
        double bmr = weight / Math.pow(growth, 2);
        return bmr;
    }
}

