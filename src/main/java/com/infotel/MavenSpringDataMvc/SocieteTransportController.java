package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;
import com.infotel.MavenSpringDataMvc.service.Iservice;


@Controller
public class SocieteTransportController {
	@Autowired
    private Iservice service;
	
	@RequestMapping(value = "/manageCompany", method = RequestMethod.GET)
    public String lister(Model model) {
        model.addAttribute("company", new SocieteTransport());
        model.addAttribute("companies", service.findAllCompanies());
        return "companies";
    }

    @RequestMapping(value = "/saveCompany")
    public String save(SocieteTransport soc,  Model model) {
        if (soc.getIdSociete() == 0) {
            service.addCompany(soc);
            model.addAttribute("company", new SocieteTransport());
            model.addAttribute("companies", service.findAllCompanies());
            return "companies";
        } else {
            service.editCompany(soc);
            model.addAttribute("company", new SocieteTransport());
            model.addAttribute("companies", service.findAllCompanies());
            return "companies";
        }    
    }
    
    @RequestMapping(value = "/deleteCompany")
    public String delete(@RequestParam int idSociete, Model model) {
        service.deleteCompany(idSociete);
        model.addAttribute("company", new SocieteTransport());
        model.addAttribute("companies", service.findAllCompanies());
        return "companies";
    }

    @RequestMapping(value = "/editCompany")
    public String edit(@RequestParam int idSociete, Model model) {
        model.addAttribute("company", service.getCompany(idSociete));
        model.addAttribute("companies", service.findAllCompanies());
        return "companies";
    }
}
