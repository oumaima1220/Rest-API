package mvc.rest.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
/**
* Controlleur REST pour gérer les véhicules.
*/
@RestController
@RequestMapping(value = "/test")

public class Controlleur {
/**
* GET /vehicules
*/
@GetMapping(value = "/vehicules")
public @ResponseBody Vehicule getVehicule() {
// Simuler la recherche d'un Vehicule

	Vehicule vehiculeVM = new Vehicule();

	vehiculeVM.setId((long) 1);

	vehiculeVM.setCodeInterne("AABBCC");

	vehiculeVM.setImmatriculation("112233");

	return vehiculeVM;
}

@RequestMapping(value = "/vehicules/{immatriculation}", method = RequestMethod.GET)
public @ResponseBody Vehicule getVehicule(@PathVariable String immatriculation) {
// Simuler la recherche d'un Vehicule
Vehicule vehiculeVM = new Vehicule();
vehiculeVM.setId(1l);
vehiculeVM.setCodeInterne("AABBCC");
vehiculeVM.setImmatriculation(immatriculation);
return vehiculeVM;
}

@RequestMapping(value = "/vehicules", method = RequestMethod.POST)
@ResponseStatus(HttpStatus.CREATED)
public @ResponseBody Vehicule creerVehicule(@RequestBody Vehicule vehiculeVM) {
System.out.println("# Véhicule créé: " + vehiculeVM.getCodeInterne() + ", " + 
vehiculeVM.getImmatriculation());
return vehiculeVM;
}
}