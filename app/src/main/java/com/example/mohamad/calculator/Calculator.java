package com.example.mohamad.calculator;

import org.javia.arity.Symbols;
import org.javia.arity.SyntaxException;

class Calculator {

    private final Symbols symbols;
    public Calculator() {
        symbols = new Symbols();}

/**
 * check expression if it ends with a sign
 * @param 'expression'
 */
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
    /**
     * concatenate numbers with the expression
     * @param 'number'
     */
    public void concatenateNumber(String number) {
            MainActivity.expression += number;
    }
    /**
     * if the expression passes expressionCheck then
     * add a sign to the expression
     * '@param 'Sign'
     */

    public void concatenateSign(String Sign) {
        if (expressionCheck( MainActivity.expression)) {
            MainActivity.expression += Sign;
        }
    }

    /**
     * if the expression passes expressionCheck then
     * use 'symbols' to evaluate the expression
     * and save the result in 'expression'
     */
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