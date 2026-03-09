public class LabDemo {

    public static void main(String[] args) {

        Date d1 = new Date(3,10,2026);
        Date d2 = new Date(3,5,2026);

        Lab lab1 = new Lab("Computer Science","A","Programming Lab",50,10,d1);
        Lab lab2 = new Lab("Software Engineering","B","Networking Lab",40,5,d2);

        Lab lab3 = new Lab("Computer Engineering","C","Programming Lab",50,10,d1);

        lab1.bookComputers(5);
        lab1.cancelBooking(3);

        System.out.println();

        System.out.println("Lab 1 Details:");
        System.out.println(lab1);

        System.out.println("Lab 2 Details:");
        System.out.println(lab2);

        System.out.println("Lab 3 Details:");
        System.out.println(lab3);

        if(lab1.equals(lab3))
            System.out.println("Lab1 and Lab3 are equal.");
        else
            System.out.println("Lab1 and Lab3 are NOT equal.");

        System.out.println("\nTotal Labs Created: " + Lab.getTotalLabs());
    }
}