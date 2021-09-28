package de.hsos.masterarbeit.vorschlaege.domain;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfiguration {
    @Bean
    public NewTopic topicExample() {
        return TopicBuilder.name("articles")
                .build();
    }

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "articleservice.servicebus.windows.net:9093");
        configs.put("sasl.mechanism", "PLAIN");
        configs.put("sasl.jaas.config", "org.apache.kafka.common.security.plain.PlainLoginModule   required username='$ConnectionString'   password='Endpoint=sb://articleservice.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=rQgOzPQExZtmeAHqx+62v5qZmZfuz5+UfEiwAc1DURI=';");
        configs.put("security.protocol", "SASL_SSL");
        return new KafkaAdmin(configs);
    }
}
