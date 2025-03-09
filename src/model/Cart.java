package src.model;

public class Cart {
    private String name;
    private String id;
    private String type;
    private String gender;
    
    public Cart(String name, String id, String type, String gender){
        this.name = name;
        this.id = id;
        this.type = type;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
}
