package haarisrmnyr.com.ai_resume_optimizer_tool;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:5173")
@RequestMapping("/api")
public class feConnect {
    @GetMapping("/connect")
    public String getConnection() {
        return "Back End Connection Succesful!";
    }
    




}