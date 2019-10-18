package com.swithfully.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @RequestMapping("/")
    @ResponseBody
    String getWelcomeMessage() {
        String css = "<!DOCTYPE html>\n" +
                "<html lang = \"en-US\">\n" +
                " <head>\n" +
                " <meta charset = \"UTF-8\">\n" +
                " <title>externalStyle.html</title>\n" +
                " <link rel = \"stylesheet\"\n" +
                "   type = \"text/css\"\n" +
                "   href = \"myStyle.css\" />\n" +
                " </head>";


        return css + "<H1>Hello World!</H1>" +
                "<a href=\"/goodbye\"> Klik </a>";

    }

    @RequestMapping("/goodbye")
    @ResponseBody
    String getGoodBy() {
        return "Slaapwel <a href=\"/\"> Terug </a>";
    }

    @RequestMapping("{Id}")
    @ResponseBody
    String getProductById(@PathVariable String Id) {
        return Id;
    }

    @RequestMapping("myStyle.css")
    @ResponseBody
    String getCSS() {
        String css = "body {\n" +
                " background-color: #333300;\n" +
                " color: #0000FF;\n" +
                "}";
        return css;
    }
}