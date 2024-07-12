package org.example.DesignPatterns.SingletonPattern;

public class SerializableSingleton {

    private static SerializableSingleton instance = null;
    private SerializableSingleton(){}

    public static SerializableSingleton getInstance()
    {
        if(instance==null)
        {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    /**
     * This is the key method which is responsible during deserialization process
     * This method get invoked, and we are simply returning already created object
     * @return
     */

    protected  Object readResolve()
    {
        return instance;
    }
}
