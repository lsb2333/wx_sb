package org.sbjava.commons.processors;

import org.sbjava.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {

	public void onMessage(EventInMessage msg);
}
