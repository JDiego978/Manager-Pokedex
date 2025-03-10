package src.ui;

import src.model.CardController;
import java.util.Scanner;

public class Main {
    private CardController CardController;
    private Scanner in;
    public Main(){
        this.CardController = new CardController(0);
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
            resizeCards();
            int opt = 0;
            System.out.println("¿Que deseas hacer hoy?");
            System.out.println("[1]: Crear Cartas");
            System.out.println("[2]: Ver Cartas");
            System.out.println("[3]: Editar Carta");
            System.out.println("[4]: Eliminar Carta");
            System.out.println("[5]: Cambiar tamaño de la Pokedex");
            System.out.println("[6]: Salir");
            opt = in.nextInt();
            in.nextLine();
            switch(opt){
                case 1:
                    createCard();
                    break;
                case 2:
                    showCards();
                    break;
                case 3:
                    editCard();
                    break;
                case 4:
                    deleteCard();
                    break;
                case 5:
                    resizeCards();
                    break;
                case 6:
                    System.out.println("Saliendo del menu...");
                    menu = false;
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
            }
        }
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
            in.nextLine();
            switch (opt){
                case 1:
                    type = "Agua";
                    flag = false;
                    break;
                case 2:
                    type = "Fuego";
                    flag = false;
                    break;
                case 3:
                    type = "Planta";
                    flag = false;
                    break;
                case 4:
                    type = "Electrico";
                    flag = false;
                    break;
                case 5:
                    type = "Roca";
                    flag = false;
                    break;
                case 6:
                    type = "Tierra";
                    flag = false;
                    break;
                case 7:
                    type = "Normal";
                    flag = false;
                    break;
                case 8:
                    type = "Lucha";
                    flag = false;
                    break;
                case 9:
                    type = "Siniestro";
                    flag = false;
                    break;
                case 10:
                    type = "Acero";
                    flag = false;
                    break;
                case 11:
                    type = "Psiquico";
                    flag = false;
                    break;
                case 12:
                    type = "Fantasma";
                    flag = false;
                    break;
                case 13:
                    type = "Bicho";
                    flag = false;
                    break;
                case 14:
                    type = "Veneno";
                    flag = false;
                    break;
                case 15:
                    type = "Volador";
                    flag = false;
                    break;
                case 16:
                    type = "Hada";
                    flag = false;
                    break;
                case 17:
                    type = "Hielo";
                    flag = false;
                    break;
                case 18:
                    type = "Dragon";
                    flag = false;
                    break;
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
                in.nextLine();
                switch (opt) {
                    case 1:
                    gender = "Macho";
                    flag = false;
                    break;
                    case 2:
                    gender = "Hembra";
                    flag = false;
                    break;
                    default:
                    System.out.println("Ingresa una opcion valida");
                }
            }
            return gender;
        }
        
        public void createCard(){
            System.out.println("Ingresa el nombre de la Carta: ");
            String name = in.nextLine();
            System.out.println("Ingresa el id de la Carta: ");
            String id = in.nextLine();
            String type = chooseType();
            String gender = chooseGender();
            boolean status = CardController.addCard(name, id, type, gender);
            if (status){
                System.out.println("Carta agregada");
            } else {
                System.out.println("No hay espacio para agregar esta Carta");
            }
        }
        
        public void showCards(){
            String report = CardController.getReportStringCards();
            if (report.length() != 0){
                System.out.println(report);
            } else {
                System.out.println("No hay Cartas en la Pokedex");
            }
        }

        public void editCard(){
            System.out.println("Elige la posicion de la carta que deseas cambiar");
            int index = in.nextInt();
            in.nextLine();
            boolean status = CardController.checkPosition(index);
            if (status){
                System.out.println("Ingresa el nombre de la Carta: ");
                String name = in.nextLine();
                System.out.println("Ingresa el id de la Carta: ");
                String id = in.nextLine();
                String type = chooseType();
                String gender = chooseGender();
                CardController.editCard(name, id, type, gender, index);
            } else {
                System.out.println("Posicion Ingresada invalida");
            }
        }

        public void deleteCard(){
            System.out.println("Elige la posicion de la carta que deseas eliminar");
            int index = in.nextInt();
            in.nextLine();
            int status = CardController.deleteCard(index);
            if(status == 0){
                System.out.println("No se pudo eliminar la carda");
                System.out.println("Elige una posicion valida");
            } else if(status == 1) {
                System.out.println("No se pudo eliminar la carda");
                System.out.println("No existe una carta en esa posicion");
            } else {
                System.out.println("Carta Eliminada");
            }
        }

        public void resizeCards(){
            if(CardController.getCards().length != 0){
                System.out.println("Cuidado se pueden borrar cartas");
            }
            boolean flag = true;
            while (flag) {
                System.out.println("De que tamaño deseas que sea la pokedex: ");
                int size = in.nextInt();
                in.nextLine();
                if(size > 0){
                    CardController.resizeCards(size);
                    flag = false;
                } else {
                    System.out.println("Elige un tamaño valido");
                }
            }
        }

}
