/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schereja
 */
public class CalculateService {
    private double length;
    private double width;
    
    /**
     * Calculate service constructor which takes the length and width and sends
     * private variables
     * 
     * @param length - String value from the input box
     * @param width  - String value from the input box
     */
    public CalculateService(String length, String width){
        setLength(Double.parseDouble(length));
        setWidth(Double.parseDouble(width));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    
    
}
