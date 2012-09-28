package backtype.storm.queueing;

import java.io.Serializable;
import java.util.Map;

import backtype.storm.task.TopologyContext;

/**
 * Creates new instances of {@link Destination}
 * 
 * @author koshelev
 *
 * @param <T>
 */
public interface DestinationFactory<T extends Destination> extends Serializable {
	T makeDestination(Map stormConf, TopologyContext context);
}
