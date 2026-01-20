public class Main {
    public static void main(String[] args) {
        // Create a Warrior object
        GameCharacter warrior = new Warrior("Aragorn");
        warrior.walk();   // Calls concrete method from GameCharacter
        warrior.attack(); // Calls implemented method from Warrior

        System.out.println(); // for spacing

        // Create a Mage object
        GameCharacter mage = new Mage("Gandalf");
        mage.walk();   // Calls concrete method from GameCharacter
        mage.attack(); // Calls implemented method from Mage
    }
}
