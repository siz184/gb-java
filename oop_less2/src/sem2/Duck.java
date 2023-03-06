package sem2;

public class Duck extends Herbivores implements Flyable, Runable, Swimable{
    public Duck(String nickname) {
        super(nickname);

    }

    @Override
    public int speedOfFly() {
        return 50;
    }
    public String toString(){
        return "I'm duck. " + super.toString() + ". My speed is " + speedOfRun() + ", speed of fly " + speedOfFly() + ", speed of swim is " + speedOfSwim();
    }
    @Override
    public int speedOfRun() {
        return 10;
    }
    public int speedOfSwim() {
        return 20;
    }

    @Override
    public String say() {
        return "Krya-krya";
    }
}
