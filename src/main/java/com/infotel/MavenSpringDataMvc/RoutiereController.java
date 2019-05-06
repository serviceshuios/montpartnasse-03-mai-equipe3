package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.service.Iservice;


@Controller
public class RoutiereController {
	@Autowired
    private Iservice service;
	
	@RequestMapping(value="/manageRoad", method=RequestMethod.GET)
    public String lister(Model model) {
        model.addAttribute("road", new Routiere());
        model.addAttribute("roads", service.findAllRoads());
        return "roads";
    }

    @RequestMapping(value="/saveRoad")
    public String save(Routiere rou, Model model) {
        if (rou.getIdCargaison() == 0) {
            service.addRoad(rou);
            model.addAttribute("road", new Routiere());
            model.addAttribute("roads", service.findAllRoads());
            return "roads";
        } else {
            service.editRoad(rou);
            model.addAttribute("road", new Routiere());
            model.addAttribute("roads", service.findAllRoads());
            return "roads";
        }    
    }
    
    @RequestMapping(value="/deleteRoad")
    public String delete(@RequestParam int idCargaison, Model model) {
        service.deleteRoad(idCargaison);
        model.addAttribute("road", new Routiere());
        model.addAttribute("roads", service.findAllRoads());
        return "roads";
    }

    @RequestMapping(value="/editRoad")
    public String edit(@RequestParam int idCargaison, Model model) {
        model.addAttribute("road", service.getRoad(idCargaison));
        model.addAttribute("roads", service.findAllRoads());
        return "roads";
    }
}
