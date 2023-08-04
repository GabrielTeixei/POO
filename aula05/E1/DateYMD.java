package aula05.E1;

public class DateYMD {

    private int year;
    private int month;
    private int day;
    


    public DateYMD(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

    }
    // getter e setter
    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        return year + "-" + month + "-" + day;
    }


    public void increment(int increment){

        while (increment > 0) {
            if (day + increment <= monthDays(month, year)) {
                day += increment;
                increment = 0;
            } else {
                increment -= monthDays(month, year) - day + 1;
                day = 1;
                if (month == 12) {
                    year++;
                    month = 1;
                } else {
                    month++;
                }
            }
        }
 
    }

    public void decrement(int decrement){
    
        while (decrement > 0) {
            if (day > decrement) {
                day -= decrement;
                decrement = 0;
            } else {
                decrement -= day;
                day = monthDays(month - 1, year);
                if (month == 1) {
                    year--;
                    month = 12;
                } else {
                    month--;
                }
            }
        }
        

        
    }
    


    

    public static boolean validMonth(int month){
        if (month > 0 && month < 13) {
            return true;
        } else {
            return false;
        }
    }

    public int  monthDays(int month, int year){
        int days = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            if (year % 4 == 0) {
                days = 29;
            } else {
                days = 28;
            }
        }
        return days;
    }

    public boolean leapYear(int year){
        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    } 

    public boolean valid(int day, int month, int year){
        if (validMonth(month) && day > 0 && day <= monthDays(month, year)) {
            return true;
        } else {
            return false;
        }
    }
    public static int getDaysInYear(int year2) {
        return 0;
    }
    public static int weekday(int year2, int month2, int i) {
        return 0;
    }
    public int dayOfYear() {
        return 0;
    }
    public int weekday() {
        return 0;
    }
    public static int getDaysInMonth(int year2, int month2) {
        return 0;
    }
    public static int getDayOfYear(int year2, int month2, int dayOfMonth) {
        return 0;
    }
    public void printMonth() {
    }
    public void setCalendar(int ano, int diaSemana) {
    }
    public void registerDate(DateYMD dateYMD) {
    }
    public void printDateRegistered() {
    }

    
}