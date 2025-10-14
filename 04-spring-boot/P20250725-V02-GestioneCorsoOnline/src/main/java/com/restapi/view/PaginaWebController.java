package com.restapi.view;

import com.restapi.model.CategoriaEntity;
import com.restapi.model.CorsoEntity;
import com.restapi.model.DocenteEntity;
import com.restapi.repository.CategoriaRepository;
import com.restapi.repository.CorsoRepository;
import com.restapi.repository.DocenteRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/view")
public class PaginaWebController {
	
	@Autowired
    private final DocenteRepository docenteRepository;
	
	@Autowired
    private final CategoriaRepository categoriaRepository;
	
	@Autowired
    private final CorsoRepository corsoRepository;

    PaginaWebController(CorsoRepository corsoRepository, CategoriaRepository categoriaRepository, DocenteRepository docenteRepository) {
        this.corsoRepository = corsoRepository;
        this.categoriaRepository = categoriaRepository;
        this.docenteRepository = docenteRepository;
    }
    
    // 1. URL: http://localhost:8080/view/home

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/corsi")
    public String visualizzaCorsi(Model model) {
        model.addAttribute("corsi", corsoRepository.findAll());
        model.addAttribute("categorie", categoriaRepository.findAll());
        return "corsi";
    }

    @GetMapping("/docenti")
    public String cercaPerDocente(Model model) {
        model.addAttribute("docenti", docenteRepository.findAll());
        return "docenti";
    }
    
    @GetMapping("/categorie")
    public String cercaPerCategoria(Model model) {
    	model.addAttribute("categorie", categoriaRepository.findAll());
    	return "categorie"; // pagina con menu a tendina
    }

    @PostMapping("/docenti/corsi")
    public String mostraCorsiPerDocente(@RequestParam Long docenteId, Model model) {
        DocenteEntity docente = docenteRepository.findById(docenteId).orElseThrow();
        List<CorsoEntity> corsi = corsoRepository.findByDocente(docente);
        model.addAttribute("corsi", corsi);
        return "corsi-docente";
    }
    
    @PostMapping("/categorie/corsi")
    public String mostraCorsiPerCategoria(@RequestParam Long categoriaId, Model model) {
    	CategoriaEntity categoria = categoriaRepository.findById(categoriaId).orElseThrow();
    	List<CorsoEntity> corsi = corsoRepository.findByCategoria(categoria);
    	model.addAttribute("corsi", corsi);
    	return "corsi-categoria";
    }


}
