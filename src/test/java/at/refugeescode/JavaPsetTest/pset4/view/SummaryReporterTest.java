package at.refugeescode.JavaPsetTest.pset4.view;

import at.refugeescode.JavaPsetTest.pset4.controller.Airport;
import at.refugeescode.JavaPsetTest.pset4.model.Luggage;
import at.refugeescode.JavaPsetTest.pset4.parse.LuggageParser;
import at.refugeescode.JavaPsetTest.pset4.util.TimeUtils;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SummaryReporterTest {

    Airport airport = new Airport();
    LuggageParser luggageParser = new LuggageParser();
    List<Luggage> departureLuggage = luggageParser.asList("src\\main\\java\\at\\refugeescode\\JavaPsetTest\\pset4\\data\\luggage");
    List<Luggage> arrivalLuggage = airport.travel(departureLuggage);
    List<Luggage> notarrivalLuggage = airport.NotTravel(departureLuggage);


    @Test
    void reportRejected() {
        List<Luggage> luggages = airport.NotTravel(notarrivalLuggage);
        StringBuilder builder = new StringBuilder();
        for(Luggage luggage:luggages){
            builder.append(luggage.getType());
            builder.append(" of ");
            builder.append(luggage.getOwner());
            builder.append(" arrived to the drop off ");
            Duration interval = Duration.between(luggage.getDropOffTime(), luggage.getDepartureTime());
            long delay = interval.toMinutes();
            builder.append(delay);
            builder.append(" minutes late.");
        }
        String result = builder.toString();
        assertEquals("Baggage of Mohammad Alsakini arrived to the drop off 14 minutes late." +
                "Baggage of Rami arrived to the drop off 25 minutes late.",result);

    }

    @Test
    void reportAccepted() {
        List<Luggage> arrival = airport.travel(arrivalLuggage);
        StringBuilder builder = new StringBuilder();
        for(Luggage luggage : arrival){
            builder.append(luggage.getType());
            builder.append(" of ");
            builder.append(luggage.getOwner());
            builder.append(" arrived to ");
            builder.append(luggage.getDestination());
            builder.append(" at ");
            builder.append(TimeUtils.formatTime(luggage.getArrivalTime()));
            builder.append(" (local time ");
            builder.append(TimeUtils.formatLocalTime(luggage.getArrivalTime(), luggage.getDestination()));
            builder.append(") and waited a total of ");
            builder.append(TimeUtils.format(luggage.getWaitingDuration()));
        }
        String result = builder.toString();
        assertEquals("Backpack of Hosam arrived to Athens at 23:00 (local time 00:00) and waited a total of 08 hours 20 minutes" +
                "Baggage of Ismael arrived to Paris at 16:45 (local time 16:45) and waited a total of 05 hours 15 minutes" +
                "Baggage of Mohamed Dahman arrived to Ljubljana at 21:15 (local time 21:15) and waited a total of 11 hours 50 minutes" +
                "Backpack of Mohammad Almosleh arrived to London at 02:10 (local time 01:10) and waited a total of 05 hours 25 minutes" +
                "Backpack of Ghiath arrived to Prague at 11:00 (local time 11:00) and waited a total of 04 hours 50 minutes" +
                "Backpack of Mohammad Sawas arrived to Malta at 16:40 (local time 16:40) and waited a total of 08 hours 03 minutes" +
                "Baggage of Nisreen arrived to Amsterdam at 19:15 (local time 19:15) and waited a total of 11 hours 33 minutes" +
                "Backpack of Nourallah arrived to Belfast at 20:10 (local time 19:10) and waited a total of 04 hours 15 minutes" +
                "Baggage of Sarah arrived to Budapest at 17:45 (local time 17:45) and waited a total of 04 hours 10 minutes" +
                "Backpack of Thaer arrived to Lisbon at 21:00 (local time 20:00) and waited a total of 09 hours 45 minutes" +
                "Baggage of Wael arrived to Madrid at 23:15 (local time 23:15) and waited a total of 05 hours 50 minutes" +
                "Baggage of Yazan arrived to Copenhagen at 00:20 (local time 00:20) and waited a total of 07 hours 33 minutes" +
                "Backpack of Diaa arrived to Stockholm at 02:30 (local time 02:30) and waited a total of 07 hours 50 minutes" +
                "Backpack of Ali arrived to Riga at 05:50 (local time 06:50) and waited a total of 07 hours 15 minutes" +
                "Baggage of Hadi arrived to Helsinki at 20:15 (local time 21:15) and waited a total of 09 hours 20 minutes" +
                "Backpack of Farah arrived to Luxembourg at 16:45 (local time 16:45) and waited a total of 07 hours 50 minutes" +
                "Baggage of Fozat arrived to Tallinn at 21:30 (local time 22:30) and waited a total of 13 hours 50 minutes" +
                "Baggage of Sadra arrived to Warsaw at 00:00 (local time 00:00) and waited a total of 10 hours 55 minutes",result);
    }
}