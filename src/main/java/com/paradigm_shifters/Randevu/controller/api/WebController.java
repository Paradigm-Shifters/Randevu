package com.paradigm_shifters.Randevu.controller.api;

import com.paradigm_shifters.Randevu.model.SampleHTMLParser;
import com.paradigm_shifters.Randevu.model.SampleResponse;
import com.paradigm_shifters.Randevu.model.CurrentDate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.io.IOException;
import java.util.Arrays;

@RestController
public class WebController {

    @RequestMapping("/api01")
    public SampleResponse Sample(@RequestParam(value = "name", defaultValue = "Dany") String name) {
        SampleResponse response = new SampleResponse();
        response.setId(1);
        response.setMessage("Your name is " + name);
        return response;
    }
    
    @RequestMapping("/date")
    public String getTodaysDate() {
    	CurrentDate todaysDateInformation = new CurrentDate();
    	String fullDateInfo = todaysDateInformation.getFullDateString();
    	return fullDateInfo;
    }
    @RequestMapping("/Joseph")
    public String greetings()
    {
  	    String Greet = "Hello Welcome to Randevu";
        return Greet;
    }
    
    @RequestMapping("/jason")
    public String hijason() {
        return "Hi, Jason";
    }
    
    @RequestMapping("/random_value")
    public String randVal() {
    	NormalDistribution normalDistribution = new NormalDistribution(10, 3);
    	double randomValue = normalDistribution.sample();
    	return ("The random value is: " + randomValue);
    }
    
    @RequestMapping("/html_parser")
    public String SampleHTML() {
        Document doc;
        String title = "";
        Elements links = null;
        try {

            // need http protocol
            doc = Jsoup.connect("http://google.com").get();

            // get page title
            title = doc.title();
//            System.out.println("title : " + title);

            // get all links
            links = doc.select("a[href]");
//            for (Element link : links) {
//
//                // get the value from href attribute
//                System.out.println("\nlink : " + link.attr("href"));
//                System.out.println("\ntext : " + link.text());
//
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String t_title = "Title: " + title;
        String l_link = "Link: " + links.attr("href");
        String t_text = "Text: " + links.text();
        return t_title + "</br>" + l_link + "</br>" + t_text;

    }
    
    @RequestMapping("/hash/{text}")
    public String quickHash(@PathVariable String text) {
    	//direct md5 hash cannot be displayed by browser, hex can
    	//String md5 = new String(DigestUtils.md5(text));
    	String md5Hex = DigestUtils.md5Hex(text).toUpperCase();
    	String sha1Hex = DigestUtils.sha1Hex(text).toUpperCase();
    	String sha512Hex = DigestUtils.sha512Hex(text).toUpperCase();
    	String temp = "The hex of the MD5 hash of " + "'" + text + "'" + " is " + md5Hex +
    			"<br>The hex of the SHA1 hash of " + "'" + text + "'" + " is " + sha1Hex +
    			"<br>The hex of the SHA512 hash of " + "'" + text + "'" + " is " + sha512Hex +
    			"<br><br> <h1>This is why you should always be aware of what methods of encryption you use! </h1>";
    	return temp;
    	
    }
        //Joseph A2 p2
  	double[] values = new double[] {65, 51 , 16, 11 , 6519, 191 ,0 , 98, 19854, 1, 32};{
  DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();	
  	for (double v : values) {
  		descriptiveStatistics.addValue(v);
  	}
  	
  	double mean = descriptiveStatistics.getMean();
  	double median = descriptiveStatistics.getPercentile(50);
  	double standardDeviation = descriptiveStatistics.getStandardDeviation();
  	}
}

}
