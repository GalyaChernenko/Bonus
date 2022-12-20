public class Main {
    public static void main(String[] args) {

        int amount = 1004; //сумма пополнения
        int percent; // процент бонуса
        if (amount >= 1000)
        {
            percent = 1;
        } else;
        {
            percent = 0;
        }
        int bonus = (amount * percent) / 100;
        System.out.println(bonus);
    }
}
