public class Main {
    public static void main(String[] args) {
        Shark shark=new Shark();
        Duck duck=new Duck();
        Turtle turtle=new Turtle();
       Swimable[] okeanarium={new Shark(),
      new Shark(),
      new Shark(),
      new Shark(),
      new Shark(),
       new Duck(),
       new Duck(),
       new Duck(),
       new Duck(),
       new Duck(),
       new Turtle(),
       new Turtle(),
       new Turtle(),
       new Turtle(),
       new Turtle()};

        for (Swimable ok:okeanarium) {
            if (ok instanceof Shark){
                shark.swim();
            } else if (ok instanceof Duck) {
                duck.swim();

            } else if (ok instanceof Turtle) {
                turtle.swim();

            }

        }

    }
}