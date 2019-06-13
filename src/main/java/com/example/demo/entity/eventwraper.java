package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class eventwraper {

	
	
	private List<Event> events =new ArrayList<Event>();
	private String destination;

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
}
