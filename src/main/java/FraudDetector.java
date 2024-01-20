package com.example.kafka.streams;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;

public class FraudDetector {
    public static void main(String[] args) {
        StreamsBuilder builder = new StreamsBuilder();
        KStream<String, Transaction> transactions = builder.stream("transactions");

        transactions.filter((key, txn) -> txn.getAmount() > 10000)
                .to("suspicious-transactions");
    }
}
