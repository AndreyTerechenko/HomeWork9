public class Main {
    public static void main(String[] args) {
        // Task 1
        int sum = 0;
        int[] expenses = {20000, 30000, 12000, 17000, 11000};
        for (int i = 0; i < expenses.length; i++) {
            sum = sum + expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        // Task 2
        int minSum = expenses[0];
        int maxSum = minSum;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxSum) {
                maxSum = expenses[i];
            }
            if (minSum > expenses[i]) {
                minSum = expenses[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxSum + " рублей. " +
                "\nМинимальная сумма трат за неделю составила " + minSum + " рублей.");
        // Task 3
        double averageExpenses = (double) sum / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");
        // Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}