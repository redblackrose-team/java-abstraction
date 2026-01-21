public class Main {
    public static void main(String[] args) {
        
        GameCharacter warrior = new Warrior("Warrior");
        warrior.walk();   
        warrior.attack(); 

        System.out.println(); // for spacing

        
        GameCharacter mage = new Mage("Mage");
        mage.walk();   
        mage.attack(); 
    }
}
