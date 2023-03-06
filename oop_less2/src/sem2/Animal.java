package sem2;

public abstract class Animal implements Sayable {
    public String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname(){
        return nickname;
    }

    public abstract String feed();
    public String toString(){
        return "My nickname is " + nickname;
    }
}
