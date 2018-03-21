package at.refugeescode.JavaPsetTest.pset4.controller.travelstage;

import at.refugeescode.JavaPsetTest.pset4.model.Luggage;

import java.time.Duration;
import java.time.LocalDateTime;

public class Flight implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add travel duration to the processing time
        Duration flightDuration = luggage.getFlightDuration();

        Duration ProcessTime = luggage.getWaitingDuration();

        Duration ProcessTime2 = ProcessTime.plus(flightDuration);
        luggage.setWaitingDuration(ProcessTime2);

        // Update arrival time
        LocalDateTime departureTime = luggage.getDepartureTime();
        LocalDateTime plus = departureTime.plus(flightDuration);
        luggage.setArrivalTime(plus);



        return luggage;
    }
}
