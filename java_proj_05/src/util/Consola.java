package util;

import java.util.Scanner;

public class Consola {
    private static final Scanner teclado = new Scanner(System.in);

    public static String leerTexto(String mensaje) {

        System.out.print(mensaje);

        return teclado.nextLine();
    }

    public static int leerEntero(String mensaje) {

        System.out.print(mensaje);

        return Integer.parseInt(teclado.nextLine());
    }

}
