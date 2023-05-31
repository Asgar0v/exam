package Task.three;

public class Task3 {
    public static void main(String[] args) {

        Song song = new Song();
        song.setArtist("Epi");
        song.setTitle("1 gun prezident olsam");
        song.setDuration(570);
        String duration = song.getDurationInMinutesAndSeconds();
        System.out.println("Duration: " + duration);

    }
}
