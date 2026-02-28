package uk.ac.belfastmet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.service.TopTenService;

@Controller
@RequestMapping
public class TopTenController {

    @Autowired
    private TopTenService topTenService;
    Logger log = LoggerFactory.getLogger(TopTenController.class);

    @GetMapping()
    public String homePage(Model model) {

        topTenService.getalbumsTopTen();
        // model.addAttribute(attributeName, attributeValue);
        model.addAttribute("pageTitle", "Top Ten Music");
        log.info("index log");
        return "index";
    }

    /**
     * This method is sending singles list
     *
     * @param model
     * @return
     */

    @GetMapping("/singles")
    public String singlesPage(Model model) {
        TopTenService toptenService = new TopTenService();
        model.addAttribute("pageTitle", "Top Ten Singles");
        model.addAttribute("singles", toptenService.getsinglesTopTen());
        log.info("singles log");
        return "singles";
    }

    @GetMapping("/albums")
    public String albumsPage(Model model) {
        TopTenService toptenService = new TopTenService();
        model.addAttribute("pageTitle", "Top Ten Albums");
        model.addAttribute("albums", toptenService.getalbumsTopTen());
        log.info("albums log");
        return "albums";
    }
}
