public class Penguin implements Swimmer, Walker {


    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Penguin is walking");

    }
}
