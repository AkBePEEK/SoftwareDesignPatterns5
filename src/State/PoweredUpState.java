package State;

public class PoweredUpState implements State {
    @Override
    public void attack() {
        System.out.println("Powered-up attack strength!");
    }
}
