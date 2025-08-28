package pl.coderslab.module6_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/trails")
public class TrailViewController {

    @Autowired
    private TrailService trailService;

    @GetMapping
    public String listTrails(Model model) {
        List<Trail> trails = trailService.getAllTrails();
        model.addAttribute("trails", trails);
        return "trail-list";
    }
}

