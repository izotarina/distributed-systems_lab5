package lab5;

import akka.actor.AbstractActor;
import akka.japi.Pair;
import akka.japi.pf.ReceiveBuilder;

import java.util.HashMap;
import java.util.Map;

public class StorageActor extends AbstractActor {
    private Map<Pair<String, Integer>, String> store = new HashMap<>();

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(StoreTestResult.class, m -> {
                    Pair<String, Integer> key = new Pair<>(m.getUrl(), m.getRequestCount());
                    store.put(key, m.getResult());
                })
                .match(GetTestResult.class, req -> {
                    Pair<String, Integer> key = new Pair<>(m.getUrl(), m.getRequestCount());
                    sender().tell(new StoreMessage(req.getKey(), store.get(req.getKey())), self())
                }
                ).build();
    }
}
