public class PlayStationControllerAdapter implements GameController{
    private PlayStationController playStationController;

    public PlayStationControllerAdapter(PlayStationController playStationController) {
        this.playStationController = playStationController;
    }

    @Override
    public Character isButtonPressed(Character button) {
        if (button == playStationController.Button_T_Pressed()) {
            return 'w';
        }
        else if (button ==playStationController.Button_F_Pressed()) {
            return 'a';
        }
        else if (button == playStationController.Button_G_Pressed()) {
            return 's';
        }
        else if (button == playStationController.Button_H_Pressed()) {
            return 'd';
        }


        return null;
    }
}
