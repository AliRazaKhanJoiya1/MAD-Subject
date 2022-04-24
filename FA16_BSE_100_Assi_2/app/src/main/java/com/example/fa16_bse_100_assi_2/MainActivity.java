package com.example.fa16_bse_100_assi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView txt;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    int temp;
    int[] Array = new int[4];
    int i,j = 0;
    String[] ca=new String[4];
    int[] pass= {7,4,1,0};
    Object[] objArr1={Array};
    Object[] objArr2={pass};
    String[] read=new String[4];


    public void block(){
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b12.setEnabled(false);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);

        txt.setOnClickListener((View.OnClickListener) this);
        b1.setOnClickListener((View.OnClickListener) this);
        b2.setOnClickListener((View.OnClickListener) this);
        b3.setOnClickListener((View.OnClickListener) this);
        b4.setOnClickListener((View.OnClickListener) this);
        b5.setOnClickListener((View.OnClickListener) this);
        b6.setOnClickListener((View.OnClickListener) this);
        b7.setOnClickListener((View.OnClickListener) this);
        b8.setOnClickListener((View.OnClickListener) this);
        b9.setOnClickListener((View.OnClickListener) this);
        b10.setOnClickListener((View.OnClickListener) this);
        b11.setOnClickListener((View.OnClickListener) this);
        b12.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                txt.setText("7");
                temp = 7;
                Array[i] = temp;
                i++;
                if ( i==4 && Arrays.deepEquals(objArr1,objArr2)) {
                    Toast.makeText(getApplicationContext(), "right key  ", Toast.LENGTH_SHORT).show();
                    b10.setEnabled(true);
                    Array = new int[4];

                    i = 0;
                    block();

                }else if(i==4){
                    Toast.makeText(getApplicationContext(), "wrong key  ", Toast.LENGTH_SHORT).show();
                    Array = new int[4];

                    i = 0;
                    block();

                }

                break;
            case R.id.button2:
                txt.setText("8");
                temp = 8;
                Array[i] = temp;
                i++;
                if ( i==4 && Arrays.deepEquals(objArr1,objArr2)) {
                    Toast.makeText(getApplicationContext(), "right key  ", Toast.LENGTH_SHORT).show();
                    b10.setEnabled(true);
                    Array = new int[4];
                    i = 0;
                    block();
                }else if(i==4){
                    Toast.makeText(getApplicationContext(), "wrong key  ", Toast.LENGTH_SHORT).show();
                    Array = new int[4];
                    i = 0;
                    block();
                }
                break;
            case R.id.button3:
                txt.setText("9");
                temp = 9;
                Array[i] = temp;
                i++;
                if ( i==4 && Arrays.deepEquals(objArr1,objArr2)) {
                    Toast.makeText(getApplicationContext(), "right key  ", Toast.LENGTH_SHORT).show();
                    b10.setEnabled(true);
                    Array = new int[4];
                    i = 0;
                    block();
                }else if(i==4){
                    Toast.makeText(getApplicationContext(), "wrong key  ", Toast.LENGTH_SHORT).show();
                    Array = new int[4];
                    i = 0;
                    block();
                }
                break;
            case R.id.button4:
                txt.setText("4");
                temp = 4;
                Array[i] = temp;
                i++;
                if ( i==4 && Arrays.deepEquals(objArr1,objArr2)) {
                    Toast.makeText(getApplicationContext(), "right key  ", Toast.LENGTH_SHORT).show();
                    b10.setEnabled(true);
                    Array = new int[4];
                    i = 0;
                    block();

                }else if(i==4){
                    Toast.makeText(getApplicationContext(), "wrong key  ", Toast.LENGTH_SHORT).show();
                    Array = new int[4];
                    i = 0;
                    block();
                }
                break;
            case R.id.button5:
                txt.setText("6");
                temp = 6;
                Array[i] = temp;
                i++;
                if ( i==4 && Arrays.deepEquals(objArr1,objArr2)) {
                    Toast.makeText(getApplicationContext(), "right key  ", Toast.LENGTH_SHORT).show();
                    b10.setEnabled(true);
                    Array = new int[4];
                    i = 0;
                    block();
                }else if(i==4){
                    Toast.makeText(getApplicationContext(), "wrong key  ", Toast.LENGTH_SHORT).show();
                    Array = new int[4];
                    i = 0;
                    block();
                }
                break;
            case R.id.button6:
                txt.setText("5");
                temp = 5;
                Array[i] = temp;
                i++;
                if ( i==4 && Arrays.deepEquals(objArr1,objArr2)) {
                    Toast.makeText(getApplicationContext(), "right key  ", Toast.LENGTH_SHORT).show();
                    b10.setEnabled(true);
                    Array = new int[4];
                    i = 0;
                    block();

                }else if(i==4){
                    Toast.makeText(getApplicationContext(), "wrong key  ", Toast.LENGTH_SHORT).show();
                    Array = new int[4];
                    i = 0;
                    block();

                }
                break;
            case R.id.button7:
                txt.setText("3");
                temp = 3;
                Array[i] = temp;
                i++;

                if ( i==4 && Arrays.deepEquals(objArr1,objArr2)) {
                    Toast.makeText(getApplicationContext(), "right key  ", Toast.LENGTH_SHORT).show();
                    b10.setEnabled(true);
                    Array = new int[4];
                    i = 0;
                    block();

                }else if(i==4){
                    Toast.makeText(getApplicationContext(), "wrong key  ", Toast.LENGTH_SHORT).show();
                    Array = new int[4];
                    i = 0;
                    block();

                }
                break;
            case R.id.button8:
                txt.setText("2");
                temp = 2;
                Array[i] = temp;
                i++;
                if ( i==4 && Arrays.deepEquals(objArr1,objArr2)) {
                    Toast.makeText(getApplicationContext(), "right key  ", Toast.LENGTH_SHORT).show();
                    b10.setEnabled(true);
                    Array = new int[4];
                    i = 0;
                    block();

                }else if(i==4){
                    Toast.makeText(getApplicationContext(), "wrong key  ", Toast.LENGTH_SHORT).show();
                    Array = new int[4];
                    i = 0;
                    block();

                }
                break;
            case R.id.button9:
                txt.setText("1");
                temp = 1;
                Array[i] = temp;
                i++;
                if (i==4 && Arrays.deepEquals(objArr1,objArr2)) {
                    Toast.makeText(getApplicationContext(), "right key  ", Toast.LENGTH_SHORT).show();
                    b10.setEnabled(true);
                    Array = new int[4];
                    i = 0;
                    block();
                }else if(i==4){
                    Toast.makeText(getApplicationContext(), "wrong key  ", Toast.LENGTH_SHORT).show();
                    Array = new int[4];
                    i = 0;
                    block();
                }

                break;
            case R.id.button12:
                txt.setText("0");
                temp = 0;
                Array[i] = temp;
                i++;
                if ( i==4 && Arrays.deepEquals(objArr1,objArr2)) {
                    Toast.makeText(getApplicationContext(), "right key  ", Toast.LENGTH_SHORT).show();
                    b10.setEnabled(true);
                    Array = new int[4];
                    i = 0;
                    block();
                }else if(i==4){
                    Toast.makeText(getApplicationContext(), "wrong key  ", Toast.LENGTH_SHORT).show();
                    Array = new int[4];
                    i = 0;
                    block();

                }
                break;
            case R.id.button10:
                txt.setText("");
                //Arrays.fill(Array, 0);
                Array=new int[4];
                i = 0;
                Intent intent = new Intent(MainActivity.this, safe.class);
                startActivity(intent);
                b10.setEnabled(false);
                break;

            case R.id.button11:
                txt.setText("");
                Array=new int[4];
                i=0;
                b10.setEnabled(false);
                Intent i = new Intent(MainActivity.this, MainActivity.class);
                // set the new task and clear flags
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                break;
          }
       }
    }
