package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.infotel.MavenSpringDataMvc.service.Iservice;


@Controller
public class RoutiereController {
	@Autowired
    private Iservice service;
}