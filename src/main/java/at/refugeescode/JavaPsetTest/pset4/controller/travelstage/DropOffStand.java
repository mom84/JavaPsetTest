package at.refugeescode.JavaPsetTest.pset4.controller.travelstage;

import at.refugeescode.JavaPsetTest.pset4.model.Luggage;

import java.time.Duration;
import java.time.LocalDateTime;

public class DropOffStand implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        //TODO add 10 minutes to the processing time

        Duration waitingDuration = luggage.getWaitingDuration();
        Duration ProcessTime = waitingDuration.plusMinutes(10);
        luggage.setWaitingDuration(ProcessTime);

        return luggage;
    }
}
