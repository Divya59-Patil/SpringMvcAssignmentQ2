package com.simpleInterestcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {

    @RequestMapping(value = "/calculateSimpleInterest", method = RequestMethod.POST)
    public ModelAndView calculateSimpleInterest(@RequestParam("principalAmount") double principalAmount,
                                                 @RequestParam("numberOfYears") int numberOfYears,
                                                 @RequestParam("rateOfInterest") double rateOfInterest) {
        double simpleInterest = (principalAmount * numberOfYears * rateOfInterest) / 100;
        ModelAndView modelAndView = new ModelAndView("simpleInterestResult");
        modelAndView.addObject("simpleInterest", simpleInterest);
        return modelAndView;
    }
}
