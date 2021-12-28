package br.com.andretreib.oo.Composition;

/*
    We can't access the Window class because it isn't public
    But we're using its methods through the StudioHouse class
      which we can access 'cause it's public
*/
import br.com.andretreib.oo.Composition.Example.StudioHouse;

public class Composition {
    public static void main(String[] args) {
        StudioHouse home = new StudioHouse();
        home.openBedroomWindow();
        home.checkWindows();
        home.closeAllWindows();
        home.checkWindows();
    }
}
