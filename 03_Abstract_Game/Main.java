public class Main {
    public static void main(String[] args) {
        
        GameCharacter warrior = new Warrior("Aragorn");
        warrior.walk();   
        warrior.attack(); 

        System.out.println(); // for spacing

        
        GameCharacter mage = new Mage("Gandalf");
        mage.walk();   
        mage.attack(); 
    }
}
