public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float massBody = 77;
        float heightBody = 1.7F;
        float indexMassBody = service.calculate(massBody, heightBody);
        String result = String.format("%.1f", indexMassBody);
        System.out.println("Ваш индекс массы тела: " + result);
    }
}
