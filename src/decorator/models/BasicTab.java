package decorator.models;

import decorator.interfaces.iTabable;

public class BasicTab implements iTabable {
    @Override
    public void open() {
        System.out.println("Tab simplu deschis!");
    }
}
