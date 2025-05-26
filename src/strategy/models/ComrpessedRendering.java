package strategy.models;

import strategy.interfaces.RenderingStrategy;

public class ComrpessedRendering implements RenderingStrategy {
    @Override
    public void render(String content) {
        System.out.println("Comrpessed rendering:"+content);
    }
}
