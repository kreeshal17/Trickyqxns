import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr); // Sort the array
        
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicates for the first element
            
            int j = i + 1;
            int k = arr.length - 1;
            
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                
                if (sum < 0) {
                    j++; // Move the left pointer to increase the sum
                } else if (sum > 0) {
                    k--; // Move the right pointer to decrease the sum
                } else {
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k])); // Found a valid triplet
                    j++;
                    k--;
                    
                    // Skip duplicates for the second element
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    
                    // Skip duplicates for the third element
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(arr);
        
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
