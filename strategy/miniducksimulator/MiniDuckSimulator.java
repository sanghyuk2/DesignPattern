import domain.*;
import strategies.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display()
                .performQuack()
                .performFly();

        Duck model = new ModelDuck();
        model.display()
                .performQuack()
                .performFly()
                .setFlyBehavior(new FlyRocketPowered())
                .performFly();

        Duck redhead = new RedheadDuck();
        redhead.display()
                .performQuack()
                .performFly();

        Duck rubber = new RubberDuck();
        rubber.display()
                .performQuack()
                .performFly();
    }
}
