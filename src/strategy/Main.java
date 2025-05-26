package strategy;

import strategy.models.BrowserRender;
import strategy.models.ComrpessedRendering;
import strategy.models.HighFidelityRendering;
import strategy.models.MinimalistRendering;

public class Main {
    public static void main(String[] args) {
        BrowserRender browser = new BrowserRender();

        browser.setStartegy(new MinimalistRendering());
        browser.display("Exemplu articol!");

        browser.setStartegy(new HighFidelityRendering());
        browser.display("Pagina principala!");

        browser.setStartegy(new ComrpessedRendering());
        browser.display("Galerie foto!");
    }
}
