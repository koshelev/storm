package backtype.storm.queueing;

import backtype.storm.tuple.Tuple;

/**
 * Represents queue or topic tuples will be sent to.
 * 
 * @author koshelev
 *
 */
public interface Destination {
	void send(Tuple... tuples);
}
