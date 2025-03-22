import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = input.nextInt();

        for (int i=0; i<=3; i++ ){
            if (edad >= 18) {
                System.out.println("Ingrese la contraseña");
                int clave = input.nextInt();
                if (clave == 1234) {
                    System.out.println("Diga la frase correcta");
                    String frase = input.nextLine();
                    if (frase == "La matrix vive") {
                        System.out.println("Acceso Otorgado");
                    }
                }else{
                    System.out.println("Contraseña incorrecta");
                }
            }else {
                System.out.println("No tiene la edad suficiente");
            }
        }
    }
}
