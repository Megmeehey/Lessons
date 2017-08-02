package lesson170726;

/**
 * Created by megmeehey on 26.07.17.
 */
public interface HasExosceleton {
    abstract int getNumberOfSections();
}

abstract class Insect implements HasExosceleton {
    abstract int getNumberOfLegs();
}