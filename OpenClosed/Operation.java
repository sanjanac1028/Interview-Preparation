package org.example.DesignPatterns.OpenClosed;

public interface Operation {
    // This is good we keep adding new operation implementation
// and our calculator get extensions without modifying it main task
// that is performing calculation
    public int perform(int  num1,int num2);
}
