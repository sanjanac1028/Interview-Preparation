package org.example.DesignPatterns.DependencyInjection.good;

/**
 * One more sub module for subtraction
 */
public class SubOperation implements CalculatorOperation{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
