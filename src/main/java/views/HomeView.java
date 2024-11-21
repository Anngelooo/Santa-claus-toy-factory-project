package views;

import java.util.Scanner;

public class HomeView extends view {

    private static final Scanner Scanner = new Scanner(System.in);

    public static void index(){
        System.out.println("Iniciar sesion de trabajo como:");
        System.out.println("1. Elfo");
        System.out.println("2. Santa Claus");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opcion");

    
        int option = Scanner.nextInt();

        if(option == 1) ElfView.index();

    }

    

    
}
