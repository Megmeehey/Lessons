package lesson170724.homework;

public class Rat implements Pet {

    Brain brain = new Hungry();

    @Override
    public void feed() {
        brain.feed();

        if (brain instanceof Hungry) {
            brain = new Fed();
        }
    }

    @Override
    public void play() {
        brain.play();

        if (brain instanceof Fed) {
            brain = new Hungry();
        }
    }
}

class Fed implements Brain {

    @Override
    public void feed() {
        run();
        sniff();
        run();
    }

    @Override
    public void play() {
        run();
        squeak();
        run();
    }

    private void squeak() {
        System.out.println("squeaks");
    }

    private void sniff() {
        System.out.println("sniffs");
    }

    private void run() {
        System.out.println("runs");
    }
}

class Hungry implements Brain {

    @Override
    public void feed() {
        run();
        squeak();
        sniff();
        eat();
        run();
    }

    @Override
    public void play() {
        run();
        squeak();
        bite();
        squeak();
        run();
    }

    private void bite() {
        System.out.println("bites");
    }

    private void run() {
        System.out.println("runs");
    }

    private void eat() {
        System.out.println("eats");
    }

    private void squeak() {
        System.out.println("squeaks");
    }

    private void sniff() {
        System.out.println("sniffs");
    }
}