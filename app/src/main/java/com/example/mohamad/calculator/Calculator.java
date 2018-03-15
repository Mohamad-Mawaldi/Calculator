package com.example.mohamad.calculator;


import org.javia.arity.Symbols;
import org.javia.arity.SyntaxException;

class Calculator {

    private final Symbols symbols;
    public Calculator() {
        symbols = new Symbols();}

    public boolean expressionCheck(String expression) {
        if   (expression.endsWith(".") || expression.endsWith("*") || expression.endsWith("+") ||
                expression.endsWith("-") || expression.endsWith("/")
                ) {
            return false;
        } else if (expression.equals("")) {
            return false;
        } else {
            return true;
        }
    }


    public void concatenateNumber(String number) {
            MainActivity.expression += number;
    }


    public void concatenateSign(String operator) {
        if (expressionCheck( MainActivity.expression)) {
            MainActivity.expression += operator;
        }
    }


    public void Percentage() {
        if (expressionCheck( MainActivity.expression)) {
            MainActivity.expression += "%";
        }
    }
      public void concatenatePlusOrMinus(){
        if (expressionCheck( MainActivity.expression)) {
            MainActivity.expression += "±";
        }

    }

    public void concatenateDOT() {
        if (expressionCheck( MainActivity.expression)) {
            MainActivity.expression += ".";
        }
    }



    public void evaluate() {
        if (expressionCheck( MainActivity.expression)) {
            try {
                Double theResult = symbols.eval( MainActivity.expression);
                MainActivity.expression = Double.toString(theResult);

            } catch (SyntaxException e) {
                e.printStackTrace();
            }
        }
    }


}