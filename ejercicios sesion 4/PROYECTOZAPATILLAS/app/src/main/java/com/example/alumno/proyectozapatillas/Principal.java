package com.example.alumno.proyectozapatillas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class Principal extends AppCompatActivity
{
    Spinner SPNMARCA,SPNTALLA;
    EditText TXTNUMPARES,TXTRESULTADO;
    Button BTNCALCULAR;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        SPNMARCA=(Spinner)findViewById(R.id.SPNMARCA);
        SPNTALLA=(Spinner)findViewById(R.id.SPNTALLA);
        TXTNUMPARES=(EditText)findViewById(R.id.TXTNUMEROPARES);
        TXTRESULTADO=(EditText)findViewById(R.id.TXTRESULTADO);
        BTNCALCULAR=(Button)findViewById(R.id.BTNCALCULAR);


    }
    public void Calcular()

    {

    }
}
