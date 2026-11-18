public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista(3000, 1);

        Customer customer1 = new Customer("익명1",7000, false);
        customer1.order(barista, "아메리카노");

        System.out.println("---");

        Customer customer2 = new Customer("익명2",4000, false);
        customer2.order(barista, "아메리카노");

    }
}