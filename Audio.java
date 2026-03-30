public class Audio extends Media {
    protected int bitrate; 
    protected String artist;

    public Audio(double fileSize, String duration, int bitrate, String artist) {
        super(fileSize, duration);
        this.bitrate = bitrate;
        this.artist = artist;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bitrate: " + bitrate + "kbps, Artist: " + artist);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Audio [Bitrate=" + bitrate + "kbps, Artist=" + artist + "]";
    }
}