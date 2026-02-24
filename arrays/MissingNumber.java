public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};   // 3 missing
        int n = arr.length + 1;     // total numbers hone chahiye

        long expectedSum = (long) n * (n + 1) / 2;//kyuki number bda ho sakta h
        long actualSum = 0;

        // array ka sum nikal rahe hain
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        long missing = expectedSum - actualSum;

        System.out.println("Missing number is: " + missing);
    }
}