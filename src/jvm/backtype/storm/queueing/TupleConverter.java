package backtype.storm.queueing;

import backtype.storm.tuple.Tuple;

public interface TupleConverter<T> {
	T convert(Tuple t);
}
