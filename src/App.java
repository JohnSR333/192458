import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String NombreVendedor = input.nextLine();

        System.out.println("Cantidad de productos vendidos:");
        int CantidadVentas = input.nextInt();

        System.out.println("Ingrese valor producto 1:");
        float Producto1 = input.nextFloat();

        System.out.println("Ingrese valor producto 2:");
        float Producto2 = input.nextFloat();

        System.out.println("Ingrese valor producto 3:");
        float Producto3 = input.nextFloat();

        System.out.println("Ingrese valor producto 4:");
        float Producto4 = input.nextFloat();

        System.out.println("Ingrese valor producto 5:");
        double Producto5 = input.nextFloat();

        System.out.println("Ingrese valor producto 6:");
        float Producto6 = input.nextFloat();

        System.out.println("Ingrese valor producto 7:");
        float Producto7 = input.nextFloat();

        double s1 = 0;

        if (Producto1 >= 100000) {
            s1 = s1 + (Producto1 * 0.10);
        } else {
            s1 = s1 + (Producto1 * 0.05);
        }

        if (Producto2 >= 100000) {
            s1 = s1 + (Producto2 * 0.10);
        } else {
            s1 = s1 + (Producto2 * 0.05);
        }

        if (Producto3 >= 100000) {
            s1 = s1 + (Producto3 * 0.10);
        } else {
            s1 = s1 + (Producto3 * 0.05);
        }

        if (Producto4 >= 100000) {
            s1 = s1 + (Producto4 * 0.10);
        } else {
            s1 = s1 + (Producto4 * 0.05);
        }

        if (Producto5 >= 100000) {
            s1 = s1 + (Producto5 * 0.10);
        } else {
            s1 = s1 + (Producto5 * 0.05);
        }

        if (Producto6 >= 100000) {
            s1 = s1 + (Producto6 * 0.10);
        } else {
            s1 = s1 + (Producto6 * 0.05);
        }

        if (Producto7 >= 100000) {
            s1 = s1 + (Producto7 * 0.10);
        } else {
            s1 = s1 + (Producto7 * 0.05);
        }

        double tt = Producto1 + Producto2 + Producto3 + Producto4 + Producto5 + Producto6 + Producto7;
        double ss = (double) (s1 + 1000000);

        System.out.println("Vendedor: " + NombreVendedor);
        System.out.println("Total ventas: " + (float)tt);
        System.out.println("Comisiones: " + (float)s1);
        System.out.println("Salario total: " + (float)ss);
    }
}
