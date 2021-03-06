package e.g.com.areba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/violet")
public class MovieController {

    String message;

    @RequestMapping(value="/{name}", method = RequestMethod.GET)
    public String getMovie(@PathVariable String name, ModelMap model) {
    	model.addAttribute("movie", name);
    	model.addAttribute("message", this.message);
    	return "list";
    }

    /*メッセージの設定*/
    public void setMessage(String message) {
        this.message = message;
    }
}
