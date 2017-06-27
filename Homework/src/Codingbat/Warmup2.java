package Codingbat;

/**
 * Created by Megmeehey on 20.06.17.
 * Codingbat.com Warmup-2 code practice at
 * http://codingbat.com/java/Warmup-2
 */
public class Warmup2 {
    public String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public String frontTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        if (str.length() < 4) {
            for (int i = 0; i < n; i++) {
                sb.append(str);
            }
        }
        else {
            String fr = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                sb.append(fr);
            }
        }
        return sb.toString();
    }

    int countXX(String str) {
        if (str.length() < 2) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i+2).equals("xx")) {
                n++;
            }
        }
        return n;
    }

    boolean doubleX(String str) {
        int i = 0;
        while (i < str.length() - 1) {
            if (str.charAt(i) == 'x') {
                return  (str.charAt(i + 1) == 'x');
            }
            i++;
        }
        return false;
    }

    public String stringBits(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            sb.append(str.charAt(i));
            i += 2;
        }
        return sb.toString();
    }

    public String stringSplosion(String str) {
        if (str.length() < 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i <= str.length()) {
            sb.append(str.substring(0, i));
            i++;
        }
        return sb.toString();
    }

    public int last2(String str) {
        if (str.length() < 3) {
            return 0;
        }
        String ls = str.substring(str.length() - 2, str.length());
        int n = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i+2).equals(ls)) {
                n++;
            }
        }
        return n - 1;
    }

    public int arrayCount9(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                n++;
            }
        }
        return n;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length && i < 4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
                return true;
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        if (a.length() < 2 || b.length() < 2) {
            return 0;
        }
        int n = Math.min(a.length(), b.length()) - 1;
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                r++;
            }
        }
        return r;
    }

    public String stringX(String str) {
        if (str.length() < 3) {
            return str;
        }
        else if (str.charAt(0) == 'x') {
            if (str.charAt(str.length() - 1) == 'x') {
                return "x" + str.replaceAll("x", "") + "x";
            }
            else {
                return "x" + str.replaceAll("x", "");
            }
        }
        else {
            return str.replaceAll("x", "");
        }
    }

    public String altPairs(String str) {
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i < str.length()) {
            sb.append(str.charAt(i));
            if (i + 1 < str.length()) {
                sb.append(str.charAt(i+1));
            }
            i += 4;
        }

        return sb.toString();
    }

    public String stringYak(String str) {
        if (str.length() < 3) {
            return str;
        }

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i + 2 < str.length()) {
            if (str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 3;
            }
            else {
                sb.append(str.charAt(i));
                i++;
            }
        }
        while (i < str.length()) {
            sb.append(str.charAt(i));
            i++;
        }

        return sb.toString();
    }

    public int array667(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)) {
                n++;
            }
        }
        return n;
    }

    public boolean noTriples(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        else {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        else {
            for (int i = 0; i < nums.length - 2; i++) {
                if (Math.abs(nums[i+1] - (nums[i] + 5)) == 0 && Math.abs(nums[i+2] - (nums[i] - 1)) < 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
