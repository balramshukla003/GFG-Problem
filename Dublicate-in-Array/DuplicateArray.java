import java.util.*;

class Duplicate {
    public int[] Finding(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (k == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate && !res.contains(k)) {
                res.add(k);
            }
        }
        int[] resultArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resultArray[i] = res.get(i);
        }

        return resultArray;
    }
}

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 1};
        Duplicate DP = new Duplicate();
        int[] res = DP.Finding(arr);
        System.out.println(Arrays.toString(res));
    }
}
