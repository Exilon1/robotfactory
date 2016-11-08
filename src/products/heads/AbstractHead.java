package products.heads;

import products.AbstractDetail;

/**
 * Created by Alexey on 07.11.2016.
 */
public abstract class AbstractHead implements AbstractDetail {

    void tellSomething(String spell) {
        System.out.println(spell);
    }
}
