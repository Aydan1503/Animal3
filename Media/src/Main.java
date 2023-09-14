// Abstract class Media
abstract class Media {
    private String title;
    private int duration;


    // Constructor
    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }


    // Getter and Setter methods using encapsulation
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public int getDuration() {
        return duration;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }




    abstract void play();
}


// Subclass Music
class Music extends Media {
    // Constructor
    public Music(String title, int duration) {
        super(title, duration);
    }


    // Override the play() method
    @Override
    void play() {
        System.out.println("Playing music: " + getTitle());
    }
}


// Subclass Movie
class Movie extends Media {
    // Constructor
    public Movie(String title, int duration) {
        super(title, duration);
    }


    // Override the play() method
    @Override
    void play() {
        System.out.println("Playing movie: " + getTitle());
    }
}


public class Main {
    public static void main(String[] args) {


        Media music = new Music("Song Title", 180);
        music.play();


        Media movie = new Movie("Movie Title", 120);
        movie.play();
    }
}
