public class Main {

    int[] arr = generateRandomArray();

        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
                System.out.println(arr[i]);
            }
            return arr;

        }
    }