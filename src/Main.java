import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int ticket = 25165; // стоимость билета
        int amount = 20; // сумма, за которую начисляется 1 миля

        int miles = ticket / amount;

        System.out.println(miles);
    }
}