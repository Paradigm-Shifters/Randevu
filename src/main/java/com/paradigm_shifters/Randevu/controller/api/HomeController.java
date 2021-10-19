package com.paradigm_shifters.Randevu.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/HomePage")
    public String HomePage() {
        return "RandevuHomePage";
    }
    
    @RequestMapping("/SearchPage")
    public String SearchPage() {
        return "RandevuSearchPage";
    }
    
    @GetMapping("/redirect1")
    public ModelAndView redirect1(ModelMap model) {
        return new ModelAndView("redirect:/HomePage", model);
    }
    
    @GetMapping("/redirect2")
    public ModelAndView redirect2(ModelMap model) {
        return new ModelAndView("redirect:/SearchPage", model);
    }
    
}
