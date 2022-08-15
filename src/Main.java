public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {

        //Первое задание
        int[] arr = generateRandomArray();
        int sum = 0;

        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(" Сумма трат за месяц составила " + sum +  "- рублей.");


            //Второе задание
            int min = arr[0];
            int max = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }

            }
            System.out.println("Минимальная сумму затрат составила " + min);
            System.out.println("Максимальная сумму затрат составила " + max);

            //Третье задание
            System.out.println("Средняя сумма трат за месяц составила " + sum/arr.length);

            //Четвертое задание
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int j = reverseFullName.length-1; j > -1; j--) {
                System.out.print(reverseFullName[j]);
            }
            System.out.println("\n===============================");
        }
    }
}
