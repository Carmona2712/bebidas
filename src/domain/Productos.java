
package domain;


public class Productos {
   protected int ID;
   protected String nombre;
   protected String marca;
   protected double contenido;
   protected double precio;
   private static int contador;
   private BebidasAzucaradas bebidas;
   private AguaMineral agua;
   
   public Productos(){
       
   }
   
   public Productos(String nombre,String marca,double contenido,double precio){
       this.nombre=nombre;
       this.marca=marca;
       this.contenido=contenido;
       this.precio=precio;
       Productos.contador++;
       this.ID=Productos.contador;
   }
     
    public String getNombre() {
        return nombre;
    }

    public BebidasAzucaradas getBebidas() {
        return bebidas;
    }

    public void setBebidas(BebidasAzucaradas bebidas) {
        this.bebidas = bebidas;
    }

    public AguaMineral getAgua() {
        return agua;
    }

    public void setAgua(AguaMineral agua) {
        this.agua = agua;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }
   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getContenido() {
        return contenido;
    }

    public void setContenido(double litros) {
        this.contenido = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   

    @Override
    public String toString() {
        return "ID:"+ID+","+ "marca:" + marca + ", litros:" + contenido + ", precio:" + precio;
    }
   
   
   
}
