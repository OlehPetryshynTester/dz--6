import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 4, 5, 6, 7};
        System.out.println(sumOfEvenNumbers(arr));

        String str = "Alexx9800";
        printUniqueChars(str);
    }

    public static int sumOfEvenNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void printUniqueChars(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!uniqueChars.contains(c)) {
                System.out.println(c);
                uniqueChars.add(c);
            }
        }
    }
}
