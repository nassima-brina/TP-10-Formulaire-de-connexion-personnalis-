package ma.fstg.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/user/dashboard")
    public String userDashboard() {
        return "user-dashboard";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "admin-dashboard";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";   // important
    }
}