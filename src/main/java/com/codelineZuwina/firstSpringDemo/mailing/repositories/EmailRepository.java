package com.codelineZuwina.firstSpringDemo.mailing.repositories;

import com.codelineZuwina.firstSpringDemo.mailing.models.EmailDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository {
    String sendSimpleMailToMany(EmailDetails emailDetails);
    String sendSimpleMail(EmailDetails emailDetails);
    String sendMailWithAttachmentToMany(EmailDetails emailDetails);
    String sendMailWithAttachment(EmailDetails emailDetails);
}
