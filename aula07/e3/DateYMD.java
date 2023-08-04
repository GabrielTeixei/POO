package aula07.e3;

public class DateYMD extends Date{

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

    public boolean valid(int day, int month, int year){
        if (validMonth(month) && day > 0 && day <= monthDays(month, year)) {
            return true;
        } else {
            return false;
      
        }
    }

    @Override
    public int compareTo(Date o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    @Override
    public Boolean validMonth(int m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validMonth'");
    }
    @Override
    public Boolean validDate(int d, int m, int a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validDate'");
    }
    @Override
    public String printt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printt'");
    }
    @Override
    public void incrementDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'incrementDate'");
    }
    @Override
    public void decrementDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'decrementDate'");
    }
    @Override
    public int decrementDatee(int dia, int mes, int ano) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'decrementDatee'");
    }
  
    public Boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public int daysUntil2000() {
        int days = 0;
    
        if (year > 2000) {
            for (int year2 = 2000; year2 < year; year2++) {
                days += leapYear(year2) ? 366 : 365;
            }
        } else {
            for (int year2 = year; year2 < 2000; year2++) {
                days -= leapYear(year2) ? 366 : 365;
            }
        }
        days += daysFromJan1();
        return days;
    }
    
    private int daysFromJan1() {
        int days = 0;
        for (int month2 = 1; month2 < month; month2++) {
            days += monthDays(month2, year);
        }
        days += day - 1;
        return days;
    }
    

    
    
    

    
}