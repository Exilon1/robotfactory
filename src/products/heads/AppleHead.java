package products.heads;

/**
 * Created by Alexey on 07.11.2016.
 */
public class AppleHead extends AbstractHead {

    private final String MARK = "Apple";

    @Override
    public void test() {
        System.out.println("I'm an Apple head and I can talk.");
    }

    @Override
    public String getMark() {
        return MARK;
    }
}
