package org.example.DesignPatterns.OpenClosed;

public class BadCalculator {
   public int calculateNumber(int num1, int num2, String type)
    {
        int result=0;
        switch(type)
        {
            case "sum" : result = num1+num2;
            case "sub" : result = num1-num2;
        }
        return result;
    }
}
