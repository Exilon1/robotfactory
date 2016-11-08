package products.heads;

/**
 * Created by Alexey on 07.11.2016.
 */
public class SamsungHead extends AbstractHead {

    private final String MARK = "Samsung";


    @Override
    public void test() {
        System.out.println("I'm a Samsung head and I can talk.");
    }

    @Override
    public String getMark() {
        return MARK;
    }
}
