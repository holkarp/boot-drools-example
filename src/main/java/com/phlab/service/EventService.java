package com.phlab.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phlab.listeners.TrackingAgendaEventListener;
import com.phlab.model.Event;

/**
 * @author prashant
 *
 */
@Service
public class EventService {

	private final KieContainer kieContainer;

	/**
	 * @param kieContainer
	 */
	@Autowired
	public EventService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	/**
	 * @param event
	 * @return
	 */
	public Event getEventStatus(Event event) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.addEventListener(new TrackingAgendaEventListener());
		kieSession.insert(event);
		kieSession.fireAllRules();
		kieSession.dispose();
		return event;
	}
}