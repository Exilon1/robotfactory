package products.heads;

import products.AbstractDetail;

/**
 * Created by Alexey on 07.11.2016.
 */
public abstract class AbstractHead implements AbstractDetail {

    public void tellSomething(String spell) {
        System.out.println(spell);
    }
}
