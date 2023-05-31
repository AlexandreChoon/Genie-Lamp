package arabiannights;

public class FriendlyGenie extends Genie {

    @Override
    public boolean grantWish() {
        if (super.grantWish()) {
            setNumWishes(getNumWishes() - 1);
            System.out.println(getNumWishes());
            System.out.println("I grant you a good wish." + "\n" + "You have " + getNumWishes() + " wishes left.");
            return true;
        }
        return false;
    }
}