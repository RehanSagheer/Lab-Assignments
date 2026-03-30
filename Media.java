public class Media {
    protected double fileSize; 
    protected String duration;

    public Media(double fileSize, String duration) {
        this.fileSize = fileSize;
        this.duration = duration;
    }

    public void play() { 
        System.out.println("Media is playing..."); 
    }
    
    public void pause() { 
        System.out.println("Media is paused."); 
    }
    
    public void stop() { 
        System.out.println("Media has stopped."); 
    }

    public void display() {
        System.out.println("File Size: " + fileSize + "MB, Duration: " + duration);
    }

    @Override
    public String toString() {
        return "Media [Size=" + fileSize + "MB, Duration=" + duration + "]";
    }
}