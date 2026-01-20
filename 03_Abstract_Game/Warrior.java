public class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name); // Call the parent constructor
    }

    @Override
    public void attack() {
        System.out.println(name + " is swinging a sword!");
    }
}
