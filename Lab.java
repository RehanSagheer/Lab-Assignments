class Lab {

    private static int counter = 0;
    private static final String ID_PREFIX = "CMST_";

    private String id;
    private String universityName;
    private String departmentName;
    private String sectionName;
    private String labName;
    private int totalComputers;
    private int bookedComputers;
    private Date labDate;

    private String generateID() {
        counter++;
        return ID_PREFIX + counter;
    }

    public Lab(String dept, String sec, String lab,
               int total, int booked, Date date) {

        id = generateID();
        universityName = "COMSATS Lahore";
        departmentName = dept;
        sectionName = sec;
        labName = lab;
        totalComputers = total;
        bookedComputers = booked;
        labDate = new Date(date);
    }

    public Lab(Lab other) {
        id = generateID();
        universityName = other.universityName;
        departmentName = other.departmentName;
        sectionName = other.sectionName;
        labName = other.labName;
        totalComputers = other.totalComputers;
        bookedComputers = other.bookedComputers;
        labDate = new Date(other.labDate);
    }

    public void bookComputers(int count) {
        System.out.println("Booking " + count + " computers in Lab1...");
        bookedComputers += count;
    }

    public void cancelBooking(int count) {
        System.out.println("Cancelling " + count + " computers in Lab1...");
        bookedComputers -= count;
    }

    public static int getTotalLabs() {
        return counter;
    }

    public boolean equals(Lab l) {
        return this.labName.equals(l.labName) &&
               this.departmentName.equals(l.departmentName) &&
               this.labDate.equals(l.labDate);
    }

    public String toString() {
        return "Lab ID: " + id +
               "\nUniversity Name: " + universityName +
               "\nDepartment Name: " + departmentName +
               "\nSection Name: " + sectionName +
               "\nLab Name: " + labName +
               "\nTotal Computers: " + totalComputers +
               "\nBooked Computers: " + bookedComputers +
               "\nLab Date: " + labDate + "\n";
    }
}