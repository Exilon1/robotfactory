package products.legs;

/**
 * Created by Alexey on 07.11.2016.
 */
public class SamsungLeg extends AbstractLeg {

    private final String MARK = "Samsung";

    public SamsungLeg(String type) {
        super(type);
    }

    @Override
    public void test() {
        System.out.println("I'm a Samsung " + type + " leg and I can act.");
    }

    @Override
    public String getMark() {
        return MARK;
    }
}
