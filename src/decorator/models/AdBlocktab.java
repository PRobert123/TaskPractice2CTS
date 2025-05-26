package decorator.models;

import decorator.abstracts.ATabDecorator;
import decorator.interfaces.iTabable;

public class AdBlocktab extends ATabDecorator {
    public AdBlocktab(iTabable tabDecorat) {
        super(tabDecorat);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Blocare reclama activata.");
    }

    public void block(){
        System.out.println("Reclamele au fost blocate.");
    }
}
