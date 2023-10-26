public class Crab implements Swimmer, Walker{

    @Override
    public void swim() {
        System.out.println("Crab is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Crab is walking");
    }
}
