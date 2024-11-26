package Fibonacci;

public class Controller {
    private final View view;
    private final Fibonacci fibonacci;

    public Controller(){
        int option;

        view = new View();
        fibonacci = new Fibonacci();

        do {
            view.displayMenu();

            option = view.getOption();

            switch (option){
                case 1:
                    displayFibonacciList();
                    break;
                case 2:
                    displayFibonacciInPosition();
                    break;
                case 0:
                    view.sayGoodbye();
                    break;
                default:
                    view.alertNotValidOption();
            }
        }while (option != 0);
    }

    private int validatePosition(){
        int position = view.getFibonacciPosition();

        while (position < 0){
            view.alertInvalidPosition();
            position = view.getFibonacciPosition();
        }

        return position;
    }

    private void displayFibonacciInPosition(){
        int position = validatePosition();
        view.displayFibonacciNum(position, fibonacci.getItemNum(position));
    }

    private void displayFibonacciList(){
        int position = validatePosition();
        view.displayFibonacciList(position, fibonacci.getItemList(position));
    }
}
