package lesson170724.homework;

/**
 * Created by megmeehey on 26.07.17.
 */
public class Cat implements Pet {
    Brain brain = new Cat.Hungry();

    @Override
    public void feed() {
        brain.feed();
    }

    @Override
    public void play() {
        brain.play();
    }

    class Fed implements Brain {

        @Override
        public void feed() {
            purr();
            meow();
        }

        @Override
        public void play() {
            meow();
            hunt();
            meow();
            brain = new Cat.Hungry();
        }
    }


    class Hungry implements Brain {

        @Override
        public void feed() {
            meow();
            eat();
            purr();
            purr();
            brain = new Cat.Fed();
        }

        @Override
        public void play() {
            meow();
            bite();
            meow();
        }
    }

    private void bite() {
        System.out.println("bites");
    }

    private void eat() {
        System.out.println("eats");
    }

    private void hunt() {
        System.out.println("hunts");
    }

    private void purr() {
        System.out.println("purrs");
    }

    private void meow() {
        System.out.println("meows");
    }

}