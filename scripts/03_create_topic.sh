cd /kafka_2.12-2.3.0
./bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic spring_kafka_topic_1
