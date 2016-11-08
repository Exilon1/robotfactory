package products.legs;

/**
 * Created by Alexey on 07.11.2016.
 */
public class SonyLeg extends AbstractLeg {

    private final String MARK = "Sony";

    public SonyLeg(String type) {
        super(type);
    }

    @Override
    public void test() {
        System.out.println("I'm a Sony " + type + " leg and I can act.");
    }

    @Override
    public String getMark() {
        return MARK;
    }
}
