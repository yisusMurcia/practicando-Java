package Calculator;

public class Controller {
    private final View view;
    private final Calculator calculator;

    public Controller(){
        view = new View();

        calculator = new Calculator(view.getNum(), view.getNum());

        int option;

        do {
            view.displayMainMenu();

            option = view.getOption();

            switch (option){
                case 1:
                    doCalculations();
                    break;
                case 2:
                    calculator.setNum1(view.getNum());
                    calculator.setNum2(view.getNum());
                    break;
                case 0:
                    view.sayGoodbye();
                    break;
                default:
                    view.displayNoValidOption();
            }
        }while (option != 0);
    }

    private void doCalculations(){
        String operation;
        view.displayOperations();
        operation = getValidOperation();

        double result = 0;

        switch (operation){
            case "+":
                result = calculator.sum();
                break;
            case "-":
                result = calculator.rest();
                break;
            case "*":
                result = calculator.multiply();
                break;
            case "/":
                if(calculator.getNum2() == 0){
                    view.alertDivisionBy0();
                    result = 0;
                }else{
                    result = calculator.divide();
                }
                break;
            default:
                view.alertNoValidOperation();
        }

        view.displayResult(calculator, operation, result);
    }

    private String getValidOperation(){
        String operation;

        operation = view.getOperation();

        while(!"+-/*".contains(operation) || operation.length() != 1){
            view.alertNoValidOperation();
            operation = view.getOperation();
        }

        return operation;

    }
}
