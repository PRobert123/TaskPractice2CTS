package strategy.models;

import strategy.interfaces.RenderingStrategy;

public class BrowserRender {
    private RenderingStrategy startegy;

    public void setStartegy(RenderingStrategy startegy) {
        this.startegy = startegy;
    }
    public void display(String content){
        startegy.render(content);
    }
}
