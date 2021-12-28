package br.com.andretreib.oo.Composition.Example;

class Window {
    private boolean open;

    Window (boolean initialState) {
        this.open = initialState;
    }

    void openWindow() {
        this.open = true;
    }

    void closeWindow() {
        this.open = false;
    }

    boolean getState() {
        return this.open;
    }
}

public class StudioHouse {
    private Window bedroomWindow = null;
    private Window kitchenWindow = null;

    public StudioHouse () {
        this.bedroomWindow = new Window(false);
        this.kitchenWindow = new Window(false);
    }

    public void openBedroomWindow () {
        this.bedroomWindow.openWindow();
    }

    public void openKitchenWindow () {
        this.kitchenWindow.openWindow();
    }

    public void openAllWindows () {
        this.bedroomWindow.openWindow();
        this.kitchenWindow.openWindow();
    }

    public void closeBedroomWindow () {
        this.bedroomWindow.closeWindow();
    }

    public void closeKitchenWindow () {
        this.kitchenWindow.closeWindow();
    }

    public void closeAllWindows () {
        this.bedroomWindow.closeWindow();
        this.kitchenWindow.closeWindow();
    }

    public void checkWindows() {
        System.out.println("The bedroom window is " + this.bedroomWindow.getState());
        System.out.println("The kitchen window is " + this.kitchenWindow.getState());
    }
}