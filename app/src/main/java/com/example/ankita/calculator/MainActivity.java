package com.example.ankita.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String num1 = "", total = "", msg = "";
    public char op = '#';


    public void display(String n) {
        TextView t = (TextView) findViewById(R.id.screen);
        t.setText(n);
        //t.append(n);
    }

    public void dis(String n) {

        TextView t = (TextView) findViewById(R.id.screen);
        //t.setText(n);
        t.append(n);

    }


    public void ac(View view) {
        num1 = "";
        total = "";
        op = '#';
        msg = num1;
        display(msg);

    }

    public void reset() {
        num1 = "";
        total = "";
        op = '#';
        msg = num1;
        display(msg);

    }

    public void one(View view) {

        num1 = num1 + "1";
        msg += "1";
        display(msg);

    }

    public void two(View view) {


        num1 = num1 + "2";
        msg += "2";
        display(msg);

    }

    public void three(View view) {


        num1 = num1 + "3";
        msg += "3";
        display(msg);
    }

    public void four(View view) {


        num1 = num1 + "4";
        msg += "4";
        display(msg);


    }

    public void five(View view) {

        num1 = num1 + "5";
        msg += "5";
        display(msg);

    }

    public void six(View view) {


        num1 = num1 + "6";
        msg += "6";
        display(msg);

    }

    public void seven(View view) {


        num1 = num1 + "7";
        msg += "7";
        display(msg);

    }

    public void eight(View view) {


        num1 = num1 + "8";
        msg += "8";
        display(msg);

    }

    public void nine(View view) {


        num1 = num1 + "9";
        msg += "9";
        display(msg);
    }

    public void zero(View view) {


        num1 = num1 + "0";
        msg += "0";
        display(msg);

    }

    public void dot(View view) {
        if (op == '.')
            reset();
        else

        {
            num1 = num1 + ".";
            msg += ".";
            display(msg);
        }
    }

    public void plus(View view) {
        if ((op != '+'))


        {
            /*if (num1.equals(""))
                num1 = "0";*/
            if (total.equals(""))
                total = num1;
            msg = total + "+";
            display(msg);

            //display("+");
            op = '+';
            num1 = "";
        }

    }

    public void minus(View view) {
        if (op != '-') {
            /*if (num1.equals(""))
                num1 = "0";*/
            if (total.equals(""))
                total = num1;
            msg = total + "-";
            display(msg);
            op = '-';
            num1 = "";
        }
    }

    public void multiply(View view) {


        if (op != '*') {
           /* if (num1.equals(""))
                num1 = "0";*/
            if (total.equals(""))
                total = num1;
            msg = total + "X";
            display(msg);
            op = '*';
            num1 = "";
        }

    }

    public void divide(View view) {
        if (op != '/') {
            /*if (num1.equals(""))
                num1 = "0";*/
            if (total.equals(""))
                total = num1;
            msg = total + "/";
            display(msg);
            op = '/';
            num1 = "";
        }
    }


    public void equal(View view)

    {
        //total=num1;
        if ((total.equals("")) || (num1.equals(""))) {
            display("");
            num1 = "";
            total = "";
            reset();
            return;
        }
        dis("=");

        float tot = 0;
        float n1 = Float.parseFloat(total);
        float n2 = Float.parseFloat(num1);
        switch (op) {
            case '+':
                tot = n1 + n2;

                break;
            case '-':
                tot = n1 - n2;
                break;
            case '*':
                tot = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    tot = n1 / n2;
                    break;
                } else reset();
                break;
            default:
                reset();
                break;
        }


        String msg = String.valueOf(tot);
        display(msg);
        num1 = msg;
        total = "";
        op = '.';

    }
}
