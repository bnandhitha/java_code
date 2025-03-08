
import java.util.*;

public class No3_twoSwaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        List<Integer> go = new ArrayList<>();
        for (int i : arr) {
            go.add(i);
        }
        boolean res = check_twoSwaps(go);
        System.out.print(res);
    }

    static boolean check_twoSwaps(List<Integer> arr) {
        int n = arr.size();
        List<Integer> sortedList = new ArrayList<>(arr);
        Collections.sort(sortedList);
        List<Integer> misplacedList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!(arr.get(i).equals(sortedList.get(i)))) {
                misplacedList.add(i);
            }
        }
        if (misplacedList.isEmpty()) {
            return true;

        }
        if (misplacedList.size() > 4 || misplacedList.size() == 3) return false;

        // Exactly 2 misplaced elements -> Should require exactly two swaps
        if (misplacedList.size() == 2) {
            int i = misplacedList.get(0);
            int j = misplacedList.get(1);
            Collections.swap(arr, i, j);
            return arr.equals(sortedList);
        }
        if (misplacedList.size() == 4) {
            int r1 = misplacedList.get(0);
            int r2 = misplacedList.get(1);
            int r3 = misplacedList.get(2);
            int r4 = misplacedList.get(3);
            Collections.swap(arr, r1, r4);
            Collections.swap(arr, r2, r3);
            return arr.equals(sortedList);
        }
        if (misplacedList.size() == 3) {
            return false;

        }
        return false;

    }
}
