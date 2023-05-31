package com.sistema.gerenciadorfuncionarios.controller;


import java.util.List;

import com.sistema.gerenciadorfuncionarios.model.Funcionario;
import com.sistema.gerenciadorfuncionarios.model.FuncionarioSetor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sistema.gerenciadorfuncionarios.model.repository.FuncionarioRepository;


@Controller
public class HomeController {

    @Autowired
    private FuncionarioRepository funcRepository;
    
    

    @GetMapping("/home")
    public String home(Model model) {
    	List<Funcionario> funcionarios = funcRepository.findAll();
    	
        model.addAttribute("funcionarios", funcionarios);
        return "home";
    }
   

    @GetMapping
    public String setor(@RequestParam String setor, Model model) {
    	FuncionarioSetor funcionarioSetor = FuncionarioSetor.valueOf(setor.toUpperCase());
        List<Funcionario> funcionarios = funcRepository.findBySetor(funcionarioSetor);
       
        model.addAttribute("funcionarios", funcionarios);
        return "home";
    }
   

}
