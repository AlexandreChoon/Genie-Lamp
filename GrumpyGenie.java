package arabiannights;

public class GrumpyGenie extends Genie {

    public boolean grantWish() {
        if (super.grantWish()) {
            setNumWishes(0);
            System.out.println(getNumWishes());
            System.out.println("I grant you a grumpy wish." + "\n" + "You have " + getNumWishes() + " wishes left.");
            return true;
        }
        return false;
    }
}
