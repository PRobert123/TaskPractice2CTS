package decorator;

import decorator.interfaces.iTabable;
import decorator.models.AdBlocktab;
import decorator.models.BasicTab;
import decorator.models.SessionRecoveryTab;

public class Main {
    public static void main(String[] args) {
        iTabable basicTab = new BasicTab();

        iTabable premiumTab = new AdBlocktab(new SessionRecoveryTab(basicTab));
        System.out.println("============= Tab simplu ==============");
        basicTab.open();

        System.out.println("\n============= Tab premium ==============");
        premiumTab.open();
    }
}