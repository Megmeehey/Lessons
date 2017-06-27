package Codingbat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Megmeehey on 21.06.17.
 * Codingbat.com Array-1 code practice at
 * http://codingbat.com/java/Array-1
 */
public class Array1 {
    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6) || (nums[nums.length - 1] == 6);
    }

    public boolean sameFirstLast(int[] nums) {
        return (nums.length > 0) && (nums[0] == nums[nums.length - 1]);
    }

    public int[] makePi() {
        return new int[] {3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[] {nums[1], nums[2], nums[0]};
    }

    public int[] reverse3(int[] nums) {
        return new int[] {nums[2], nums[1], nums[0]};
    }

    public int[] maxEnd3(int[] nums) {
        int a = Math.max(nums[0], nums[2]);
        return new int[] {a, a, a};
    }

    public int sum2(int[] nums) {
        int n = 0, i = 0;
        while ((i < nums.length) && (i < 2)) {
            n += nums[i];
            i++;
        }
        return n;
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[] {nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums [0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    public boolean no23(int[] nums) {
        return !(nums[0] == 2 || nums [0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    public int[] makeLast(int[] nums) {
        List<Integer> nm = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            nm.add(0);
            if (i == (nums.length - 1)) {
                nm.add(nums[i]);
            }
            else {
                nm.add(0);
            }
        }
        return toIntArray(nm);
    }

    int[] toIntArray(List<Integer> list){
        int[] ret = new int[list.size()];
        for(int i = 0; i < ret.length; i++)
            ret[i] = list.get(i);
        return ret;
    }

    public boolean double23(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        else {
            return (nums[0] == nums[1]) && (nums[1] == 2 || nums[1] == 3);
        }
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            return new int[] {nums[0], 0, nums[2]};
        }
        else if (nums[1] == 2 && nums[2] == 3) {
            return new int[] {nums[0], nums[1], 0};
        }
        else {
            return nums;
        }
    }

    public int start1(int[] a, int[] b) {
        int n = 0;
        if (a.length > 0) {
            if (a[0] == 1) {
                n++;
            }
        }
        if (b.length > 0) {
            if (b[0] == 1) {
                n++;
            }
        }
        return n;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        if (b[0] + b[1] > a[0] + a[1]) {
            return b;
        }
        else {
            return a;
        }
    }

    public int[] makeMiddle(int[] nums) {
        return new int[] {nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[] {a[0], a[1], b[0], b[1]};
    }

    public int[] swapEnds(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        else {
            int a = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = a;
        }
        return nums;
    }

    public int[] midThree(int[] nums) {
        if (nums.length == 3) {
            return nums;
        }
        else {
            return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
        }
    }

    public int maxTriple(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        else {
            return Math.max(Math.max(nums[0], nums[nums.length - 1]), nums[nums.length / 2]);
        }
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        else {
            return new int[] {nums[0], nums[1]};
        }
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        else if (nums.length == 2) {
            return (nums[0] == 1 && nums[1] == 3);
        }
        else {
            return (nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
        }
    }

    public int[] make2(int[] a, int[] b) {
        if (a.length == 0) {
            return new int[] {b[0], b[1]};
        }
        else if (a.length == 1) {
            return new int[] {a[0], b[0]};
        }
        else {
            return new int[] {a[0], a[1]};
        }
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length != 0) {
            if (b.length != 0) {
                return new int[] {a[0], b[0]};
            }
            return new int[] {a[0]};
        }
        if (b.length != 0) {
            return new int[] {b[0]};
        }
        return new int[] {};
    }
}
