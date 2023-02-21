package pl.newProject.newTask;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class TextController {
    @GetMapping("/")
    String home(Model model) {
        model.addAttribute("firstName", "Jan");
        model.addAttribute("lastName", "Kowalski");
        return "index";
    }
}
