package com.codelineZuwina.firstSpringDemo.mailing.models;

import lombok.*;

import java.util.List;
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {
    private List<String> recipient;
    private String msgBody;
    private String subject;
    private String attachment;

}
