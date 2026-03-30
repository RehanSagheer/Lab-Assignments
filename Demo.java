public class Demo {
    public static void main(String[] args) {
        // 1. Base Class Object
        System.out.println("--- Testing Media ---");
        Media m = new Media(20.0, "10:00");
        m.play();
        m.display();
        System.out.println(m.toString());

        // 2. Intermediate Class Object
        System.out.println("\n--- Testing Audio ---");
        Audio a = new Audio(5.5, "04:20", 320, "Rehan Sagheer");
        a.pause();
        a.display();
        System.out.println(a.toString());

        // 3. Derived Class Object
        System.out.println("\n--- Testing Podcast ---");
        Podcast p = new Podcast(60.0, "45:00", 128, "Tech Talk", "Rehan Sagheer", 12);
        p.stop();
        p.display();
        System.out.println(p.toString());
    }
}