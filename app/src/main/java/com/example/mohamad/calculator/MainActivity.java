package com.example.mohamad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Zero,One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Clear,Multiply,Divide,Minus,
            Plus,Equal,Double,Percent;
    private TextView Display;
    static String expression = "";
    Calculator calculator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Zero = (Button) findViewById(R.id.Zero);
        One = (Button) findViewById(R.id.One);
        Two = (Button) findViewById(R.id.Two);
        Three = (Button) findViewById(R.id.Three);
        Four = (Button) findViewById(R.id.Four);
        Five = (Button) findViewById(R.id.Five);
        Six = (Button) findViewById(R.id.Six);
        Seven = (Button) findViewById(R.id.Seven);
        Eight = (Button) findViewById(R.id.Eight);
        Nine = (Button) findViewById(R.id.Nine);
        Clear = (Button) findViewById(R.id.Cbutton);
        Plus = (Button) findViewById(R.id.PlusButton);
        Divide = (Button) findViewById(R.id.DivideButton);
        Multiply = (Button) findViewById(R.id.MultiplyButton);
        Minus = (Button) findViewById(R.id.MinusButton);
        Double = (Button) findViewById(R.id.DotButton);
        Equal = (Button) findViewById(R.id.EqualButton);
        Percent = (Button) findViewById(R.id.PercentButton);
        Display = (TextView) findViewById(R.id.TextView);

        calculator = new Calculator();

        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenateNumber(Zero.getText().toString());



            }
        });
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenateNumber(One.getText().toString());


            }
        });
        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                concatenateNumber(Two.getText().toString());



            }
        });
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  calculateChannel.onNumberClick(Three.getText().toString());

                concatenateNumber(Three.getText().toString());



            }
        });
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                concatenateNumber(Four.getText().toString());



            }
        });
        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                concatenateNumber(Five.getText().toString());


            }
        });
        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                concatenateNumber(Six.getText().toString());


            }
        });
        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                concatenateNumber(Seven.getText().toString());

            }
        });
        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                concatenateNumber(Eight.getText().toString());

            }
        });
        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                concatenateNumber(Nine.getText().toString());

            }
        });
        Clear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                expression = "";
                updateUI();
                return true;

            }
        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (expression.length() > 0) {
                    expression = expression.substring(0, expression.length() - 1);
                    updateUI();
                } else {}

            }
        });
        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                concatenateSign("+");

            }
        });
        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                concatenateSign("/");

            }
        });
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                concatenateSign("*");

            }
        });
        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenateSign("-");

            }
        });
        Double.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenateSign(".");

            }
        });
        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evaluate();

            }
        });
        Percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenateSign("%");
            }
        });


    }

    private void evaluate() {
        calculator.evaluate();
        updateUI();
    }


    private void concatenateSign(String operator) {
        calculator.concatenateSign(operator);
        updateUI();
    }

    private void concatenateNumber(String value){
        calculator.concatenateNumber(value);
        updateUI();}

    private void updateUI() {
        Display.setText(expression);}
}
