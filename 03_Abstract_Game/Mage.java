public class Mage extends GameCharacter {
    public Mage(String name) {
        super(name); // Call the parent constructor
    }

    @Override
    public void attack() {
        System.out.println(name + " is casting a spell!");
    }
}
