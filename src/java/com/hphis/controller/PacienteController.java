package com.hphis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.hphis.pojo.Paciente;
import com.hphis.service.PacienteService;

public class PacienteController {
	
	private PacienteService pacienteService;
	
  public void setPacienteService(PacienteService pacienteService) {
		this.pacienteService = pacienteService;
	}

    public ModelAndView getPacientes (HttpServletRequest request, HttpServletResponse response) throws Exception {
    	List<Paciente> pacientes = pacienteService.getAllPacientes();
    	Map params = new HashMap<>();
        params.put("pacienteList",pacientes);
        return new ModelAndView("getPacientes", params);
    }
	
}
