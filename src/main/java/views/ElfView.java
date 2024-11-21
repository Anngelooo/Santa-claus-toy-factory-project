package views;

public class ElfView extends view {

    public static void index(){
        System.out.println("------------------------------------------");
        System.out.println("Gestor de juguetes (tip de session: Elfo)");
        System.out.println("1. Añadir juguete");
        System.out.println("2. Ver todos los juguetes");
        System.out.println("4. Cerrar sesion");
        System.out.println("Seleccione una opcion");

        int option = scanner.nextInt();
        
        if (option == 4) closeSession();

    }

    public static void closeSession() {
        HomeView.index();
    }
    
}
