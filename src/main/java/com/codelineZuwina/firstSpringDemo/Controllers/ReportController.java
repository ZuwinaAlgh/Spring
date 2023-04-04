package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.jar.JarException;
@RequestMapping(value="report")
@RestController
public class ReportController {
    @Autowired
    ReportService reportService;
    @RequestMapping(value="generateSchoolReport")
    public String generateSchoolReport() throws JRException, FileNotFoundException{
        return reportService.generateReport();
    }


    @RequestMapping(value="getStudentsReport", method = RequestMethod.GET)
    public void generateStudentsReport() throws JRException, FileNotFoundException{
          reportService.generateStudentsReport();
    }


}
