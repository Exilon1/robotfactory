package products.hands;

/**
 * Created by Alexey on 07.11.2016.
 */
public class AppleHend extends AbstractHand {

    private final String MARK = "Apple";

    public AppleHend(String type) {
        super(type);
    }

    @Override
    public void test() {
        System.out.println("I'm an Apple " + type + " hand and I can act.");
    }

    @Override
    public String getMark() {
        return MARK;
    }
}
