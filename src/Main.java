public class
Main {
    public static void main(String[] args) {

        int ticket = 3248;  // стоимость билета
        int mile = 20;  // миля
        int bonus = 0; // количество начиленных миль

        if (ticket > 0)
        {
            bonus = ticket / mile;
        }
        System.out.println("Количество бонусных миль за покупку: " + bonus);
    }
}