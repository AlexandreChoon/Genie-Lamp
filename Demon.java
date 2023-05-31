package arabiannights;

public class Demon extends Genie{

    public boolean grantWish(){
        System.out.println("Demon: I grant you a bad wish.");
        return true;
    }


    public void recycle(Lamp lamp){
        lamp.setRemainingGenies(lamp.getCapacity());
        lamp.setRecharges(lamp.getRecharges() + 1);
        System.out.println("Demon recycle");
    }


}
