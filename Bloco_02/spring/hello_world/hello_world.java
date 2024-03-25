import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsms")
    public List<String> getBSMs() {
        // Supondo que haja uma classe BSMService para obter a lista de BSMs
        // Exemplo fictício:
        return Arrays.asList("BSM1", "BSM2", "BSM3");
    }

    @GetMapping("/learning-objectives")
    public List<String> getLearningObjectives() {
        return Arrays.asList(
                "Aprender Spring Boot",
                "Praticar endpoints REST",
                "Compreender controle de versão com Git"
        );
    }
}
