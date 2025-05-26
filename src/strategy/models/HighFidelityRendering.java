package strategy.models;

import strategy.interfaces.RenderingStrategy;

public class HighFidelityRendering implements RenderingStrategy {
    @Override
    public void render(String content) {
        System.out.println("High-fidelity rendering:"+content);
    }
}
