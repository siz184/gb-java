package sem2;

public class Dog extends Predator implements Runable, Swimable{
    public Dog(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm dog. " + super.toString() + ". My speed is " + speedOfRun() + ", speed of swim is " + speedOfSwim();
    }
    public String say(){
        return "gav-gav";
    }

    @Override
    public int speedOfRun() {
        return 20;
    }
    public int speedOfSwim() {
        return 10;
    }
}
