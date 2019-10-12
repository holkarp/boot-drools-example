package com.phlab.controller;

import java.math.BigDecimal;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.phlab.model.Event;
import com.phlab.service.EventService;

/**
 * @author prashant
 *
 */
@RestController
public class EventController {

	private static final Logger LOGGER = LogManager.getLogger(EventController.class);
	private final EventService eventService;

	/**
	 * @param eventService
	 */
	@Autowired
	public EventController(EventService eventService) {
		this.eventService = eventService;
	}

	/**
	 * @param mta
	 * @return
	 */
	@RequestMapping(value = "/getEventStatus", method = RequestMethod.GET, produces = "application/json")
	public Event getEventStatus(@RequestParam(required = true) BigDecimal mta, @RequestParam(required = true) BigDecimal pme) {
		LOGGER.info("mta:"+mta+", pme:"+pme);
		Event event = new Event();
		event.setMta(mta);
		event.setPme(pme);
		eventService.getEventStatus(event);

		return event;
	}

}
