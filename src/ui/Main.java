package src.ui;

import src.model.Cart;
import java.util.Scanner;

public class Main {
    private Scanner in;
    private Cart carta;
    public Main(){
        this.in = new Scanner(System.in);
    }
    public static void main(String[] args){
        Main main = new Main();
        main.run();
    }
    
    public void run(){
        boolean menu = true;
        while (menu){
            System.out.println("Bienvenido al PokeCollector");
            boolean flag = true;
            int opt = 0;
            while (flag){
                System.out.println("¿Que deseas hacer hoy?");
                System.out.println("[1]: Crear Carta");
                System.out.println("[2]: Ver Cartas");
                System.out.println("[3]: Editar Carta");
                System.out.println("[4] Salir");
                opt = in.nextInt();
                switch(opt){
                    case 1:
                        a;
                        break;
                    case 2:
                        b;
                        break;
                    case 3:
                        c
                        break;
                    case 4:
                        menu = false;
                        break;
                    default:
                        System.out.println("Ingresa una opcion valida");
                }

            }
        }
    }

    public void createCart(){
        System.out.println("Ingresa el nombre de la carta: ");
        String name = in.nextLine();
        System.out.println("Ingresa el id de la carta: ");
        String id = in.nextLine();
        String type = chooseType();
        String gender = chooseGender();
        
    }

    public String chooseType(){
        boolean flag = true;
        String type = "";
        while (flag){
            System.out.println("Ingresa el tipo del pokemon");
            System.out.println("[1]: Agua");
            System.out.println("[2]: Fuego");
            System.out.println("[3]: Planta");
            System.out.println("[4]: Electrico");
            System.out.println("[5]: Roca");
            System.out.println("[6]: Tierra");
            System.out.println("[7]: Normal");
            System.out.println("[8]: Lucha");
            System.out.println("[9]: Siniestro");
            System.out.println("[10]: Acero");
            System.out.println("[11]: Psiquico");
            System.out.println("[12]: Fantasma");
            System.out.println("[13]: Bicho");
            System.out.println("[14]: Veneno");
            System.out.println("[15]: Volador");
            System.out.println("[16]: Hada");
            System.out.println("[17]: Hielo");
            System.out.println("[18]: Dragon");
            int opt = in.nextInt();
            switch (opt){
                case 1:
                    type = "Agua";
                    flag = false;
                case 2:
                    type = "Fuego";
                    flag = false;
                case 3:
                    type = "Planta";
                    flag = false;
                case 4:
                    type = "Electrico";
                    flag = false;
                case 5:
                    type = "Roca";
                    flag = false;
                case 6:
                    type = "Tierra";
                    flag = false;
                case 7:
                    type = "Normal";
                    flag = false;
                case 8:
                    type = "Lucha";
                    flag = false;
                case 9:
                    type = "Siniestro";
                    flag = false;
                case 10:
                    type = "Acero";
                    flag = false;
                case 11:
                    type = "Psiquico";
                    flag = false;
                case 12:
                    type = "Fantasma";
                    flag = false;
                case 13:
                    type = "Bicho";
                    flag = false;
                case 14:
                    type = "Veneno";
                    flag = false;
                case 15:
                    type = "Volador";
                    flag = false;
                case 16:
                    type = "Hada";
                    flag = false;
                case 17:
                    type = "Hielo";
                    flag = false;
                case 18:
                    type = "Dragon";
                    flag = false;
                default:
                    System.out.println("Ingresa una opcion valida");
            }
        }
        return type;
    }

    public String chooseGender(){
        String gender = "";
        boolean flag = true;
        while (flag){
            System.out.println("Ingresa el genero del pokemon [1] Macho, [2] Hembra");
            int opt = in.nextInt();
            switch (opt) {
                case 1:
                    gender = "Macho";
                    flag = false;
                case 2:
                    gender = "Hembra";
                    flag = false;
                default:
                    System.out.println("Ingresa una opcion valida");
            }
        }
        return gender;
    }
}
