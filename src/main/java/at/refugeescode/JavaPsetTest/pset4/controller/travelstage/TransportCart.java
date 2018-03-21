package at.refugeescode.JavaPsetTest.pset4.controller.travelstage;

import at.refugeescode.JavaPsetTest.pset4.model.Luggage;

import java.time.Duration;

public class TransportCart implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add 25 minutes to the processing time
        Duration waitingDuration = luggage.getWaitingDuration();
        Duration ProcessTime = waitingDuration.plusMinutes(25);
        luggage.setWaitingDuration(ProcessTime);

        return luggage;
    }
}
