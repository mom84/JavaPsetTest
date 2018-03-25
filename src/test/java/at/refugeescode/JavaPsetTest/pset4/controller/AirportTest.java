package at.refugeescode.JavaPsetTest.pset4.controller;

import at.refugeescode.JavaPsetTest.pset4.model.Luggage;
import at.refugeescode.JavaPsetTest.pset4.util.TimeUtils;
import org.junit.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AirportTest {

    @Test
    public void acceptedLuggage() {
        Luggage luggage = new Luggage();
        luggage.setOwner("Hosam");
        luggage.setDestination("Athens");
        luggage.setType("Backpack");
        luggage.setDropOffTime(TimeUtils.todayAt("15:15"));
        luggage.setDepartureTime(TimeUtils.todayAt("18:00"));
        luggage.setFlightDuration(TimeUtils.durationOfHours("5"));
        luggage.setWaitingDuration(Duration.ofSeconds(0));

        List<Luggage> luggageList = new ArrayList<>();
        luggageList.add(luggage);
        Airport airport = new Airport();
        List<Luggage> travel = airport.travel(luggageList);
        System.out.println(travel.size());
        assertEquals(1,travel.size());
    }

    @Test
    public void rejectedLuggage() {
        Luggage luggage = new Luggage();
        luggage.setOwner("Mohammad Alsakini");
        luggage.setDestination("Berlin");
        luggage.setType("Baggage");
        luggage.setDropOffTime(TimeUtils.todayAt("18:16"));
        luggage.setDepartureTime(TimeUtils.todayAt("18:30"));
        luggage.setFlightDuration(TimeUtils.durationOfHours("2"));
        luggage.setWaitingDuration(Duration.ofSeconds(0));

        List<Luggage> luggageList = new ArrayList<>();
        luggageList.add(luggage) ;



        Airport airport = new Airport();
        List<Luggage> travel = airport.NotTravel(luggageList);
        System.out.println(travel.size());
        assertEquals(1,travel.size());
    }
}