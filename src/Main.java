public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        int sum = 0;
        for (int spendingDay : arr ) {
            sum += spendingDay;

        }
        System.out.printf("Сумма затрат за месяц составила %s рублей\n", sum);



        int minSpending = arr[0];
        int maxSpending = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (minSpending > arr[i]) {
                minSpending = arr[1];
            } else if (maxSpending < arr[i]) {
                maxSpending = arr[i];
            }
        }
        System.out.println();
        System.out.printf ("Минимальная сумма трат за день составила %s рублей.\n"+
                "Максимальная сумма трат за день составила %s рублей\n",
                              minSpending,maxSpending);
        System.out.println();
        double spendingAverage = (double)sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей\n", spendingAverage );

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char symbol;
        for (int i = 0; i < reverseFullName.length/2; i++) {
            symbol = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = symbol;
        }

            for (char letter:reverseFullName) {
                System.out.print(letter);

            }




        }













    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}