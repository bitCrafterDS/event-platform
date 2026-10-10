public class Event {

    private int id;
    private String title;
    private String description;
    private String eventDate;
    private String eventTime;
    private String venue;
    private int seatLimit;

    public Event(int id, String title, String description, String eventDate,
                 String eventTime, String venue, int seatLimit) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.venue = venue;
        this.seatLimit = seatLimit;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getEventDate() { return eventDate; }
    public String getEventTime() { return eventTime; }
    public String getVenue() { return venue; }
    public int getSeatLimit() { return seatLimit; }
}

