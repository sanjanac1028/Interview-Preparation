package org.example.DesignPatterns.DependencyInjection.good;
/**
 * As per DIP rule it states :
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * --- So low level is dependant via CalculatorOperation rather being depends on add or subtract operations.
 * Abstractions should not depend on details. Details should depend on abstractions
 * ---Abstraction is achieved as via interface we are entering in low level.
 * */

public class Calculator {
    public int calculate(int num1,int num2,CalculatorOperation calculatorOperation)
    {
        return calculatorOperation.calculate(num1,num2);
    }
}
