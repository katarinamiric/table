/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author student1
 */
public class Math {

    private int a;
    private int b;
    private double result;
    private MathOperator mathOperator;

    public Math() {
    }

    public Math(int a, int b, double result, MathOperator mathOperator) {
        this.a = a;
        this.b = b;
        this.result = result;
        this.mathOperator = mathOperator;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public MathOperator getMathOperator() {
        return mathOperator;
    }

    public void setMathOperator(MathOperator mathOperator) {
        this.mathOperator = mathOperator;
    }

    @Override
    public String toString() {
        return "Math{" + "a=" + a + ", b=" + b + ", result=" + result + ", mathOperator=" + mathOperator + '}';
    }
    
}
