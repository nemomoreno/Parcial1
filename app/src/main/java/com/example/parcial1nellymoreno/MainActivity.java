package com.example.parcial1nellymoreno;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.*;
import android.os.*;
import android.text.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText emp, sal, hextras, valorextra, pension, salud, saltotal;
    Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emp=findViewById(R.id.txtn1);
        sal=findViewById(R.id.txtn2);
        hextras=findViewById(R.id.txtn3);
        valorextra=findViewById(R.id.txtn4);
        pension=findViewById(R.id.txtpension);
        salud=findViewById(R.id.txtsalud);
        saltotal=findViewById(R.id.txtsalariototal);

        calc=findViewById(R.id.calcular);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.smlv:
                //877,803
                this.sal.setText("877803");
                break;
            case R.id.limpiar:
                this.emp.setText("");
                this.sal.setText("");
                this.hextras.setText("");
                this.valorextra.setText("");
                this.pension.setText("");
                this.salud.setText("");
                this.saltotal.setText("");
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view){
        double salario, pension, salud, salariototal, valorhe;
        int he;

        salario=Double.parseDouble(sal.getText().toString());
        valorhe=Double.parseDouble(valorextra.getText().toString());
        he=Integer.parseInt(hextras.getText().toString());

        salario=salario+(valorhe*he);
        pension=salario*0.04;
        salariototal=salario-(pension*2);

        this.pension.setText(String.valueOf(pension));
        this.salud.setText(String.valueOf(pension));
        this.saltotal.setText(String.valueOf(salariototal));

    }

}