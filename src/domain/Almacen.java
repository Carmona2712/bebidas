package domain;

import javax.swing.JOptionPane;

public class Almacen {

    private Productos estanteria[][];
    
    public Almacen() {
        this.estanteria = new Productos[2][2];
    }

    public Almacen(int filas, int columna) {
        this.estanteria = new Productos[filas][columna];
    }

    
    public Productos[][] getEstanteria() {
        return estanteria;
    }

    public double precioTotal() {
        double valor = 0;
        for (int i = 0; i < this.estanteria.length; i++) {
            for (int j = 0; j < this.estanteria[0].length; j++) {
                if (this.estanteria[i][j] != null) {
                    valor += this.estanteria[i][j].getPrecio();
                }
            }
        }
        return valor;
    }

    public double precioMarca(String marca) {
        double precio = 0;
        for (int i = 0; i < this.estanteria.length; i++) {
            for (int j = 0; j < this.estanteria[0].length; j++) {
                if (this.estanteria[i][j] != null) {
                    if (this.estanteria[i][j].getMarca().equalsIgnoreCase(marca)) {
                        precio += this.estanteria[i][j].getPrecio();
                    }
                }
            }
        }
        return precio;
    }

    public double precioPorEstanteria(int columna) {
        double valor = 0;
        for (int i = 0; i < this.estanteria.length; i++) {
            if (this.estanteria[i][columna] != null) {
                valor += this.estanteria[i][columna].getPrecio();
            }
        }
        return valor;
    }

     public void agregarProducto(Productos producto) {
        boolean encontrado = false;
        for ( int i = 0; i < this.estanteria.length && !encontrado; i++) {
            for ( int j = 0; j < this.estanteria[0].length && !encontrado; j++) {
                if(estanteria[i][j]==null){
                this.estanteria[i][j] = producto;
                encontrado = true;
                }else{
                   
                }
                
            }
        }
    }
 
     public void mostrarInformacion() {
        for (int i = 0; i < this.estanteria.length; i++) {
            for (int j = 0; j < this.estanteria.length; j++) {
                if (this.estanteria[i][j] != null) {
                    System.out.println(this.estanteria[i][j]);
                }
            }
        }
    }

    

    public void eliminarProducto(int id) {
        for (int i = 0; i < this.estanteria.length; i++) {
            for (int j = 0; j < this.estanteria.length; j++) {
                if (this.estanteria[i][j].getID() == id) {
                    this.estanteria[i][j] = null;
                }
            }
        }
    }

   
   

}
