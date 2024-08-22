import java.util.ArrayList;
import java.util.List;

public class Alpha {
    public static void main(String[] args) {
        String input = "abc123def456ghi789";
        List<Integer> numbers = extractIntegers(input);

        // Print the extracted integers
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static List<Integer> extractIntegers(String input) {
        List<Integer> numbers = new ArrayList<>();
        String[] parts = input.split("\\D+"); // Split by any non-digit character

        for (String part : parts) {
            if (!part.isEmpty()) {
                numbers.add(Integer.parseInt(part));
            }
        }

        return numbers;
    }
}

