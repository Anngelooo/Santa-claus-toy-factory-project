package dev.exercise.views;

import java.util.Scanner;

import dev.exercise.controller.ToyController;
import dev.exercise.models.BadToy;
import dev.exercise.models.GoodToy;

public class ElfView extends view {

    private static final ToyController controller = new ToyController();

    public static void index(){
        System.out.println("------------------------------------------");
        System.out.println("Gestor de juguetes (tip de session: Elfo)");
        System.out.println("1. Añadir juguete");
        System.out.println("2. Ver todos los juguetes");
        System.out.println("4. Cerrar sesion");
        System.out.println("Seleccione una opcion");

        int option = scanner.nextInt();

        if (option == 1) selectChild();
        
        if (option == 4) closeSession();

    }

    public static void selectChild(){
        System.out.println("------------------------------------------");
        System.out.println("Para niño ...:");
        System.out.println("1. Bueno");
        System.out.println("2. Malo");
        int option = scanner.nextInt();

        if(option == 1) postGoodToy();

        if (option == 2) postbadToy();
    }

    public static void postGoodToy(){
        System.out.println("------------------------------------------");
        System.out.println("Ingrese el titulo:");
        String tittle = scanner.next();
        System.out.println("Ingrese la marca");
        String brand = scanner.next();
        System.out.println("Ingrese la edad recomendada");
        int age = scanner.nextInt();
        System.out.println("Ingrese la categoria");
        String category = scanner.next();

        controller.postGoodToy(new GoodToy(tittle, brand, age, category, false));
    }

    public static void postbadToy(){
        System.out.println("------------------------------------------");
        System.out.println("Ingrese el titulo:");
        String tittle = scanner.next();
        System.out.println("Ingrese la marca");
        String brand = scanner.next();
        System.out.println("Ingrese la edad recomendada");
        int age = scanner.nextInt();
        System.out.println("Ingrese la categoria");
        String category = scanner.next();

        controller.postGoodToy(new BadToy(tittle, false, category));
    }


    public static void closeSession() {
        HomeView.index();
    }
    
}
