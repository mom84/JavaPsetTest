package at.refugeescode.JavaPsetTest.pset4;


import at.refugeescode.JavaPsetTest.pset4.controller.Airport;
import at.refugeescode.JavaPsetTest.pset4.model.Luggage;
import at.refugeescode.JavaPsetTest.pset4.parse.LuggageParser;
import at.refugeescode.JavaPsetTest.pset4.view.SummaryReporter;

import java.util.List;

public class Pset4Main {

    public static void main(String[] args) {

        LuggageParser luggageParser = new LuggageParser();

        List<Luggage> departureLuggage = luggageParser.asList("src\\main\\java\\at\\refugeescode\\JavaPsetTest\\pset4\\data\\luggage");

        Airport airport = new Airport();
        List<Luggage> arrivalLuggage = airport.travel(departureLuggage);
        List<Luggage> notarrivalLuggage = airport.NotTravel(departureLuggage);
        SummaryReporter summaryReporter = new SummaryReporter();
        summaryReporter.reportAccepted(arrivalLuggage);
        summaryReporter.reportRejected(notarrivalLuggage);

        // Returning the list of arrival luggage will be very useful
        // when we learn about unit testing to be able to test the behaviour
        // of the Airport class automatically
    }
}
