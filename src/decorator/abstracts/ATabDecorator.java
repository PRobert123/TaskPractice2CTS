package decorator.abstracts;

import decorator.interfaces.iTabable;

public abstract class ATabDecorator implements iTabable {
    protected iTabable tabDecorat;

    public ATabDecorator(iTabable tabDecorat) {
        this.tabDecorat = tabDecorat;
    }

    @Override
    public void open() {
        tabDecorat.open();
    }
}
