package com.techbellys.asynchronous.controller;

import com.techbellys.asynchronous.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/trigger-async")
    public String triggerAsync() {
        asyncService.performAsyncTask();
        return "Async task triggered";
    }

    @GetMapping("/trigger-async-future")
    public CompletableFuture<String> triggerAsyncFuture() {
        return asyncService.performAsyncTaskWithFuture();
    }
}