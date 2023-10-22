class GamingConsole {
    private GameController controller;

    public void connectController(GameController controller) {
        this.controller = controller;
    }

    public Character isButtonPressed(Character button) {
        if (controller != null) {
            return controller.isButtonPressed(button);
        }
        return null;
    }


}