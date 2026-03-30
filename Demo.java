public class Demo {
    
    public Demo() {
        // Default constructor
    }
    
    public static void main(String[] args) {
        // Create instances and demonstrate functionality
        
        // Audio object
        Audio audio = new Audio("Song Name", 5.5, 3.5, 320, "Artist Name");
        System.out.println("\n--- Audio Demo ---");
        audio.play();
        audio.display();
        audio.test(100);
        System.out.println(audio.toString());
        
        // Video object
        Video video = new Video("Movie Title", 1500.0, 120.0, 60, 1080);
        System.out.println("\n--- Video Demo ---");
        video.play();
        video.display();
        
        // Podcast object
        Podcast podcast = new Podcast("Tech Talk", 45.0, 60.0, 128, "Podcast Network", 
                                      "John Doe", 42);
        System.out.println("\n--- Podcast Demo ---");
        podcast.play();
        podcast.display();
        System.out.println(podcast.toString());
        
        // LiveStream object
        LiveStream stream = new LiveStream("Gaming Stream", 0.0, 0.0, 60, 1080, 
                                           true, "ProGamer123");
        System.out.println("\n--- LiveStream Demo ---");
        stream.play();
        stream.display();
        
        // Test inherited methods
        System.out.println("\n--- Testing Copied Methods ---");
        audio.pause();
        audio.stop();
        audio.setTestAttribute(42);
        System.out.println("Test Attribute: " + audio.getTestAttribute());
    }
}