import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {
        int[] myArray = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(myArray, target)));
    }


        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }
                }
            }
            // If no valid pair is found, return an empty array instead of null
            return new int[] {0,0};
        }
    }

