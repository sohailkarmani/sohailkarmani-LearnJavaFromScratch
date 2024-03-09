
//package oops;
public class Animal {
    private boolean vegetarian;
    private String eats;
    private int NoOfLegs;
    public Animal(){}
    public Animal(boolean veg,String food,int legs){
        this.vegetarian=veg;
        this.eats=food;
        this.NoOfLegs=legs;
    }
    public boolean isVegetarian(){
        return vegetarian;
    }
    public void setVegetarian(boolean vegetarian){
        this.vegetarian=vegetarian;
    }
    public String getEats(){
        return eats;
    }
    public void setEats(String eats){
        this.eats=eats;
    }
    public int getNoOfLegs(){
        return NoOfLegs;
    }
    public void setNoOfLegs(int NoOfLegs){
        this.NoOfLegs=NoOfLegs;
    }
}

     
    

