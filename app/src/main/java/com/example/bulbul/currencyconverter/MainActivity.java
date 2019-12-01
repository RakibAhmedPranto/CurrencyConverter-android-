package com.example.bulbul.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickMe(View view){

        try{
            //Find Id and Stored
            EditText editTextAmount = (EditText) findViewById(R.id.amountText);
            EditText editTextDollar= (EditText) findViewById(R.id.editText);
            EditText editTextPound= (EditText) findViewById(R.id.editText2);
            EditText editTextEuro= (EditText) findViewById(R.id.editText3);
            EditText editTextRial= (EditText) findViewById(R.id.editText4);

            //Converting to Double
            Double BdtAmountDouble=Double.parseDouble(editTextAmount.getText().toString());

            //Corency Convert
            Double DollarAmount=BdtAmountDouble/81.05 ;
            Double PoundAmount=BdtAmountDouble/105.75;
            Double EuroAmount=BdtAmountDouble/95.43;
            Double RialAmount=BdtAmountDouble/21.61;

            //show currency in EditText
            editTextDollar.setText(" "+DollarAmount);
            editTextPound.setText(""+PoundAmount);
            editTextEuro.setText(""+EuroAmount);
            editTextRial.setText(""+RialAmount);

        }catch (Exception e){
            //Exception Toast
            Toast.makeText(MainActivity.this,"Please Enter any amount of BDT",Toast.LENGTH_SHORT).show();
        }


    }
    public void clearData( View view){


            EditText editTextAmount = (EditText) findViewById(R.id.amountText);
            EditText editTextDollar= (EditText) findViewById(R.id.editText);
            EditText editTextPound= (EditText) findViewById(R.id.editText2);
            EditText editTextEuro= (EditText) findViewById(R.id.editText3);
            EditText editTextRial= (EditText) findViewById(R.id.editText4);

            editTextAmount.setText("");
            editTextDollar.setText("");
            editTextPound.setText("");
            editTextEuro.setText("");
            editTextRial.setText("");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
