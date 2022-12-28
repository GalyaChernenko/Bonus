public class Main {
    public static void main(String[] args) {

        int balansstart = 100; //сумма баланса
        int amount = 1100; //сумма пополнения
        int percent; // процент бонуса
        if (amount > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = (amount * percent) / 100;
        int balansfinish;
        balansfinish = balansstart + amount + bonus;

        System.out.println(balansfinish); //сумма баланса
        System.out.println(bonus); // сумма бонусов

    }
}
