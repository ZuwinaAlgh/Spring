package com.codelineZuwina.firstSpringDemo.mailing.Controller;

import com.codelineZuwina.firstSpringDemo.mailing.models.EmailDetails;
import com.codelineZuwina.firstSpringDemo.mailing.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="email")
public class EmailController {
    @Autowired
    EmailService emailService;
    @PostMapping(value = "sendSimpleMailToMany")                                              //Send Simple Mail to Many
    public String sendSimpleMailToMany(@RequestBody EmailDetails emailDetails){
        String mail= emailService.sendSimpleMailToMany(emailDetails);
        return mail;
    }
    @PostMapping(value = "sendSimpleMail")                                                   //send Simple Mail
    public String sendSimpleMail(@RequestBody EmailDetails emailDetails){
        String mail=emailService.sendSimpleMail(emailDetails);
        return  mail;
    }
    @PostMapping(value = "sendMailWithAttachmentToMany")                                    //send Mail With Attachment To Many
    public String sendMailWithAttachmentToMany(@RequestBody EmailDetails emailDetails){
        String mail=emailService.sendMailWithAttachmentToMany(emailDetails);
        return mail;
    }
    @PostMapping(value = "sendMailWithAttachment")                                          //send Mail With Attachment
    public String sendMailWithAttachment(@RequestBody EmailDetails emailDetails){
        String mail=emailService.sendMailWithAttachment(emailDetails);
        return mail;
    }





}
