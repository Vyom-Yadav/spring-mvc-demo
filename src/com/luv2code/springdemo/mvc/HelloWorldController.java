package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // need a controller method to show the initial HTML form,

    @RequestMapping("/showForm") // full path will be /hello/showForm
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form.

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // new controller method to read from data and
    // add data to the model.

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

/*        The model gets created by the Spring MVC dispatcher servlet. It is created for each web request.
          It is basically a  container / data structure that is passed between the controller and the view.
          You can use it to share data between the controller and the view.
          for example, if you get data from a db using your controller,
          then the controller and put the db results in the model and ship it over to the jsp view for display.
*/

        // read the request parameter from HTML form.
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();

        // create the message
        theName = "Yo! Bro " + theName;

        // add message to model
        model.addAttribute("message", theName);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

        theName = theName.toUpperCase();

        // create the message
        theName = "Yo! Bro How Ya Doing " + theName;

        // add message to model
        model.addAttribute("message", theName);

        return "helloworld";
    }
}
