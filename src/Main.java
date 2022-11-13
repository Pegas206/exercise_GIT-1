public class Main {
    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager(new long[]{0, 1, 2, 1, -5});
        System.out.println(salesManager.max());
    }
}
