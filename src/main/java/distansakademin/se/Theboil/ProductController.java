package distansakademin.se.Theboil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("welcomeMessage", "Välkommen till TheBoil");
        model.addAttribute("discoverMessage", "Upptäck våra fantastiska menyer");
        model.addAttribute("findUsMessage", "HITTA OSS NÄRA DIG");
        return "index";
    }

    @GetMapping("/meny")
    public String meny(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "meny";
    }

    @GetMapping("/om-oss")
    public String omOss() {
        return "om-oss";
    }

    @GetMapping("/kontakta-oss")
    public String kontaktaOss() {
        return "kontakta-oss";
    }

    // Redirect /hem to /
    @RequestMapping("/hem")
    public String redirectToIndex() {
        return "redirect:/";
    }




}
