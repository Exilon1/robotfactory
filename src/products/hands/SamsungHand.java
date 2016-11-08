package products.hands;

/**
 * Created by Alexey on 07.11.2016.
 */
public class SamsungHand extends AbstractHand {

    private final String MARK = "Samsung";

    public SamsungHand(String type) {
        super(type);
    }

    @Override
    public void test() {
        System.out.println("I'm a Samsung " + type + " hand and I can act.");
    }

    @Override
    public String getMark() {
        return MARK;
    }
}
