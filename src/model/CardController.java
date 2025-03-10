package src.model;

public class CardController {
    private Card[] cards;

    public CardController(int size){
        this.cards = new Card[size];
    }
    
    public Card[] getCards(){
        return cards;
    }

    public boolean addCard(String name, String id, String type, String gender){
        Card Card = new Card(name, id, type, gender);
        boolean status = false;
        for (int i = 0; i < cards.length;i++){
            if (cards[i] == null){
                cards[i] = Card;
                status = true;
                break;
            }
        }
        return status;
    }

    public String getReportStringCards(){
        String report = "";
        for (int i = 0; i < cards.length; i++){
            if (cards[i] != null){
                report += "Posicion Pokedex: " + (i+1) + "\n";
                report += "Nombre: " + cards[i].getName() + "\n";
                report += "Id: " + cards[i].getId() + "\n";
                report += "Tipo: " + cards[i].getType() + "\n";
                report += "Genero: " + cards[i].getGender() + "\n";
                report += "///////////////////////////// \n";
            }
        }
        return report;
    }

    public boolean checkPosition(int index){
        boolean status = false;
        if(index < cards.length && index >= 1){
            if(cards[index-1] != null){
                status = true;
            }
        }
        return status;
    }

    public void editCard(String name, String id, String type, String gender, int index){
        Card newCard = new Card(name, id, type, gender);
        cards[index-1] = newCard;
    }

    public int deleteCard(int index){
        int status = 0;
        if(index < cards.length && index >= 1){
            if(cards[index-1] != null){
                cards[index-1] = null;
                status = 2;
            } else {
                status = 1;
            }
        }
        return status;
    }

    public void resizeCards(int size){
        Card[] newStudents = new Card[size];
        for (int i = 0; i < Math.min(cards.length, size); i++){
            newStudents[i] = cards[i];
        }
        cards = newStudents;
    }
}
