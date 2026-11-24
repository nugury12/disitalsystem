public class Asset {
    private String name;
    private String category;
    private int money;


    public Asset() {
    name = "";
    category = "";
    money = 0;
    }

    public Asset(String name, String category, int money) { // 매개변수 생성
        this.name = name;
        this.category = category;
        this.money = money;
    }
}



