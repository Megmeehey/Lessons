package lesson170726;

public interface HasExosceleton {
    abstract int getNumberOfSections();
}

abstract class Insect implements HasExosceleton {
    abstract int getNumberOfLegs();
}