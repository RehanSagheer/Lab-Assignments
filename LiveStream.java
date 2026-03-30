public class LiveStream {
    // Media attributes (copied from Media class)
    private int testAttribute;
    private String title;
    private double fileSize;
    private double duration;
    
    // Video attributes (copied from Video class)
    private int frameRate;
    private int resolution;
    
    // LiveStream-specific attributes
    private boolean isLive;
    private String streamerName;
    
    // Constructor
    public LiveStream(String title, double fileSize, double duration, int frameRate, int resolution,
                      boolean isLive, String streamerName) {
        this.title = title;
        this.fileSize = fileSize;
        this.duration = duration;
        this.frameRate = frameRate;
        this.resolution = resolution;
        this.isLive = isLive;
        this.streamerName = streamerName;
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
    
    // Video methods (copied from Video class)
    public int getFrameRate() {
        return this.frameRate;
    }
    
    public int getResolution() {
        return this.resolution;
    }
    
    // LiveStream-specific methods
    public void display() {
        System.out.println("=== LIVE STREAM ===");
        System.out.println("Title: " + title);
        System.out.println("Streamer: " + streamerName);
        System.out.println("Status: " + (isLive ? "LIVE" : "OFFLINE"));
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Frame Rate: " + frameRate + " fps");
        System.out.println("Resolution: " + resolution + "p");
        System.out.println("====================");
    }
    
    public boolean getIsLive() {
        return this.isLive;
    }
    
    public String getStreamerName() {
        return this.streamerName;
    }
}