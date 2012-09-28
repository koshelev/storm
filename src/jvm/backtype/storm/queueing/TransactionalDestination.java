package backtype.storm.queueing;

import backtype.storm.transactional.TransactionAttempt;

/**
 * Extends the {@link Destination} interface with transactional capabilities.
 * 
 * @author koshelev
 *
 */
public interface TransactionalDestination extends Destination {
	void start(TransactionAttempt tx);
	
	void commit();
}
