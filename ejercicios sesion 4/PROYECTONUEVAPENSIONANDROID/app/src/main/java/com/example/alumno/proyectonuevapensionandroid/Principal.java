package com.example.alumno.proyectonuevapensionandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.example.alumno.proyectonuevapensionandroid.Bean.AlumnoBean;

public class Principal extends AppCompatActivity implements View.OnClickListener,RadioGroup.OnCheckedChangeListener
{
    EditText TXTPROMEDIO,TXTRESULTADO;
    RadioButton RDA,RDB,RDC,RDD;
    RadioButton RDINTERNO,RDEXTERNO;
    RadioGroup  RDGCATEGORIA,RDGTIPO;
    Button      BTNCALCULAR;

    AlumnoDAO  objAlumnoDAO;
    AlumnoBean objAlumnoBean;
    String categoria,tipo;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        categoria = "";
        TXTPROMEDIO=(EditText)findViewById(R.id.TXTPROMEDIO);
        BTNCALCULAR=(Button)findViewById(R.id.BTNCALCULAR);
        BTNCALCULAR.setOnClickListener(this);
        RDA=(RadioButton)findViewById(R.id.RDA);
        RDB=(RadioButton)findViewById(R.id.RDB);
        RDC=(RadioButton)findViewById(R.id.RDC);
        RDD=(RadioButton)findViewById(R.id.RDD);
        RDGCATEGORIA=(RadioGroup)findViewById(R.id.RDGCATEGORIA);
        RDGCATEGORIA.setOnCheckedChangeListener(this);
        RDINTERNO=(RadioButton)findViewById(R.id.RDINTERNO);
        RDEXTERNO=(RadioButton)findViewById(R.id.RDEXTERNO);
        RDGTIPO=(RadioGroup)findViewById(R.id.RDGTIPO);
        RDGTIPO.setOnCheckedChangeListener(this);
        TXTRESULTADO=(EditText)findViewById(R.id.TXTRESULTADO);
    }

    public void Calcular()
    {
      String  cat = categoria;
      String  tip=tipo;
      String  promediocad=TXTPROMEDIO.getText().toString();
      int  promedio=Integer.parseInt(promediocad);
      objAlumnoBean = new AlumnoBean();
      objAlumnoBean.set
      objAlumnoBean.setTipo(tip);
      objAlumnoBean.setPromedio(promedio);
      objalumnoDAO=new AlumnoDAO();
      String msj=objAlumnoDAO.CalculaOperacion(objAlumnoBean);
      TXTRESULTADO.setText(msj);

    }
    @Override
    public void onClick(View v)
    { if(v==BTNCALCULAR)
      {
         Calcular();
      }
    }

    @Override
    public void onCheckedChanged(RadioGroup  group, int checkedId)
    {
      if(group==RDGCATEGORIA)
      {
          if(RDA.isChecked())
          {
            categoria=RDA.getText().toString();
          }
          if(RDB.isChecked())
          {
            categoria=RDB.getText().toString();
          }
          if(RDC.isChecked())
          {
            categoria=RDC.getText().toString();

          }
          if(RDD.isChecked())
          {
            categoria=RDD.getText().toString();
          }
      }
      if(group==RDGTIPO)
      {
          if(RDINTERNO.isChecked())
          {
              tipo=RDINTERNO.getText().toString();
          }
          if(RDEXTERNO.isChecked())
          {
              tipo=RDEXTERNO.getText().toString();
          }
      }

    }

    private class AlumnoDAO {
    }

    private class AlumnoBean {
    }
}
