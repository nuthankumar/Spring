package org.tss.spring.mvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloworld")
public class MyController{
    
   
    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(ModelMap modelMap){
 
        modelMap.addAttribute("message1", "thesoftschool.com!");
        return "mypage1";
    }
    
    @RequestMapping(value="/new",method = RequestMethod.GET)
    public ModelAndView helloWorld(){
 
    	  ModelAndView modelAndView = new ModelAndView("mypage2");
          modelAndView.addObject("message2", "Spring MVC!");
          modelAndView.setViewName("mypage2");
          return modelAndView;
    }
    
    

}
