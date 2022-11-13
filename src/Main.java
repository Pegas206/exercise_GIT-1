public class Main {
    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager(new int[]{500, 450, 0, 300, -1, 375, 462});
        System.out.println(salesManager.max());
        System.out.println("Средний показатель продаж: " + salesManager.averageSales());
    }
}
