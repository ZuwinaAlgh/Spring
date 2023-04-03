package com.codelineZuwina.firstSpringDemo.Service;

import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Repositories.SchoolRepository;
import com.codelineZuwina.firstSpringDemo.Repositories.StudentRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {
    public static final String pathToReports = "C:\\Users\\user011\\Downloads\\reports";
    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private StudentRepository studentRepository;

    public String generateReport() throws FileNotFoundException, JRException {
        List<School> schoolList = schoolRepository.getAllSchools();
        File file = ResourceUtils.getFile("classpath:School_Report.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(schoolList);
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "ZuwinaALghafri");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,paramters , dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports+"\\schools.pdf");
        return "Report generated : " + pathToReports+"\\schools.pdf";
    }

//    public String generateALLSchoolsReport() throws FileNotFoundException, JRException {
//        List<School> schoolList = schoolRepository.getAllSchools();
//        List<Student> studentList=studentRepository.getAllStudent();
//        File file = ResourceUtils.getFile("classpath:School_Report.jrxml");
//        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
//        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(schoolList);
//        Map<String, Object> paramters = new HashMap<>();
//        paramters.put("CreatedBy", "ZuwinaALghafri");
//        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,paramters , dataSource);
//        JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports+"\\schools.pdf");
//        return "Report generated : " + pathToReports+"\\schools.pdf";
//    }


}
