# Kafka Streams Realtime

A Java application using the Kafka Streams API for real-time fraud detection.

## pipeline
1. Source: `transactions` topic.
2. Process: Filter transactions > $10,000.
3. Sink: `suspicious-transactions` topic.
