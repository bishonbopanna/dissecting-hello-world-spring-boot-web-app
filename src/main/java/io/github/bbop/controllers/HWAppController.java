package io.github.bbop.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bishonbopanna
 */
@RestController // This a convenience annotation that does nothing more than adding the @Controller
                // and @ResponseBody annotations. See the JavaDocs for more info.
                // But in simple terms - this annotation takes the return value and add it to the http response object directly.
public class HWAppController
{
    @RequestMapping("/dissect-hello-world") // This annotation it to configure your service path/URI
    public String someMethod() {
        return "You have now dissected Hello World spring-boot web app (to an extent ;))";
    }
}
