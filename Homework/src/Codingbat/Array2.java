package Codingbat;

import java.util.Arrays;

/**
 * Created by Megmeehey on 04.07.2017.
 * Codingbat.com Array-2 code practice at
 * http://codingbat.com/java/Array-2
 */
public class Array2 {
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        int currentMin = Integer.MAX_VALUE;
        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (currentMin > nums[i]) {
                currentMin = nums[i];
            }
            if (currentMax < nums[i]) {
                currentMax = nums[i];
            }
        }

        return currentMax - currentMin;
    }

    public int centeredAverage(int[] nums) {
        int currentMin = Integer.MAX_VALUE;
        int currentMax = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currentMin > nums[i]) {
                currentMin = nums[i];
            }
            if (currentMax < nums[i]) {
                currentMax = nums[i];
            }
            sum += nums[i];
        }

        return (int) (sum - currentMin - currentMax) / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        int sum = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 13) {
                i += 2;
            } else {
                sum += nums[i];
                i++;
            }
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        int i = 0;
        boolean isCount = true;
        while (i < nums.length) {
            if (nums[i] == 6) {
                isCount = false;
            }
            if (isCount) {
                sum += nums[i];
            }
            if (nums[i] == 7 && !isCount) {
                isCount = true;
            }
            i++;
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i - 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += nums[i];
            }
        }
        if (sum == 8) {
            return true;
        } else {
            return false;
        }
    }

    public boolean more14(int[] nums) {
        int numOfOnes = 0, numOfFours = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                numOfOnes++;
            }
            if (nums[i] == 4) {
                numOfFours++;
            }
        }
        return numOfOnes > numOfFours;
    }

    public int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.toString(i);
        }
        return array;
    }

    public boolean no14(int[] nums) {
        boolean hasOnes = false;
        boolean hasFours = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                hasOnes = true;
            }
            if (nums[i] == 4) {
                hasFours = true;
            }
        }
        return !(hasOnes && hasFours);
    }

    public boolean isEverywhere(int[] nums, int val) {
        if (nums.length < 2) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != val && nums[i] != val) {
                return false;
            }
        }
        return true;
    }

    public boolean either24(int[] nums) {
        boolean two = false;
        boolean four = false;
        if (nums.length < 2) {
            return false;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i - 1] == 2) {
                two = true;
            }
            if (nums[i] == 4 && nums[i - 1] == 4) {
                four = true;
            }
        }
        return two ^ four;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff <= 2 && diff != 0) {
                count++;
            }
        }
        return count;
    }

    public boolean has77(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        if (nums.length == 2) {
            return (nums[0] == 7 && nums[1] == 7);
        }
        for (int i = 2; i < nums.length; i++) {
            if ((nums[i] == 7 && nums[i - 1] == 7) || (nums[i] == 7 && nums[i - 2] == 7) || (nums[i - 1] == 7 && nums[i - 2] == 7)) {
                return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean hasOne = false;
        for (int i = 0; i < nums.length; i++) {
            if (hasOne && nums[i] == 2) {
                return true;
            }
            if (nums[i] == 1) {
                hasOne = true;
            }
        }
        return false;
    }

    public boolean modThree(int[] nums) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                countEven = 0;
                countOdd++;
            }
            if (nums[i] % 2 == 0) {
                countEven++;
                countOdd = 0;
            }
            if (countEven == 3 || countOdd == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        if (nums.length < 5) {
            return false;
        }
        int countTrees = nums[0] == 3 ? 1 : 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (nums[i - 1] != 3) {
                    countTrees++;
                } else {
                    return false;
                }
            }
        }
        return countTrees == 3;
    }

    public boolean twoTwo(int[] nums) {
        if (nums.length == 0) {
            return true;
        }
        if (nums.length == 1) {
            return !(nums[0] == 2);
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i - 1] != 2) {
                if (i == nums.length - 1) {
                    return false;
                } else if (nums[i + 1] != 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean sameEnds(int[] nums, int len) {
        return Arrays.equals(Arrays.copyOfRange(nums, 0, len), Arrays.copyOfRange(nums, nums.length - len, nums.length));
    }

    public boolean tripleUp(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1 && nums[i - 1] - nums[i - 2] == 1) {
                return true;
            }
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int[] array = new int[end - start];
        for (int i = 0; i < array.length; i++) {
            array[i] = start + i;
        }
        return array;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int[] buffer = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            buffer[i - 1] = nums[i];
        }
        buffer[nums.length - 1] = nums[0];
        return buffer;
    }

    public int[] tenRun(int[] nums) {
        boolean isInTenRun = false;
        int ten = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                if (!isInTenRun) {
                    ten = nums[i];
                    isInTenRun = !isInTenRun;
                } else {
                    ten = nums[i];
                }
            } else {
                if (isInTenRun) {
                    nums[i] = ten;
                }
            }
        }

        return nums;
    }

    public int[] pre4(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                return Arrays.copyOfRange(nums, 0, i);
            }
        }
        return new int[]{0};
    }

    public int[] post4(int[] nums) {
        int lastFourOffset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                lastFourOffset = i;
            }
        }
        return Arrays.copyOfRange(nums, lastFourOffset + 1, nums.length);
    }

    public int[] notAlone(int[] nums, int val) {
        if (nums.length < 3) {
            return nums;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int[] array = new int[nums.length];
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                array[j] = nums[i];
                j--;
            }
        }
        return array;
    }

    public int[] withoutTen(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
        return nums;
    }

    public int[] zeroMax(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        int j = nums.length - 2;
        int currentOddMax = 0;
        while (j >= 0) {
            if (currentOddMax < nums[j + 1] && nums[j + 1] % 2 == 1) {
                currentOddMax = nums[j + 1];
            }
            if (nums[j] == 0 && currentOddMax != 0) {
                nums[j] = currentOddMax;
            }
            j--;
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int[] array = new int[nums.length];
        int j = nums.length - 1;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                array[k] = nums[i];
                k++;
            } else {
                array[j] = nums[i];
                j--;
            }
        }
        return array;
    }

    public String[] fizzBuzz(int start, int end) {
        int index = 0;
        int stStart = start;
        String[] result = new String[end - start];
        while (start < end) {
            String res = "";
            if (start % 3 == 0) {
                res += "Fizz";
            }
            if (start % 5 == 0) {
                res += "Buzz";
            }
            if (res.length() == 0) {
                res += start;
            }
            result[start - stStart] = res;
            start++;
        }
        return result;
    }
}
