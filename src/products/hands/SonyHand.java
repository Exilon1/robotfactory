package products.hands;

/**
 * Created by Alexey on 07.11.2016.
 */
public class SonyHand extends AbstractHand {

    private final String MARK = "Sony";

    public SonyHand(String type) {
        super(type);
    }

    @Override
    public void test() {
        System.out.println("I'm a Sony " + type + " hand and I can act.");
    }

    @Override
    public String getMark() {
        return MARK;
    }
}
