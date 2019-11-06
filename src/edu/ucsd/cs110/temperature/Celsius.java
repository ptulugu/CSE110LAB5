package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
       return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float temp = this.getValue();
        temp = (temp * 9/5) + 32;
        Temperature ret = new Fahrenheit(temp);
        return ret;

    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}