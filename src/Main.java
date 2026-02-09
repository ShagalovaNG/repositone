public class Main {
    public static void main(String[] args) {
        int amount = 137; //cтоимость билета
        int cost = 2; //количество рублей для одной бонусной мили
        int bonus = amount / cost; //количество бонусных миль
        System.out.println(bonus);
    }
}