package org.example.DesignPatterns.DependencyInjection.bad;


/**
 * Parent module or main module of calculator which help to calculate
 * as per user's choice.
 * As per DIP rule it states :
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * --- So above rule is broken our calculator class is directly dependent on low level class.
 * Abstractions should not depend on details. Details should depend on abstractions
 * --- Also is dependent on actual class.
 */

public class Calculator {
    public int calculate(int num1,int num2,String operation)
    {
        int result =0;
        switch (operation){
            case "add" :

                AddOperation addOperation = new AddOperation();
                result = addOperation.add(num1,num2);


            case "sub" :
                SubOperation subOperation = new SubOperation();
                result = subOperation.sub(num1,num2);

        }
        return result;
    }
}
