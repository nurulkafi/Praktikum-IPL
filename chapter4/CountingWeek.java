public class CountingWeek {
    public static int getNumberOfDays(int month, int year) {
        if (month == 2)
            return year % 4 == 0 ? 29 : 28;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        return 31;
    }
    public static int sumWeek() {
        int totalsunday = 0;
        int currentDay = 2;
        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day <= getNumberOfDays(month, year); day++) {
                    currentDay++;
                    if (currentDay == 7) {
                        if (day == 1)
                            totalsunday++;
                        currentDay = 0;
                    }
                }
            }
        }
        return totalsunday;
    }


    public static void main(String[] args) {
        System.out.println("Banyak hari Minggu Dari 1 Jan 1901 hingga 31 Des 2000 adalah : " + sumWeek());
    }

}