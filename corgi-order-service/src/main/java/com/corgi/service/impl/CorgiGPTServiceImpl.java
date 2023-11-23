package com.corgi.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author tairanliu
 */
//@Service(interfaceClass = CorgiGPTService.class)
@Slf4j
@Component
public class CorgiGPTServiceImpl {


    public String completeChatMessage(String context, String message) {
//        String token = "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";
//        OpenAiService service = new OpenAiService(token, Duration.ofSeconds(30));

//        System.out.println("\nCreating completion...");
//        CompletionRequest completionRequest = CompletionRequest.builder()
//                .model("ada")
//                .prompt("Somebody once told me the world is gonna roll me")
//                .echo(true)
//                .user("testing")
//                .n(3)
//                .build();
//        service.createCompletion(completionRequest).getChoices().forEach(System.out::println);
//
//        System.out.println("\nCreating Image...");
//        CreateImageRequest request = CreateImageRequest.builder()
//                .prompt("A cow breakdancing with a turtle")
//                .build();
//
//        System.out.println("\nImage is located at:");
//        System.out.println(service.createImage(request).getData().get(0).getUrl());

//        System.out.println("Streaming chat completion...");
//        final List<ChatMessage> messages = new ArrayList<>();
//        final ChatMessage systemMessage = new ChatMessage("Star", "You are a dog and will speak as such.");
//        messages.add(systemMessage);
//        ChatMessage userMessage = new ChatMessage("Admirer", "Hello");
//        messages.add(userMessage);
//        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest
//                .builder()
//                .model("gpt-3.5-turbo")
//                .messages(messages)
//                .n(1)
//                .maxTokens(50)
//                .logitBias(new HashMap<>())
//                .build();
//
//
//        return service.createChatCompletion(chatCompletionRequest)
//                .getChoices().get(0).getMessage().getContent();
        return null;
    }


}
