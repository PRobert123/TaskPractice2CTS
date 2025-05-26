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
        System.out.println("Recuperare sesiune acitvata!");
    }

    public void recovery(){
        System.out.println("Recuperez sesiuni anterioare...");
    }
}
