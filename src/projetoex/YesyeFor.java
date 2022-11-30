package projetoex;

import java.util.ArrayList;

import java.util.List;


interface Strategy{
    double apply(double a, double b);
}
class maximo implements Strategy{

    @Override
    public double apply(double a, double b) {
        return a>b ? a : b;
    }
}

class minimo implements Strategy{

    @Override
    public double apply(double a, double b) {
        return a<b ? a : b;
    }
}

class context {
    private final Strategy strategy;

    context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double execute(double a, double b){
        return strategy.apply(a,b);
    }
}

public class YesyeFor {
    public static void main(String[] args) {
        minimo min = new minimo();
        context conte = new context(min);
        System.out.println(conte.execute(4.0, 5.0));
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        System.out.println(new context(Math::min).execute(4.0, 5.0));
    }
}
