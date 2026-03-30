public class Media {
    // Attributes
    private int testAttribute;
    private String title;
    private double fileSize;
    private double duration;
    
    // Constructor
    public Media(String title, double fileSize, double duration) {
        this.title = title;
        this.fileSize = fileSize;
        this.duration = duration;
    }
    
    // Methods
    public void pause() {
        System.out.println("Media paused: " + title);
    }
    
    public void setTestAttribute(int value) {
        this.testAttribute = value;
    }
    
    public void display() {
        System.out.println("=== MEDIA ===");
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("==============");
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
    
    @Override
    public String toString() {
        return "Media[title=" + title + ", fileSize=" + fileSize + ", duration=" + duration + "]";
    }
}