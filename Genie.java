package arabiannights;

public class Genie {
    //properties
    private int numWishes = 3;


    //Constructor
    public Genie(){
    }

    public int getNumWishes() {
        return numWishes;
    }

    public void setNumWishes(int numWishes) {
        this.numWishes = numWishes;
    }

    public boolean grantWish(){
        if(getNumWishes() <= 0){
            System.out.println("You have no wishes left.");
            return false;
        }
        return true;
    }



}
