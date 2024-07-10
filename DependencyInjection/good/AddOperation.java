package org.example.DesignPatterns.DependencyInjection.good;
/**
 * So we will have this class , it will be taken care
 * via interface implementation.
 *
 */
public class AddOperation implements CalculatorOperation {
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
