package lesson170731.theater;

class Cinema {
    private String name;
    public Cinema(String name) {this.name = name;}
}
// Two mistakes
// No constructor w\o args
// public class Movie extends Cinema {
public class Movie {
    // public Movie(String movie) {}
    public static void main(String[] showing) {
        // Access to private field
        // System.out.println(new Movie("Another Trilogy").name);

    }
}
