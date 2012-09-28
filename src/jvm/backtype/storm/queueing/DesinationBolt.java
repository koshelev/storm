package backtype.storm.queueing;

import java.util.Map;

import backtype.storm.coordination.BatchOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseTransactionalBolt;
import backtype.storm.transactional.TransactionAttempt;
import backtype.storm.tuple.Tuple;

public class DesinationBolt extends BaseTransactionalBolt {

	private TransactionalDestination destination;
	
	public void prepare(Map conf, TopologyContext context, BatchOutputCollector collector, TransactionAttempt id) {
		destination.start(id);
	}

	public void execute(Tuple tuple) {
		destination.send(tuple);
	}

	public void finishBatch() {
		destination.commit();
	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {}

}
