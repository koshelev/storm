package backtype.storm.queueing;

import backtype.storm.tuple.Tuple;

public abstract class BaseDestination<T> implements Destination {
	
	private TupleConverter<T> converter;

	public BaseDestination(TupleConverter<T> converter) {
		super();
		this.converter = converter;
	}

	public void send(Tuple... tuples) {
		for (Tuple tuple : tuples) {
			doSend(converter.convert(tuple));
		}
	}
	
	protected abstract void doSend(T message);
	
}
