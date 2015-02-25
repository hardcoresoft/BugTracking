package th.co.hardcoresoft.bugtracking.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import th.co.hardcoresoft.bugtracking.domain.Example;
import th.co.hardcoresoft.bugtracking.service.ExampleService;
 
@Controller
@RequestMapping("/example")
public class ExampleController {
 
    @Autowired
    private ExampleService exampleService;
 
    @RequestMapping("/index")
    public ModelAndView listExample(Map<String, Object> map) {
    	
    	ModelAndView modelAndView = new ModelAndView("example/example");
    	modelAndView.addObject("example", new Example());
    	modelAndView.addObject("exampleList", exampleService.listExample());
 
        return modelAndView;
    }
 
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addExample(@ModelAttribute("example")
    Example example, BindingResult result) {
 
    	exampleService.addExample(example);
 
        return "redirect:/example/index";
    }
 
    @RequestMapping("/delete/{exampleId}")
    public String deleteExample(@PathVariable("exampleId")
    Integer exampleId) {
 
    	exampleService.removeExample(exampleId);
 
        return "redirect:/contact/index";
    }
}