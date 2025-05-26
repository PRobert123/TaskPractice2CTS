package decorator;

import decorator.interfaces.iTabable;
import decorator.models.AdBlockTab;
import decorator.models.BasicTab;
import decorator.models.SessionRecoveryTab;

public class Main {
    public static void main(String[] args) {
        iTabable tabBasic = new BasicTab();
        iTabable tabPremium = new AdBlockTab(new SessionRecoveryTab(tabBasic));
        System.out.println("========== Tab simplu ==========");
        tabBasic.open();
        System.out.println("========== Tab premium ==========");
        tabPremium.open();
    }
}
