// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Penguin penguin = new Penguin();
        Seal seal = new Seal();
        Crab crab = new Crab();

        penguin.walk();
        penguin.swim();

        seal.swim();
        seal.walk();

        crab.swim();
        crab.walk();

    }
}