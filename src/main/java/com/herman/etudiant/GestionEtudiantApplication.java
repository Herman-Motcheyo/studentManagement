package com.herman.etudiant;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.herman.etudiant.Entity.Etudiant;
import com.herman.etudiant.repository.EtudiantRepository;

@SuppressWarnings("unused")
@SpringBootApplication
public class GestionEtudiantApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx =SpringApplication.run(GestionEtudiantApplication.class, args);
	 // SI JE VEUX RECUPERER UN Bean APRES L EXECUTION ALORS JE FAIS getBean
		EtudiantRepository etudiantRepository =  ctx.getBean(EtudiantRepository.class );
		DateFormat df =  new SimpleDateFormat("yyyy-MM-dd");
		etudiantRepository.save(new Etudiant("Ahmed" , df.parse("1888-11-10"), "ahmed@gmail.com" , "p1.jpg" ));
		etudiantRepository.save(new Etudiant("Mohamed" , df.parse("1888-11-10"), "Mohamed@gmail.com" , "p2.jpg" ));

		etudiantRepository.save(new Etudiant("Ibrahim" , df.parse("1888-11-10"), "ibrahim@gmail.com" , "p2.jpg" ));
	/*	Page<Etudiant> etp  = etudiantRepository.findAll(new PageRequest(0,5));
		Page<Etudiant> etp  = etudiantRepository.chercherEtudiant("%M%", new PageRequest(0,5, null));
		etp.forEach(
				e -> System.out.println(e.getNom())
				);
		*/

		
	}

}
