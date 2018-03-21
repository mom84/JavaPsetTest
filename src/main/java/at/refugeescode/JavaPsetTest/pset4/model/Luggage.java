package at.refugeescode.JavaPsetTest.pset4.model;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Luggage {

    private String owner;

    private String destination;

    private String type;

    private LocalDateTime dropOffTime;

    private LocalDateTime departureTime;

    private Duration flightDuration;

    private Duration waitingDuration;

    private LocalDateTime arrivalTime;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getDropOffTime() {
        return dropOffTime;
    }

    public void setDropOffTime(LocalDateTime dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Duration getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(Duration flightDuration) {
        this.flightDuration = flightDuration;
    }

    public Duration getWaitingDuration() {
        return waitingDuration;
    }

    public void setWaitingDuration(Duration waitingDuration) {
        this.waitingDuration = waitingDuration;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

//    public String formatTime(){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
//        String text = formatter.format(LocalTime.of(getArrivalTime().getHour(),getArrivalTime().getMinute(),getArrivalTime().getSecond()));
//        return text;
//    }
//
//    public long LateArriveTime(){
//        Duration processTime = Duration.between(departureTime, dropOffTime).abs();
//       return processTime.toMinutes();
//    }
//
//
//    public String destinationLocalTime(){
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
//        LocalDateTime of = getArrivalTime();
//        String destination = getDestination();
//        ZoneId vienna = ZoneId.of("Europe/Vienna");
//        ZoneId destinationId = ZoneId.of("Europe/"+destination);
//
//        ZonedDateTime viennaTime = of.atZone(vienna);
//        ZonedDateTime destinationLocalTime = viennaTime.withZoneSameInstant(destinationId);
//
//        return String.valueOf(timeFormatter.format(destinationLocalTime));
//
//    }
//
//    public String formatWaitingTime(){
//        Duration waitingDuration = getWaitingDuration();
//        long hours = waitingDuration.toHours();
//
//        long minutes = waitingDuration.minusHours(hours).toMinutes();
//
//        return hours + " hours " + minutes + " minutes";
//    }

    //luggagesThatAccepted.forEach(e -> System.out.println(e.getType() + " of " + e.getOwner() + " arrived to " + e.getDestination() + " at " + e.formatTime() +" ( localtime "+ e.destinationLocalTime()+" ) " + " and waited a total of " + e.formatWaitingTime()));
    //luggagesNOTAccepted.forEach(e -> System.out.println(e.getType() + " of " + e.getOwner() + " arrived to the drop off " + e.LateArriveTime() + "  minutes  late." ));


}
