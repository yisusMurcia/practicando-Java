package multiplicationTable;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private final View view;
    private final MultiplicationTable multiplicationTable;
    public Controller(){
        view = new View(this);
        multiplicationTable = new MultiplicationTable(0);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("setNum".equals(e.getActionCommand())){
            multiplicationTable.setNum(view.getNum());

            view.displayMultiplicationTAble(multiplicationTable.getNum(), multiplicationTable.getMultiplicationTable());

        }
    }
}
