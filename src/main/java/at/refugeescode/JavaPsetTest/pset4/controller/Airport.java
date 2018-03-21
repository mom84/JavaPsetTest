package at.refugeescode.JavaPsetTest.pset4.controller;


import at.refugeescode.JavaPsetTest.pset4.controller.travelstage.*;
import at.refugeescode.JavaPsetTest.pset4.model.Luggage;
import at.refugeescode.JavaPsetTest.pset4.view.SummaryReporter;

import java.util.List;
import java.util.stream.Collectors;

public class Airport {

    private SecurityControl securityControl = new SecurityControl();

    private TravelStage dropOff = new DropOffStand();
    private TravelStage storageArea = new StorageArea();
    private TravelStage transportCart = new TransportCart();
    private TravelStage flight = new Flight();
    private TravelStage luggageClaim = new LuggageClaim();

    private SummaryReporter summaryReporter = new SummaryReporter();

    public List<Luggage> travel(List<Luggage> departureLuggage) {
        // TODO apply airport travel stages per the following order
        // show a welcome message
        // allow passengers to travel only if they show up at least 30 mins before departure time

        List<Luggage> luggagesThatAccepted = departureLuggage.stream()
                .filter(e -> securityControl.isAllowedToTravel(e) == true)
                .collect(Collectors.toList());
        luggagesThatAccepted.forEach(e -> dropOff.process(e));
        luggagesThatAccepted.forEach(e -> storageArea.process(e));
        luggagesThatAccepted.forEach(e -> transportCart.process(e));
        luggagesThatAccepted.forEach(e -> flight.process(e));
        luggagesThatAccepted.forEach(e -> transportCart.process(e));
        luggagesThatAccepted.forEach(e -> luggageClaim.process(e));
        //summaryReporter.reportAccepted(luggagesThatAccepted);



        //summaryReporter.reportRejected(luggagesNOTAccepted);

        // drop the luggage at the drop off stand
        // bring the luggage to the storage area
        // carry the luggage to the plane with the transport cart
        // flight to the destination
        // carry the luggage to the luggage claim with the transport cart
        // pick up the luggage from the luggage claim
        // display luggage report summary for rejected luggage
        // display luggage report summary for accepted luggage

        return luggagesThatAccepted;
    }

    public List<Luggage> NotTravel(List<Luggage> departureLuggage) {
        List<Luggage> luggagesNOTAccepted = departureLuggage.stream()
                .filter(e -> securityControl.isAllowedToTravel(e) == false)
                .collect(Collectors.toList());
        return luggagesNOTAccepted;
    }


}
