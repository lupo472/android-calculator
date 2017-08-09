package com.example.lucaantilici.calculator.logic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

import javax.xml.validation.Validator;

/**
 * Created by Luca.Antilici on 27/06/2017.
 */

@SuppressWarnings("Since15")
public class Calculator {

    private Double numberOne;
    private Operation operator;
    private static Calculator calculator;

    private Calculator(){
        this.numberOne = Double.valueOf(0);
    }

    public static Calculator getInstance(){
        if(calculator != null){
            return calculator;
        }else {
            return new Calculator();
        }
    }

    public void reset(){
        this.numberOne = Double.valueOf(0);
        this.operator = null;
    }


    public void add(Double number) {
        if(number != null) {
            this.numberOne = number;
            this.operator = new Operation() {
                @Override
                public Double apply(Double numberOne, Double numberTwo) {
                    Double result = numberOne + numberTwo;
                    return result;
                }
            };
        }
    }

    public void minus(Double number) {
        if(number != null) {
            this.numberOne = number;
            this.operator = new Operation() {
                @Override
                public Double apply(Double numberOne, Double numberTwo) {
                    Double result = numberOne - numberTwo;
                    return result;
                }
            };
        }
    }

    public void multiply(Double number) {
        if(number != null) {
            this.numberOne = number;
            this.operator = new Operation() {
                @Override
                public Double apply(Double numberOne, Double numberTwo) {
                    Double result = numberOne * numberTwo;
                    return result;
                }
            };
        }
    }

    public void divide(Double number) {
        if(number != null) {
            this.numberOne = number;
            this.operator = new Operation() {
                @Override
                public Double apply(Double numberOne, Double numberTwo) {
                    Double result = numberOne / numberTwo;
                    return result;
                }
            };
        }
    }

    public Double calculate(Double number){
        Double result = this.operator.apply(this.numberOne, number);
        return result;
    }


    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }


    public Operation getOperator() {
        return operator;
    }

    public void setOperator(Operation operator) {
        this.operator = operator;
    }
}
