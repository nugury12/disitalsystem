public class Main {
    public static void main() {
        Customer customer = new Customer("손님", 10000, false);
        Barista barista = new Barista(3000,2);

        Customer customer1 = new Customer("익명", 5000, false);
        customer.order(barista, "아메리카노");
        System.out.println("-----------");
        Customer customer2 = new Customer("명익", 7000, false);
        customer.order(barista, "아메리카노");

    }
}