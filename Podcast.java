public class Podcast extends Audio {
    private String hostName;
    private int episodeNumber;

    public Podcast(double fileSize, String duration, int bitrate, String artist, String hostName, int episodeNumber) {
        super(fileSize, duration, bitrate, artist);
        this.hostName = hostName;
        this.episodeNumber = episodeNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Host: " + hostName + ", Episode #: " + episodeNumber);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Podcast [Host=" + hostName + ", Episode=" + episodeNumber + "]";
    }
}