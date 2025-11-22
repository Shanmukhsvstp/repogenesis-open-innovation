package com.parapf.eventsync.models;

public class EventModel {
    private String title;
    private String description;
    private String timeline;
    private String venue;

    public EventModel(String title, String description, String timeline, String venue) {
        this.title = title;
        this.description = description;
        this.timeline = timeline;
        this.venue = venue;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getTimeline() { return timeline; }
    public String getVenue() { return venue; }
}
