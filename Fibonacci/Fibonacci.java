package Fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private final ArrayList<Integer> fibonacciSeries = new ArrayList<>();

    public Fibonacci(){
        //Añadir los primeros valores a la serie de fibonacci
        fibonacciSeries.add(0);
        fibonacciSeries.add(1);
    }

    public List<Integer> getItemList(int position){
        expandFibonacciSeries(position);
        return fibonacciSeries.subList(0, position);
    }

    public int getItemNum(int position){
        expandFibonacciSeries(position);
        return fibonacciSeries.get(position -1);
    }

    private void expandFibonacciSeries(int index){
        for (int i = fibonacciSeries.size(); i < index; i++){
            fibonacciSeries.add(fibonacciSeries.get(i - 2) + fibonacciSeries.get(i - 1));
        }
    }
}
