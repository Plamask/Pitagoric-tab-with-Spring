package it.giuseppe.spring.TavolaPitagorica;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TavolaPitagoricaController {
	
	private String message = "Di seguito i valori di una tabella pitagorica da 0 a 10:";
	int risultato = 0;

	
   @RequestMapping("/")
	public String welcome(Map<String, Object> model, ArrayList<Integer> numeri) {
	   for(int i = 0; i<=10; i++) {
		   
		   for(int j = 0; j<=10; j++) {
			   
			  risultato = i*j; 
			   numeri.add(risultato);
			   
		   }
		   
		   
	   }
	   
	   
	   model.put("tab", numeri);
		model.put("message", this.message);
		
		return "Tavola";
	}
}

