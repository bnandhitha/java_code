/*
 Input:
 6
Ravi 1 1
Ravi 2 2
Ram 0.4 0.3
Divya 1.3 2.5
Divya 2.5 3.4
Ram 0.2 0.4

Output:
Ram 505.28
Ravi 175.74
Divya 18.22
 */

import java.util.*;

public class No5_ArcheryScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = Integer.parseInt(scanner.nextLine().trim()); // Number of input lines
        
        Map<String, Double> scoreMap = new HashMap<>();

        for (int i = 0; i < D; i++) {
            String[] input = scanner.nextLine().trim().split("\\s+"); // Ensures correct input parsing
            String name = input[0];
            double x = Double.parseDouble(input[1]);
            double y = Double.parseDouble(input[2]);

            double distance = Math.sqrt(x * x + y * y); // Calculate distance from center
            double score = Math.max((3 - distance) * 100, 0); // Apply the scoring formula

            scoreMap.put(name, scoreMap.getOrDefault(name, 0.0) + score); // Accumulate scores
        }
        scanner.close();

        // Sorting scores in descending order
        List<Map.Entry<String, Double>> sortedList = new ArrayList<>(scoreMap.entrySet());
        sortedList.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        // Print results formatted to 2 decimal places
        for (Map.Entry<String, Double> entry : sortedList) {
            System.out.printf("%s %.2f\n", entry.getKey(), entry.getValue());
        }
    }
}


