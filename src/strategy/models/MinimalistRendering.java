package strategy.models;

import strategy.interfaces.RenderingStrategy;

public class MinimalistRendering implements RenderingStrategy {
    @Override
    public void render(String content) {
        System.out.println("Minimalist(Text-only) rendering:"+content);
    }
}
