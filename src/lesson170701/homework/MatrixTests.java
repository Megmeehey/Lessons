package lesson170701.homework;

import static lesson170701.homework.MatrixUtils.*;

/**
 * Created by Megmeehey on 04.07.2017.
 */
public class MatrixTests {
    public static void main(String[] args) {
        int[][] triangle = {
                {0,},
                {3, 4,},
                {6, 7, 8},
        };

        int[][] matrix = {
                {0, 1, 2},
                {3, 4, -5},
                {6, 7, 8},
        };

        // Arrays.toString() would give us array of links, which is not what expected, obviously.
        // Arrays.deepToString(), however, works fine
        // but doesn't add '\n' after each printed array.
        // So, i implemented own method.
        // System.out.println(Arrays.deepToString(matrix));
        print2DMatrix(matrix);
        System.out.println("Sums of rows w\\o negative nums (no matrix generation)");
        printRowNoNegativesSums(matrix);
        System.out.println();

        int[][] M = generate2DMatrix(3,3, 100);
        // System.out.println(Arrays.deepToString(M));
        print2DMatrix(M);
        System.out.println("Sums of rows w\\o negative nums (matrix generated)");
        printRowNoNegativesSums(M);
        // System.out.println("Sum of rows w\\o negative nums = " + sumIfNoNegatives(M));
    }
}