package lesson170701.classwork;

import java.util.Random;

/**
 * Created by Megmeehey on 29.06.2017.
 * Updated on 01.07.2017.
 * Generates Data
 */
public class DataGenerator {
    public static byte[] generate(int size, byte[] alphabet) {
        byte[] data = new byte[size];

        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            int letterIndex = random.nextInt(alphabet.length);
            data[i] = alphabet[letterIndex];
        }

        return data;
    }
}
