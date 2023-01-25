import java.util.Arrays;

public class Okeanarium {
    private Shark[] shark;
    private Duck[] duck;
    private Turtle[] turtle;

    public Okeanarium(Shark[] shark, Duck[] duck, Turtle[] turtle) {
        this.shark = shark;
        this.duck = duck;
        this.turtle = turtle;
    }

    public Okeanarium() {

    }

    public Shark[] getShark() {
        return shark;
    }

    public void setShark(Shark[] shark) {
        this.shark = shark;
    }

    public Duck[] getDuck() {
        return duck;
    }

    public void setDuck(Duck[] duck) {
        this.duck = duck;
    }

    public Turtle[] getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle[] turtle) {
        this.turtle = turtle;

    }

    @Override
    public String toString() {
        return "Okeanarium{" +
                "shark=" + Arrays.toString(shark) +
                ", duck=" + Arrays.toString(duck) +
                ", turtle=" + Arrays.toString(turtle) +
                '}';
    }}