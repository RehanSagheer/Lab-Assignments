public class Audio {
    // Media attributes (copied from Media class)
    private int testAttribute;
    private String title;
    private double fileSize;
    private double duration;
    
    // Audio-specific attributes
    private int bitrate;
    private String artist;
    
    // Constructor
    public Audio(String title, double fileSize, double duration, int bitrate, String artist) {
        this.title = title;
        this.fileSize = fileSize;
        this.duration = duration;
        this.bitrate = bitrate;
        this.artist = artist;
    }
    
    // Media methods (copied from Media class)
    public void pause() {
        System.out.println("Media paused: " + title);
    }
    
    public void setTestAttribute(int value) {
        this.testAttribute = value;
    }
    
    public void stop() {
        System.out.println("Media stopped: " + title);
    }
    
    public void test() {
        System.out.println("Testing media: " + title);
    }
    
    public void play() {
        System.out.println("Playing media: " + title);
    }
    
    public int getTestAttribute() {
        return this.testAttribute;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public double getFileSize() {
        return this.fileSize;
    }
    
    public double getDuration() {
        return this.duration;
    }
    
    // Audio-specific methods
    public void test(int value) {
        System.out.println("Testing audio with value: " + value);
    }
    
    public void display() {
        System.out.println("=== AUDIO ===");
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Bitrate: " + bitrate + " kbps");
        System.out.println("==============");
    }
    
    public int getBitrate() {
        return this.bitrate;
    }
    
    public String getArtist() {
        return this.artist;
    }
    
    @Override
    public String toString() {
        return "Audio[title=" + title + ", fileSize=" + fileSize + ", duration=" + duration + 
               ", bitrate=" + bitrate + ", artist=" + artist + "]";
    }
}