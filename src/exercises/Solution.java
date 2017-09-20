package exercises;

import java.util.Arrays;

/* What I wrote was:

public class Solution {
    public static void main(String[] args) {
        String sent[] = args[0].split("\\.");
        String words[] = sent[1].split("\\W+");
        System.out.println(Arrays.toString(words));
    }
}

We can use string.replace to replace something like "?!". But, that's really not that good idea.
We can use try {} catch {} to make sure, we not gettion AIOOBE, and there is a sentence after all.
 */

// But, we can just develop our regex, to catch all ru punctuation signs, that end the sentence.
// Still we looking for end of sentence, we cant use {punct} to split string.
// I think, maybe we can just list all of necessary punctuation signs.
public class Solution {
    public static void main(String[] args) {
        String s = "Two sentences?! The first one was short was short.";
        s = s.replaceAll("\\?!", "!"); // The way suggested in list
        String sent[] = s.split("\\.|\\?|!|…");
        String words[];
        try {
            words = sent[1].trim().split("\\W+"); // 29
            System.out.println(Arrays.toString(words));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no second sentence.");
        }
        // Last line in try block will printout all list of words in the second sentence, including empty word.
        // We getting empty word, coz original line has whitespace after ?!
        // Probably need to get rid of that.
        // If need to, we can use trim in line 29: sent[1].trim.split("\\W+");
    }
}