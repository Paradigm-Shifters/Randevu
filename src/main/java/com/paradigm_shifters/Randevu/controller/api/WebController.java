package com.paradigm_shifters.Randevu.controller.api;

import com.paradigm_shifters.Randevu.model.SampleHTMLParser;
import com.paradigm_shifters.Randevu.model.SampleResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

@RestController
public class WebController {

    @RequestMapping("/api01")
    public SampleResponse Sample(@RequestParam(value = "name", defaultValue = "Dany") String name) {
        SampleResponse response = new SampleResponse();
        response.setId(1);
        response.setMessage("Your name is " + name);
        return response;
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
            System.out.println("title : " + title);

            // get all links
            links = doc.select("a[href]");
            for (Element link : links) {

                // get the value from href attribute
                System.out.println("\nlink : " + link.attr("href"));
                System.out.println("\ntext : " + link.text());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String t_title = "Title: " + title;
        String l_link = "Link: " + links.attr("href");
        String t_text = "Text: " + links.text();
        return t_title + "</br>" + l_link + "</br>" + t_text;

    }
}