package products.heads;

/**
 * Created by Alexey on 07.11.2016.
 */
public class SonyHead extends AbstractHead {

    private final String MARK = "Sony";

    @Override
    public void test() {
        System.out.println("I'm a Sony head and I can talk.");
    }

    @Override
    public String getMark() {
        return MARK;
    }
}
