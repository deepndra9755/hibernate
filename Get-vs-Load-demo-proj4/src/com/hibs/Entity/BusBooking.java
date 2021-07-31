package com.hibs.Entity;

import java.io.Serializable;

public final class BusBooking implements Serializable {
	
	private Integer id;
	private Integer ticketNumber;
	private String name;
	private String last;
	private String address;
	private String destination;
	private String from;
	
	public  BusBooking() {
		System.out.println("super");
	}
	public final Integer getId() {
		return id;
	}
	public  final void setId(Integer id) {
		this.id = id;
	}
	public final Integer getTicketNumber() {
		return ticketNumber;
	}
	public final void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public final String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public final String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public final String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	@Override
	public String toString() {
		return "BusBooking [id=" + id + ", ticketNumber=" + ticketNumber + ", name=" + name + ", last=" + last
				+ ", address=" + address + ", destination=" + destination + ", from=" + from + "]";
	}
	



}
