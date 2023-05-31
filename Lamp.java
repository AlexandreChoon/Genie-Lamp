package arabiannights;

public class Lamp {
    //Properties
    private int capacity;
    private int remainingGenies;
    private int recharges = 0;
    //Constructor
    public Lamp(int capacity){
        this.capacity = capacity;
        this.remainingGenies = capacity;
    }
    //Getters

    public int getCapacity() {
        return capacity;
    }

    public int getRecharges(){
        return recharges;
    }

    public int getRemainingGenies() {
        return remainingGenies;
    }

    public void setRemainingGenies(int remainingGenies){
        this.remainingGenies = remainingGenies;
    }

    public void setRecharges(int recharges){
        this.recharges = recharges;
    }

    //Methods
    public Genie rub(){
        if (remainingGenies <= -1){
            System.out.println("You have reached the limit of genies.");
            return null;
        } else if (remainingGenies == 0){
            Genie genie = new Demon();
            remainingGenies--;
            System.out.println("Demon released");
            return genie;
        } else {
            Genie genie = release();
            remainingGenies--;
            return genie;
        }
    }

    public Genie release(){
        int number = (int) (Math.random()*2);
        Genie genie;
        switch (number){
            case 0:
                genie = new FriendlyGenie();
                System.out.println("FriendlyGenie released");
                break;
            case 1:
                genie = new GrumpyGenie();
                System.out.println("GrumpyGenie released");;
                break;
            default:
                return null;
        }
        return genie;
    }

}
