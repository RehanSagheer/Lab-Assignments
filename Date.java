class Date {

    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public Date(Date other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }

    public String toString() {
        return day + "-" + month + "-" + year;
    }

    public boolean equals(Date d) {
        return day == d.day && month == d.month && year == d.year;
    }
}