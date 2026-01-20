public abstract class GameCharacter {
    // State (instance variable) shared by all subclasses
    protected String name;

    // Constructor (shared logic) to initialize the state
    public GameCharacter(String name) {
        this.name = name;
    }

    // Concrete method (shared behavior)
    public void walk() {
        System.out.println(name + " is walking...");
    }

    // Abstract method (unique behavior) - must be implemented by subclasses
    public abstract void attack();
}
