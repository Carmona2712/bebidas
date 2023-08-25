
package domain;


public class BebidasAzucaradas extends Productos{
    private double porcentaje_azucar;
    private final double descuento=10;
    private String promocion;
    
   public BebidasAzucaradas(){
       
   }
    
    public BebidasAzucaradas(String nombre,String marca,double contenido,double precio,double porcentaje_azucar,String promocion){
        super(nombre,marca,contenido,precio);
        this.porcentaje_azucar=porcentaje_azucar;
        this.promocion=promocion;
        this.precio=bebidaspromocion();
    }

    public double getPorcentaje_azucar() {
        return porcentaje_azucar;
    }

    public void setPorcentaje_azucar(double porcentaje_azucar) {
        this.porcentaje_azucar = porcentaje_azucar;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

   
    

    public double bebidaspromocion(){
        double precios=0;
        double porcentaje=this.descuento/100;
        if((this.promocion.equals("si"))){
            precios=(this.precio-(this.precio*porcentaje));
        }else if(this.promocion.equals("no")){
            precios=this.precio;
        }
        return precios;
    }

    @Override
    public String toString() {
        return super.toString()+","+ "nombre=" + nombre + ", porcentaje_azucar=" + porcentaje_azucar + ", descuento=" + descuento + ", promocion=" + promocion + '}';
    }
    
    
    
}
