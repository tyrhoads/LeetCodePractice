import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {
        int[] myArray = {2, 8, 11, 15,9,0};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(myArray,target)));
    }


        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 1; j < nums.length; j++) {
                    if (nums[j] +nums[i] == target) {
                        return new int[] { i, j };
                    }
                }
            }
            // If no valid pair is found, return an empty array instead of null
            return new int[] {};
        }
    }

