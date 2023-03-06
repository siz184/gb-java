package sem2;

public class Crocodile extends Predator implements Runable, Swimable{
    public Crocodile(String nickname) {
        super(nickname);
    }
    public String toString(){
        return "I'm crocodile. " + super.toString() + ". My speed is " + speedOfRun() + ", speed of swim is " + speedOfSwim();
    }
    public String say(){
        return "nyam-nyam";
    }

    @Override
    public int speedOfRun() {
        return 5;
    }
    public int speedOfSwim() {
        return 30;
    }
}
