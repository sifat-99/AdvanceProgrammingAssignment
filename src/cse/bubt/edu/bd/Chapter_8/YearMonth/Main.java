package cse.bubt.edu.bd.Chapter_8.YearMonth;
public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(6, 14, 1992);
        Date date2 = new Date("June", 14, 1992);
        Date date3 = new Date(166, 1992);

        System.out.println("MM/DD/YYYY format: " + date1.toMMDDYYYY());
        System.out.println("Month DD, YYYY format: " + date2.toMonthDDYYYY());
        System.out.println("DDD YYYY format: " + date3.toDDDYYYY());
    }
}
