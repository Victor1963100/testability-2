public class Main {
    public static void main(String[] args) {
        double weight = 74;
        double growth = 1.74;

        BmiService service = new BmiService();

        System.out.println("Индекс массы телы = " + weight / Math.pow(growth, 2));
    }
}
