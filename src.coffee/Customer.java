public class Customer {
    private String name;
    private int money;
    private boolean hasCoffee;

    public Customer(String name, int money) {
        this.name = name;
        money = 0;
        hasCoffee = false;
    }

    public Customer(String name, int money, boolean hasCoffee) {
        this.name = name;
        this.money = money; //this가 붙은건 자기 자신
        this.hasCoffee = hasCoffee;

    }

    public void print() {
        System.out.println(money);
        System.out.println(hasCoffee);
    }

    public Customer(int money) {
        this.money = money;
        hasCoffee = false;
    }

    public int pay(int coffeePrice) { //잔액이 부족하면 -9 반환 정상이면 0 반환
        if (money < coffeePrice) {
            System.out.println(name + " 의 잔액이 부족합니다.");
            return -9;
        }
        money = money - coffeePrice;
        return 0;
    }

    public void order(Barista barista, String menuName) {

        System.out.println(name + ": " + menuName + " 한 잔 주세요 ");
        int price = barista.getCoffeePrice();
        System.out.println("[바리스타]: " + menuName + "는(은) " + price + "원 입니다. ");

        int paymentCheck = pay(price);
        if (paymentCheck == -9)
            return;

        System.out.println("[" + name + "]: " + price + " 원을 지불했습니다.");
        String coffee = barista.takeOrder(menuName, price);
        takeCoffee(coffee);

        if (coffee == "0"){
            money += price;
            System.out.println("[" + name + "]: " + price +"원을 돌려받았습니다");
            System.out.println("[" + name + "]: 남은 잔고는 " + money + "원 입니다.");
        }
    }


    public void takeCoffee(String coffee) {
        hasCoffee = true;
        System.out.println(name + ": " + coffee + "를 받았습니다.");
    }
}

