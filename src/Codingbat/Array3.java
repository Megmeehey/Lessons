package Codingbat;

/**
 * Created by Megmeehey on 04.07.2017.
 */
public class Array3 {
    public int maxSpan(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxSpan = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == nums[j] && maxSpan < (1 + j - i)) {
                    maxSpan = j - i + 1;
                }
            }
        }
        return maxSpan;
    }

    public int[] fix34(int[] nums) {
        int indexThree = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = indexThree; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        indexThree = j;
                        nums[j] = nums[i + 1];
                        nums[i + 1] = 4;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                        nums[j] = nums[i + 1];
                        nums[i + 1] = 5;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
        }
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            if (sum2 == sum1 - sum2) {
                result = true;
                break;
            }
            sum2 += nums[i];
        }
        return result;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        boolean result = true;
        int j = 0;
        int i = 0;
        while (i < inner.length) {
            while (j < outer.length && outer[j] != inner[i]) {
                j++;
            }
            if (j >= outer.length) {
                result = false;
                break;
            }
            if (outer[j] == inner[i]) {
                i++;
            }
        }
        return result;
    }

    public static int[] squareUp(int n) {
        int[] array = new int[n * n];
        int j = n - 1;
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % n >= j) {

                array[i] = k;
                k--;
                if (i % n == n - 1) {
                    j--;
                    k = n - j;
                }
            }
        }
        return array;
    }

    public int[] seriesUp(int n) {
        int num = 2;
        int j = 1;
        int[] array = new int[n * (n + 1) / 2];
        for (int i = 0; i < array.length; i++) {
            array[i] = j;
            if (j % num == num - 1) {
                num++;
                j = 1;
            } else {
                j++;
            }
        }
        return array;
    }

    public int maxMirror(int[] nums) {
        int count;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = nums.length - 1; i + count < nums.length && j > -1; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    if (count > 0) {
                        max = Math.max(count, max);
                        count = 0;
                    }
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }

    public int countClumps(int[] nums) {
        int count = 0;
        boolean isInClamp = false;
        if (nums.length < 2) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (isInClamp != (nums[i] == nums[i - 1])) {
                if (!isInClamp) {
                    count++;
                }
                isInClamp = !isInClamp;
            }
        }
        return count;
    }
}
