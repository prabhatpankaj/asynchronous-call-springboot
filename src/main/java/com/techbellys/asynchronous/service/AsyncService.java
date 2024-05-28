package com.techbellys.asynchronous.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

    @Async
    public void performAsyncTask() {
        System.out.println("Start async task: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000); // Simulate a long-running task
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Completed async task: " + Thread.currentThread().getName());
    }

    @Async
    public CompletableFuture<String> performAsyncTaskWithFuture() {
        System.out.println("Start async task: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000); // Simulate a long-running task
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Completed async task: " + Thread.currentThread().getName());
        return CompletableFuture.completedFuture("Task Completed");
    }
}
