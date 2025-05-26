package decorator.models;

import decorator.abstracts.ATabDecorator;
import decorator.interfaces.iTabable;

public class SessionRecoveryTab extends ATabDecorator {

    public SessionRecoveryTab(iTabable tabDecorat) {
        super(tabDecorat);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Recuperare sesiuni anterioare...");
    }

    public void recovery(){
        System.out.println("Recuperezn sesiuni anterioare...");
    }
}
