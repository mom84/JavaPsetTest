package at.refugeescode.JavaPsetTest.pset4.controller.travelstage;
import at.refugeescode.JavaPsetTest.pset4.model.Luggage;

import java.time.Duration;


public class LuggageClaim implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add 15 minutes to the processing time
        Duration waitingDuration = luggage.getWaitingDuration();
        Duration ProcessTime = waitingDuration.plusMinutes(15);
        luggage.setWaitingDuration(ProcessTime);

        return luggage;
    }
}
