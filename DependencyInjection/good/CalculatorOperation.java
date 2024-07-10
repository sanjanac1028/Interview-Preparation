package org.example.DesignPatterns.DependencyInjection.good;
/**
 * This is low level modules interface so anything
 * to invoke in low level modules needs to go via this interface
 * by this we will achieve both loosely couple between high level and low level moduler
 * and abstraction as well.
 */
public interface CalculatorOperation {
    public int calculate(int a, int b);
}
