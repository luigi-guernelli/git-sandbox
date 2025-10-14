package com.restapi;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.restapi.model.CategoriaEntity;
import com.restapi.model.CorsoEntity;
import com.restapi.model.DocenteEntity;
import com.restapi.model.ProfiloEntity;
import com.restapi.model.StudenteEntity;
import com.restapi.repository.CategoriaRepository;
import com.restapi.repository.CorsoRepository;
import com.restapi.repository.DocenteRepository;
import com.restapi.repository.ProfiloRepository;
import com.restapi.repository.StudenteRepository;

@Component
public class DataInitializer implements CommandLineRunner {

	private final StudenteRepository studenteRepo;
	private final DocenteRepository docenteRepo;
	private final CategoriaRepository categoriaRepo;
	private final CorsoRepository corsoRepo;
	private final ProfiloRepository profiloRepo;

	// Costruttore per inizializzare tutti i repository
	public DataInitializer(StudenteRepository stu, DocenteRepository doc, CategoriaRepository cat, CorsoRepository cor,
			ProfiloRepository pro) {
		this.studenteRepo = stu;
		this.docenteRepo = doc;
		this.categoriaRepo = cat;
		this.corsoRepo = cor;
		this.profiloRepo = pro;
	}

	// @Override viene utilizzato per sovrascrivere un metodo gia esistente
	// nella classe genitore o un'interfaccia
	@Override
	public void run(String... args) {
		// 1. Categoria
		CategoriaEntity categoria1 = new CategoriaEntity("Informatica back-end");
		CategoriaEntity categoria2 = new CategoriaEntity("Informatica front-end");
		CategoriaEntity categoria3 = new CategoriaEntity("Selector MySQL Language");
		
		// 1.2 Utilizza le Collaction per inserire piu oggetti da visualizzare
		categoriaRepo.saveAll(List.of(categoria1, categoria2, categoria3));
		
		
		// 2. Docente
		DocenteEntity docente1= new DocenteEntity("Andrea", "Dimitri");
		DocenteEntity docente2= new DocenteEntity("Stefano", "Rago");
		DocenteEntity docente3= new DocenteEntity("Franco", "Arcieri");
		docenteRepo.saveAll(List.of(docente1, docente2, docente3));
		
		// 3. Corso collegato a Categoria e Docente
		CorsoEntity corso1 = new CorsoEntity("Java Object-Oriented Programming");
		CorsoEntity corso2 = new CorsoEntity("Angular-Html-Css-JS/TS");
		CorsoEntity corso3 = new CorsoEntity("Modellazione dei dati in un database");
		corso1.setCategoria(categoria1);
		corso1.setDocente(docente1);
		
		corso2.setCategoria(categoria2);
		corso2.setDocente(docente2);
		
		corso3.setCategoria(categoria3);
		corso3.setDocente(docente3);
		corsoRepo.saveAll(List.of(corso1, corso2, corso3));
		
		// 4. Profilo
		ProfiloEntity profilo1 = new ProfiloEntity("Studente Base");
		ProfiloEntity profilo2 = new ProfiloEntity("Studente Intermedio");
		ProfiloEntity profilo3 = new ProfiloEntity("Studente Avanzato");
		profiloRepo.saveAll(List.of(profilo1, profilo2, profilo3));
		
		// 5. Studente con Profilo e Corsi (relazione ManyToMany)
		StudenteEntity studente1 = new StudenteEntity("Mario", "Rossi");
		StudenteEntity studente2 = new StudenteEntity("Giovanni", "Verdi");
		StudenteEntity studente3 = new StudenteEntity("Rosa", "Rossa");
		
		studente1.setProfilo(profilo1);
		studente1.setCorsi(List.of(corso1));

		studente2.setProfilo(profilo2);
		studente2.setCorsi(List.of(corso2));

		studente3.setProfilo(profilo3);
		studente3.setCorsi(List.of(corso3));

		studenteRepo.saveAll(List.of(studente1, studente2, studente3));
	}	
}
		
//		Il metodo save() di JpaReopository accetta un solo oggetto oppure una
//		Collection come: List, Set, ecc.
//      
//		1.1 Uno alla volta		
//		categoriaRepo.save(categoria1);
//		categoriaRepo.save(categoria2);
		
//      1.2 Tutti inisieme in una lista saveAll()
//		categoriaRepo.saveAll(List.of(categoria1, categoria2));
	
// Inserimento dei dati test generico
//	@Override
//	public void run(String... args) {
//		studenteRepo.save(new StudenteEntity("Studente A"));
//		docenteRepo.save(new DocenteEntity("Docente B"));
//		categoriaRepo.save(new CategoriaEntity("Categoria C"));
//		corsoRepo.save(new CorsoEntity("Corso D"));
//		profiloRepo.save(new ProfiloEntity("Profilo E"));
//	}

