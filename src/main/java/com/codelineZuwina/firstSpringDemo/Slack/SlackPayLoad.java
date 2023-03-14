package com.codelineZuwina.firstSpringDemo.Slack;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class SlackPayLoad {

    private String text;
    public SlackPayLoad(String text){this.text=text;}
}
