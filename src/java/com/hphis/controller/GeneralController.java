package com.hphis.controller;

import com.hphis.pojo.Paciente;
import com.hphis.service.CheckService;
import com.hphis.service.PacienteService;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralController extends MultiActionController {

    private CheckService checkService;
//    private PacienteService pacienteService;

    public void setCheckService(CheckService checkService) {
        this.checkService = checkService;
    }
    
//    public void setPacienteService(PacienteService pacienteService) {
//		this.pacienteService = pacienteService;
//	}

	public ModelAndView agendaUrgencias(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String everythingIsOK = checkService.isEverythingOK();
        if (everythingIsOK.equals("yes!")) {
            return new ModelAndView("agendaUrgenciasView");
        }
        else {
            throw new Exception("Error found!");
        }
    }

//   public ModelAndView getPacientes (HttpServletRequest request, HttpServletResponse response) throws Exception {
//   	List<Paciente> pacientes = pacienteService.getAllPacientes();
//    	Map params = new HashMap<>();
//        params.put("pacienteList",pacientes);
//       return new ModelAndView("getPacientes", params);
//    }
    
}
