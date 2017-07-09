package Codingbat;

import java.util.Arrays;

/**
 * Created by Megmeehey on 04.07.2017.
 */
public class Array3 {
    public static int[] squareUp(int n) {
        int[] array = new int[(int) n * n];
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
        int[] array = new int[(int) n * (n + 1) / 2];
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
        return 0;
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

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(4)));
    }
}
