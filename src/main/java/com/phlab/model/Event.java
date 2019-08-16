package com.phlab.model;

import java.math.BigDecimal;

/**
 * @author prashant
 *
 */
public class Event {

	private BigDecimal mta;
	private BigDecimal pme;
	private String eventStatus;

	/**
	 * @return the mta
	 */
	public BigDecimal getMta() {
		return mta;
	}

	/**
	 * @param mta the mta to set
	 */
	public void setMta(BigDecimal mta) {
		this.mta = mta;
	}

	/**
	 * @return the pme
	 */
	public BigDecimal getPme() {
		return pme;
	}

	/**
	 * @param pme the pme to set
	 */
	public void setPme(BigDecimal pme) {
		this.pme = pme;
	}

	/**
	 * @return the eventStatus
	 */
	public String getEventStatus() {
		return eventStatus;
	}

	/**
	 * @param eventStatus the eventStatus to set
	 */
	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

}