public abstract class GameCharacter {
    protected String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    // Concrete method (shared behavior)
    public void walk() {
        System.out.println(name + " is walking...");
    }

    // Abstract method (unique behavior)
    public abstract void attack();
}
