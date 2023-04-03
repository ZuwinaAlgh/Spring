package com.codelineZuwina.firstSpringDemo.Slack;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SlackClient {

    public String sendMessage(String text){
        return WebClient.create().post()
                .uri("https://hooks.slack.com/services/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")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(new SlackPayLoad(text))
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }



}
