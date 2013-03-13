package itextdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Peike Dai
 */
public class ITextDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        FileOutputStream out = new FileOutputStream("iTextOutput/demo1.pdf");
        PdfDocument pdfdoc = new PdfDocument(out);
        // name 
        PdfTextBlock name = new PdfTextBlock("PEIKE DAI", -1);
        name.setFontSize(14).setBold();
        pdfdoc.add(name);
        //email
        PdfTextBlock email = new PdfTextBlock("dpk1216@gmail.com", -1);
        email.setFontSize(11f);
        pdfdoc.add(email);
        //telephone
        PdfTextBlock tele = new PdfTextBlock("(315)751-6010", 12f, -1);
        tele.setFontSize(11f);
        pdfdoc.add(tele);
        // first separator
        pdfdoc.add(PdfWidgetFactory.createSeparator());
        // summary
        PdfTextBlock sum = new PdfTextBlock("Diligent and highly motivated software "
                + "engineering student with solid experience in object oriented "
                + "design and implementation. Resourceful, results oriented "
                + "individual with proven ability in architecture and"
                + " implementing extensive technological solutions", 2);
        sum.setFontSize(11f);
        pdfdoc.add(sum);
        //Educatino
        PdfTextBlock sub = new PdfTextBlock("EDUCATION", 22f, -1);
        sub.setFontSize(12f);
        pdfdoc.add(sub);
        // 2nd separator
        pdfdoc.add(PdfWidgetFactory.createSeparator());
        
        PdfTable edu1line1 = new PdfTable(2, new float[] {0.8f, 0.2f});
        edu1line1.addCell("M.S.in Computer Engineering", 16f, 4, false)
                .addCell("Syracuse, NY", 16f, 6, false);
        edu1line1.isBold(true).setMarginTop(6f).setContentFontSize(11f);
        pdfdoc.add(edu1line1);
        PdfTable edu1 = new PdfTable(2, new float[] {0.8f, 0.2f});
        edu1.addCell("Syracuse University", 16f, 4, false)
                .addCell("May 2013", 16f, 6, false)
                .addCell("Relevant Coursework: Algorithm, Object Oriented Design, Design Pattern", 16f, 4, false)
                .addCell("", 16f, 6, false);
        edu1.setContentFontSize(11f);
        pdfdoc.add(edu1);
        
        PdfTable edu2line1 = new PdfTable(2, new float[] {0.8f, 0.2f});
        edu2line1.addCell("B.S. in Communication Engineering", 16f, 4, false)
                .addCell("Chengdu, China", 16f, 6, false);
        edu2line1.isBold(true).setMarginTop(6f).setContentFontSize(11f);
        pdfdoc.add(edu2line1);
        PdfTable edu2 = new PdfTable(2, new float[] {0.8f, 0.2f});
        edu2.addCell("University of Electronic Science and Technology of China", 16f, 4, false)
                .addCell("July 2011", 16f, 6, false)
                .addCell("Relevant Coursework: Computer Network, TCP/IP", 16f, 4, false)
                .addCell("", 16f, 6, false);
        edu2.setContentFontSize(11f);
        pdfdoc.add(edu2);
        
        // Project
        PdfTextBlock sub2 = new PdfTextBlock("PROJECT", 22f, -1);
        sub.setFontSize(12f);
        pdfdoc.add(sub2);
        
        pdfdoc.add(PdfWidgetFactory.createSeparator());
        
        PdfTable proj1 = new PdfTable(2,  new float[] {0.7f, 0.3f});
        proj1.addCell("Bytecast", 16f, 4, false)
                .addCell("january 2013 ~ present", 16f, 6, false)
                .addCell("- Structure one of four modules of an "
                + "application that can transfer binary executive to JAVA      "
                + "bytecode.", 32f, false, 0, 2);
        proj1.setMarginTop(6f).setContentFontSize(11f);
        pdfdoc.add(proj1);
        
        PdfTable proj2 = new PdfTable(2,  new float[] {0.6f, 0.4f});
        proj2.addCell("Virtual Machine (VM) Resource Usage Prediction", 16f, 4, false)
                .addCell("September 2012 ~ November 2012", 16f, 6, false)
                .addCell("- SDeveloped a VM monitor and management application "
                + "using VMware vSphere API.", 16f, false, 0, 2)
                .addCell("- Evaluated performances of algorithms on future "
                + "resource usage predicting.", 16f, false, 0, 2);
        proj2.setMarginTop(6f).setContentFontSize(11f);
        pdfdoc.add(proj2);
        
        PdfTable proj3 = new PdfTable(2,  new float[] {0.6f, 0.4f});
        proj3.addCell("Remote Sniffer", 16f, 4, false)
                .addCell("March 2012 ~ May 2012", 16f, 6, false)
                .addCell("- Developed a cross-platform application that "
                + "can detect changes of files, ports and processes.", 16f, false, 0, 2)
                .addCell("- Strengthened its stability by applying Windows "
                + "Azure Cloud Service as a report transmission buffer "
                + "using Azure .NET and RESTful API.", 32f, false, 0, 2);
        proj3.setMarginTop(6f).setContentFontSize(11f);
        pdfdoc.add(proj3);
        
        PdfTable proj4 = new PdfTable(2,  new float[] {0.6f, 0.4f});
        proj4.addCell("Todolist", 16f, 4, false)
                .addCell("March 2012 ~ May 2012", 16f, 6, false)
                .addCell("- Designed and developed a website using ASP.NET and "
                + "AJAX that provides a web-based personal task manager for "
                + "registered user.", 32f, false, 0, 2)
                .addCell("- Increased its expandability by providing a Web "
                + "Service as a custom facility to support group users to "
                + "build their own web application such as \"bug list\".", 32f, false, 0, 2);
        proj4.setMarginTop(6f).setContentFontSize(11f);
        pdfdoc.add(proj4);
        
        // Internship
        PdfTextBlock sub3 = new PdfTextBlock("INTERNSHIP", 22f, -1);
        sub.setFontSize(12f);
        pdfdoc.add(sub2);
        
        pdfdoc.add(PdfWidgetFactory.createSeparator());
        
        PdfTable intern1 = new PdfTable(2,  new float[] {0.6f, 0.4f});
        intern1.addCell("Software Engineer Intern, RepeatLink Inc.", 16f, 4, false)
                .addCell("June 2012 ~ August 2012", 16f, 6, false)
                .addCell("- Accomplished a PDF report manipulation module using "
                + "iText - a open source library for creating PDF files in JAVA.", 32f, false, 0, 2)
                .addCell("- Redesigned their Struts2-based application by "
                + "adapting their already existing modules to mine.", 16f, false, 0, 2)
                .addCell("- Simplified the development process by reducing 1/3 "
                + "of time of other team members when developing functions "
                + "related to PDF manipulation.", 32f, false, 0, 2);
        intern1.setMarginTop(6f).setContentFontSize(11f);
        pdfdoc.add(intern1);
        
        pdfdoc.saveDoc();
    }
   
}
