package LeapYear;

public class Controller {
    private final View view;

    public Controller(){
        view = new View();

        Year year = new Year(getYear());

        int option;
        do {
            view.displayMenu();

            option = view.getOption();

            switch (option){
                case 1:
                    year.setYear(getYear());
                    break;
                case 2:
                    view.sayIfIsLeapYear(year.getYear(), year.isLeapYear());
                    break;
                case 0:
                    view.sayGoodbye();
                    break;
                default:
                    view.optionNotValid();
            }
        }while (option != 0);
    }

    private int getYear(){
        int year;
        do {
            year = view.getYear();
        }while (year < 0);
        return year;
    }
}
