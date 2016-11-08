package products.legs;

/**
 * Created by Alexey on 07.11.2016.
 */
public class AppleLeg extends AbstractLeg {

    private final String MARK = "Apple";

    public AppleLeg(String type) {
        super(type);
    }

    @Override
    public void test() {
        System.out.println("I'm an Apple " + type + " leg and I can act.");
    }

    @Override
    public String getMark() {
        return MARK;
    }
}
