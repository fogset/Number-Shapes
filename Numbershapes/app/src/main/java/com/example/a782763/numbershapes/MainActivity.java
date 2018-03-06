package com.example.a782763.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean checktrig(int num){

        int calc_num = 8*num +1;
        int t = (int) Math.sqrt(calc_num);
        if (t*t==calc_num) {

            return true;}
        else{

            return false;}
    }

    public boolean checksqrt(int check){
        double sqrt = Math.sqrt(check);
        int x = (int)sqrt;

        if(sqrt*sqrt == x*x) {

                return true;
            }
        else{
                return false;
            }

    }


    public void UserInput(){
        EditText input = (EditText)findViewById(R.id.editText);
        int inputInt =Integer.parseInt(input.getText().toString());

        if(checksqrt(inputInt)==true &&checktrig(inputInt)==true){
            Toast.makeText(this, input.getText().toString() + " is a square number and a triangular number", Toast.LENGTH_SHORT).show();
        }else if(checksqrt(inputInt)==false&&checktrig(inputInt)==true){
            //Log.i(input.getText().toString(), " is a square number");
            Toast.makeText(this, input.getText().toString() + " is not a square number but a triangular number", Toast.LENGTH_SHORT).show();
        }else if(checksqrt(inputInt)==true&&checktrig(inputInt)==false){
            Toast.makeText(this, input.getText().toString() + " is a square number but not a triangular number", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, input.getText().toString() + " is not square number or a triangular number", Toast.LENGTH_SHORT).show();
        }
    }
    public void click(View view){
        UserInput();
    }
}
