package EMPRESA.ANDROID.DAO;

import EMPRES.ANDROID.BEAN.*;
public class ProductoDAO
{
    ProductoBean objProductoBean;
    private int costo;

    public String CalcularOperacion()
    {
        String mensaje="";
        int marca=objProductoBean.getMarca();
        int talla=objProductoBean.getTalla();
        int numpares=objProductoBean.getNumpares();
        this.objProductoBean=new ProductoBean();
        this.objProductoBean.setMarca(marca);
        this.objProductoBean.setTalla(talla);
        this.objProductoBean.setNumpares(numpares);

        CalcularCostoParZapatillas(this.objProductoBean);
        this.objProductoBean.setCosto(costo);
        int venta=CalcularVenta(this.objProductoBean);
        this.objProductoBean.setVenta(venta);
        double descuento=CalcularDescuento(this.objProductoBean);
        this.objProductoBean.setDescuento(descuento);
        double ventanet=CalcularVentaNeta(this.objProductoBean);

        mensaje="el costo del par de zapatillas :"+costo+"\n"+
                "la venta de la zapatillas :"+venta+"\n"+
                "el descuento :"+descuento+"\n"+
                "la venta neta :"+ventanet;







        return mensaje;
    }

    private double CalcularVentaNeta(ProductoBean objProductoBean) {
        return 0;
    }

    public  int CalcularCostoParZapatillas(ProductoBean objProductoBean)
{
    int costo=0;

    switch (objProductoBean.getMarca()){
        case 0:
        { switch (objProductoBean.getTalla())
            { case 0:{ costo=150;break;}
              case 1:{ costo=160;break;}
              case 2:{ costo=160;break;}
            }
            break;
        }
            case 1:
        { switch (objProductoBean.getTalla())
            { case 0:{costo=140;break;}
              case 1:{costo=150;break;}
              case 2:{costo=150;break;}
        }
            break;
        }
            case 2:
        { switch (objProductoBean.getTalla())
            { case 0:{costo=80;break;}
              case 1:{costo=85;break;}
              case 2:{costo=90;break;}
        }
            break;
        }

    }

    return costo;
}
    public int CalcularVenta(ProductoBean objProductoBean)
    {
        int venta=0;
        venta=objProductoBean.getCosto()*objProductoBean.getNumpares();
        return venta;
    }
    public double CalcularDescuento(ProductoBean objProductoBean)
    {
        double descuento=0;
        if(objProductoBean.getNumpares()>=2 && objProductoBean.getNumpares()<=5)
        {
            descuento=0.05*objProductoBean.getVenta();
        }
        else
        {
            if(objProductoBean.getNumpares()>=6 && objProductoBean.getNumpares()<=10)
            {
                descuento=0.08*objProductoBean.getVenta();
            }
            else
            {
                if(objProductoBean.getNumpares()>=11 && objProductoBean.getNumpares()<=20)
                {
                    descuento=0.10*objProductoBean.getVenta();
                }
                else
                {
                    if(objProductoBean.getNumpares()>=20)
                    {
                        descuento=0.05*objProductoBean.getVenta();
                    }
                }
            }
        }
        return descuento;
    }
    public double CaluclarVentaNeta(ProductoBean objProductoBean)
    {
       double ventaneta=0;
       ventaneta=objProductoBean.getVenta()-objProductoBean.getDescuento();
       return ventaneta;
    }

}
