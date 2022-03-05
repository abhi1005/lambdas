package assignment7.lambdas;

import java.util.function.BiFunction;

enum Operator{
    PLUS((x,y) -> ((double)x + (double)y)),
    MINUS((x,y) -> ((double)x - (double)y)),
    DIVIDE((x,y) -> ((double)x / (double)y)),
    MULTIPLY((x,y) -> ((double)x * (double)y))
    ;

    private final BiFunction<Double, Double, Double> function;

    Operator(BiFunction biFunction){
        this.function = biFunction;
    }

    public BiFunction<Double, Double, Double> getFunction() {
        return function;
    }
}