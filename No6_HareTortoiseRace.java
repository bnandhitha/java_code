
import java.util.Scanner;

public class No6_HareTortoiseRace {

    public static void main(String[] args) {
        // Read the first line (N and X)
        try (Scanner sc = new Scanner(System.in)) {
            // Read the first line (N and X)
            int N = sc.nextInt(); // Hare's sleep threshold
            int X = sc.nextInt(); // Tortoise's power points
            
            // Read the number of laps (L)
            int L = sc.nextInt();
            
            int harePower = 0;
            boolean slept = false;
            
            // Read lap power values and process the hare's energy
            for (int i = 0; i < L; i++) {
                int lapPower = sc.nextInt();
                harePower += lapPower;
                
                // If hare's power reaches or exceeds N, it sleeps
                if (harePower >= N && !slept) {
                    harePower -= N;
                    slept = true;
                }
            }
            
            // Determine the winner
            if (harePower < X) {
                System.out.println("TORTOISE");
            } else if (harePower == X) {
                System.out.println("-1");
            } else {
                System.out.println("HARE");
            }
        } // Hare's sleep threshold
    }
}
