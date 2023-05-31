package Task.three;

public class Song {
    private String title;
    private String artist;
    private int duration; // in seconds

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public Song() {

    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Convert duration to minutes and seconds
    public String getDurationInMinutesAndSeconds() {
        int minutes = duration / 60;
        int seconds = duration % 60;
        return minutes + " minutes " + seconds + " seconds";
    }
}
