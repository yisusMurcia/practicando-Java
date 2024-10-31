package LeapYear;

public class Year {
    private int year;
    private boolean isLeapYear;

    public Year(int year){
        this.year = year;
        setIsLeapYear();
    }
    private void setIsLeapYear(){
        //Para ser bisiesto debe ser multiplo de 4, pero no de 100, aunque si es multiplo de 400 también es bisiesto
        isLeapYear = (year %4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        setIsLeapYear();
    }

    public boolean isLeapYear() {
        return isLeapYear;
    }
}
