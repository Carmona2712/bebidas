
package domain;

public class AguaMineral extends Productos{
    
    private String origen;
    
    public AguaMineral(){
        super();
    }
    
    public AguaMineral(String nombre,String marca,double litro,double precio,String origen){
        super(nombre,marca,litro,precio);
        this.nombre=nombre;
        this.origen=origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    @Override
    public String toString (){
       return super.toString()+","+"nombre:"+this.nombre+","+"origen:"+this.origen;
    }
    
}
