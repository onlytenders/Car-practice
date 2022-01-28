package Rocket;

import Rocket.Exceptions.RocketIsNotReadyException;

public class Rocket {
    private boolean isReady = false;

    public void prepare () {
        isReady = true;
        System.out.println("Rocket.Rocket has been successfully prepared");
    }

    public void launch() throws RocketIsNotReadyException {
        if (isReady == true) {
            System.out.println("Rocked has been successfully launched");
        } else {
            throw new RocketIsNotReadyException("Error: Rocked is not prepared yet");
        }
    }
}
