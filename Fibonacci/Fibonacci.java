package Fibonacci;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Fibonacci {
    private final ArrayList<Integer> fibonacciSeries = new ArrayList<>();

    public Fibonacci(){
        //Añadir los primeros valores a la serie de fibonacci
        fibonacciSeries.add(0);
        fibonacciSeries.add(1);
    }

    public List<Integer> getItem(int position){
        List<Integer> num;
        expandFibonacciSeries(position);
        num = fibonacciSeries.subList(0, position);

        return num;
    }

    private void expandFibonacciSeries(int index){
        for (int i = fibonacciSeries.size(); i < index; i++){
            fibonacciSeries.add(fibonacciSeries.get(i - 2) + fibonacciSeries.get(i - 1));
        }
    }
}
