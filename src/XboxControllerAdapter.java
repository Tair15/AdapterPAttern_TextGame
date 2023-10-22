public class XboxControllerAdapter implements GameController{
    private XboxController xboxController;

    public XboxControllerAdapter(XboxController xboxController) {
        this.xboxController = xboxController;
    }


    @Override
    public Character isButtonPressed(Character button) {
        if (button == xboxController.Button_I_Pressed()) {
            return 'w';
        }
        else if (button ==xboxController.Button_J_Pressed()) {
            return 'a';
        }
        else if (button == xboxController.Button_K_Pressed()) {
            return 's';
        }
        else if (button == xboxController.Button_L_Pressed()) {
            return 'd';
        }


        return null;
    }
}
