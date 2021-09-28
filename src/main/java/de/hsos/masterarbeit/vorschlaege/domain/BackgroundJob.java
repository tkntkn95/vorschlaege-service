package de.hsos.masterarbeit.vorschlaege.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BackgroundJob {

    @Autowired
    TaskExecutor executor;

    @Autowired
    KafkaListenerRunner runner;

    @PostConstruct
    public void start() {
        System.out.println("Starting KafkaListenerRunner in the background!");
        executor.execute(runner);
    }
}
