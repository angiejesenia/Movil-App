package com.example.alumno.proyectonuevapensionandroid.DAO;


import Bean.*;
import EMPRESA.ANDROID.DAO.*;


public class AlumnoDao
{
    AlumnoBean objAlumnoBean;



    public String CalculaOperacion(AlumnoBean objAlumnoBean)
    {
        String msj="";

        String categoria=objAlumnoBean.getCategoria();
        String tipo=objAlumnoBean.getTipo();
        int promedio=objAlumnoBean.getPromedio();

        this.objAlumnoBean=new AlumnoBean();
        this.objAlumnoBean.setCategoria(categoria);
        this.objAlumnoBean.setTipo(tipo);
        this.objAlumnoBean.setPromedio(promedio);

        int pension=CalcularPension(this.objAlumnoBean);
        this.objAlumnoBean.setPension(pension);
        double descuento=CalcularDescuento(this.objAlumnoBean);
        this.objAlumnoBean.setDescuento(descuento);
        double nuevapension=CalcularNuevaPension(this.objAlumnoBean);
        msj="La pension Actual"+pension+"\n"+
             "Descuento     :"+descuento+"\n"+
           "Nueva pension   :"+nuevapension;

        return msj;
    }
    public int CalcularPension(AlumnoBean objAlumnoBean)
    {
        int pension=0;
        if(objAlumnoBean.getCategoria().equals("A"))
        {
          if(objAlumnoBean.getTipo().equals("INTERNO"))
          {
              pension=600;
          }
          else
          { if(objAlumnoBean.getTipo().equals("EXTERNO"))
            {
              pension=550;
            }
          }
        }
        else
        {
            if(objAlumnoBean.getCategoria().equals("B"))
            {  if(objAlumnoBean.getTipo().equals("INTERNO"))
            {
                pension=550;

            }
            else
             { if(objAlumnoBean.getTipo().equals("EXTERNO"))
               {
                   pension=500;
               }
             }
         }
            else
            {
                if(objAlumnoBean.getCategoria().equals("C"))
                {
                    if(objAlumnoBean.getTipo().equals("INTERNO"))
                    {
                        pension=500;
                    }
                    else
                    { if(objAlumnoBean.getTipo().equals("EXTERNO"))
                      {
                          pension=460;
                      }
                    }
                }
                else
                {  if(objAlumnoBean.getCategoria().equals("D"))
                    {
                        if(objAlumnoBean.getTipo().equals("INTERNO"))
                        {
                            pension=450;
                        }
                        else
                        { if(objAlumnoBean.getTipo().equals("EXTERNO"))
                          {
                              pension=400;
                          }
                        }

                    }
                }

            }

        }
        return  pension;
    }
    public double CalcularDescuento(AlumnoBean objAlumnoBean)
    {
        double descuento=0;
        if(objAlumnoBean.getPromedio()>=0 && objAlumnoBean.getPromedio()<=13.99)
        {
            descuento=0;
        }
        else
        {
            if(objAlumnoBean.getPromedio()>=14.0 && objAlumnoBean.getPromedio()<=15.99)
            {
                descuento=0.10*objAlumnoBean.getPension();
            }
            else
            {
                if(objAlumnoBean.getPromedio()>=16.0 && objAlumnoBean.getPromedio()<=17.99)
                {
                    descuento=0.12*objAlumnoBean.getPension();
                }
                else
                {
                    if(objAlumnoBean.getPromedio()>=18.0 && objAlumnoBean.getPromedio()<=20.00)
                    {
                        descuento=0.15*objAlumnoBean.getPension();
                    }
                }

            }
        }
            return descuento;
    }
    public double CalcularNuevaPension(AlumnoBean objAlumnoBean)
    {
        double nuevapension=0;
        nuevapension=objAlumnoBean.getPension()-objAlumnoBean.getDescuento();
        return nuevapension;
    }
}
