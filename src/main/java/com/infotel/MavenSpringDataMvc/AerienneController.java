package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.service.Iservice;

@Controller
public class AerienneController {
	@Autowired
    private Iservice service;
	
	@RequestMapping(value="/manageAir", method=RequestMethod.GET)
    public String lister(Model model) {
        model.addAttribute("air", new Aerienne());
        model.addAttribute("airs", service.findAllAirs());
        return "airs";
    }

    @RequestMapping(value="/saveAir")
    public String save(Aerienne aer,  Model model) {
        if (aer.getIdCargaison() == 0) {
            service.addAir(aer);
            model.addAttribute("air", new Aerienne());
            model.addAttribute("airs", service.findAllAirs());
            return "airs";
        } else {
            service.editAir(aer);
            model.addAttribute("air", new Aerienne());
            model.addAttribute("airs", service.findAllAirs());
            return "airs";
        }    
    }
    
    @RequestMapping(value="/deleteAir")
    public String delete(@RequestParam int idCargaison, Model model) {
        service.deleteAir(idCargaison);
        model.addAttribute("air", new Aerienne());
        model.addAttribute("airs", service.findAllAirs());
        return "airs";
    }

    @RequestMapping(value="/editAir")
    public String edit(@RequestParam int idCargaison, Model model) {
        model.addAttribute("air", service.getAir(idCargaison));
        model.addAttribute("airs", service.findAllAirs());
        return "airs";
    }
}
