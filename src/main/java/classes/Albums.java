package classes;

public class Albums {

    private int length;
    private int songCount;
    private String title;
    private String imageUrl;
    private String artist;

    public Albums(int length, int songCount, String title, String imageUrl, String artist) {
        this.length = length;
        this.songCount = songCount;
        this.title = title;
        this.imageUrl = imageUrl;
        this.artist = artist;
    }

    public int getLength() {
        return length;
    }

    public int getSongCount() {
        return songCount;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getArtist() {
        return artist;
    }
}
