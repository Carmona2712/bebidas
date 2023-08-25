package test;

import domain.AguaMineral;
import domain.Almacen;
import domain.BebidasAzucaradas;
import domain.Productos;
import java.util.Scanner;
import vista.VentanaPrincipal;

public class TestAlmacen {

    public static void main(String[] args) {

//        Productos a2=new AguaMineral("hsbhs", 1.4, 1000,"agua", "puerca");
//        //Productos a1=new AguaMineral("mineral", 1.3, 12300,"manantial", "desconocido");
//        BebidasAzucaradas b3=new BebidasAzucaradas("bavaria", 1.5, 200, "cocacola", 0.45, 1);
//        BebidasAzucaradas b4=new BebidasAzucaradas("bavaria", 1.5, 200, "cocacola", 0.45, 1);
//        BebidasAzucaradas b5=new BebidasAzucaradas("bavaria", 1.5, 200, "cocacola", 0.45, 1);
//        System.out.println(b2.toString());
//        
//        System.out.println(a1.toString());
        Almacen A = new Almacen(2, 2);
        Scanner sn = new Scanner(System.in);

//        A.agregarProducto(a2,0,0);
//        A.agregarProducto(b3,0,1);
//        A.agregarProducto(b4,1,0);
//        A.agregarProducto(b5,1,1);
//        A.mostrarInformacion();
//        System.out.println("precio total:"+A.precioTotal());
//        System.out.println("precio por marca:"+A.precioMarca("bavaria"));
//        System.out.println("precio por estantes:"+A.precioPorEstanteria(1));
//        A.eliminarProducto(3);
//        A.mostrarInformacion();
        /*Productos b;
        int opc = 0;
        do {
            System.out.println("1).ingresar bebida azucarada");
            System.out.println("2).ingresar agua mineral");
            System.out.println("3). mostrar bebidas");
            System.out.println("4).salir");

            System.out.print("digite opcion:");
            opc = Integer.parseInt(sn.nextLine());

            switch (opc) {
                case 1:
                    System.out.println("bebidas azucaradas");
                    System.out.print("");
                    System.out.print("marca:");
                    String marca = sn.nextLine();

                    System.out.print("contenido:");
                    double contenido = Double.parseDouble(sn.nextLine());

                    System.out.print("precio:");
                    double precio = Double.parseDouble(sn.nextLine());

                    System.out.print("nombre:");
                    String nombre = sn.nextLine();

                    System.out.print("porcentaje de azucar:");
                    double porcentaje = Double.parseDouble(sn.nextLine());

                    System.out.print("promocion:");
                    String promocion = sn.nextLine();

                    b = new BebidasAzucaradas(nombre, marca, contenido, precio, porcentaje, promocion);
                    A.agregarProducto(b);

                    break;

                case 2:
                    
                    System.out.println("agua mineral");
                    System.out.print("");
                    System.out.print("marca:");
                    marca = sn.nextLine();

                    System.out.print("contenido:");
                    contenido = Double.parseDouble(sn.nextLine());

                    System.out.print("precio:");
                    precio = Double.parseDouble(sn.nextLine());

                    System.out.print("nombre:");
                    nombre = sn.nextLine();

                    System.out.print("origen:");
                    String origen = sn.nextLine();

                    b = new AguaMineral(nombre, marca, contenido, precio, origen);
                    A.agregarProducto(b);
                    break;

                case 3:
                    A.mostrarInformacion();
                    break;
                case 4:
                    if (opc != 3) {
                        System.out.println("terminada ejecucion");
                    }
                    break;
                default:
                    if (opc <= 0 || opc > 4) {
                        System.out.println("introduzca opcion valida");
                    }
            }
        } while (opc != 4);

        A.mostrarInformacion();
        System.out.println("precio total:" + A.precioTotal());

    }*/
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
    }

}
