package com.paradigm_shifters.Randevu.controller.api;

import com.paradigm_shifters.Randevu.model.SampleResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {

    @RequestMapping("/api01")
    public SampleResponse Sample(@RequestParam(value = "name",
            defaultValue = "Dany") String name) {
        SampleResponse response = new SampleResponse();
        response.setId(1);
        response.setMessage("Your name is " + name);
        return response;

    }
}