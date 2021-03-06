
public class BookingDay {

  private String bookingDay;
  private Wedding garden;
  private Wedding lake;

  public BookingDay(String bookingDay, Wedding garden, Wedding lake) {
    this.bookingDay = bookingDay;
    this.garden = garden;
    this.lake = lake;
  }

  public String getOverBooked() {
    String overBookedVenues = "";
    int maxGarden = 130;
    int maxLake = 260;
    overBookedVenues += garden.getGuests() > maxGarden ? "Garden is overbooked by " + (garden.getGuests() - maxGarden) + "guests\n" : "";
    overBookedVenues += lake.getGuests() > maxLake ? "Lake is overbooked by " + (lake.getGuests() - maxLake) + "guests\n" : "";
    return overBookedVenues;
  }

  public String toString() {
    String rString = bookingDay;
    if (garden != null) {
      rString = rString + "\nGarden : " + garden.toString();
    }
    if (lake != null) {
      rString = rString + "\nLake : " + lake.toString();
    }
    if (garden == null && lake == null) {
      rString = rString + "\nNo weddings booked";
    }
    return rString + "\n" + getOverBooked();
  }
}

