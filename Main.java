package arabiannights;

public class Main {
    public static void main(String[] args) {
        Lamp magicLamp = new Lamp(3);

        Genie genie = magicLamp.rub();

        magicLamp.rub();
        magicLamp.rub();
        Demon demon =  (Demon) magicLamp.rub();
        demon.recycle(magicLamp);









    }
}

