public class Main {
    public static void main(String[] args) {

        int balans = 100; //сумма баланса
        int amount = 100; //сумма пополнения
        int percent; // процент бонуса
        if (amount >= 1000)
        {
            percent = 1;
        } else
        {
            percent = 0;
        }
        int bonus = (amount * percent) / 100;
        balans = balans + amount + bonus;

        System.out.println(balans); //сумма баланса
        System.out.println(bonus); // сумма бонусов

    }
}
