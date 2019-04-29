package com.example.getveggiesfruits;

public class Event {
    public String Name;
    public int Count;

    public Event(String name, int countIn) {
        this.Name = name;
        this.Count = 0;
    }

    public int getCount()
    {
        return Count;
    }

    public void setCountUp(int countIn)
    {
        Count=countIn+1;
    }

    public String getName()
    {
        return Name;
    }
}
