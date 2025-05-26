package decorator.models;

import decorator.abstracts.ATabDecorator;
import decorator.interfaces.iTabable;

public class AdBlockTab extends ATabDecorator {
    public AdBlockTab(iTabable tabDecorat) {
        super(tabDecorat);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Blocare reclame activata!");
    }

    public void block(){
        System.out.println("Reclamele au fost blocate!");
    }
}
