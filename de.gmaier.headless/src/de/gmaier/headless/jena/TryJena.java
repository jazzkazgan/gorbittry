package de.gmaier.headless.jena;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.VCARD;

public class TryJena {
	
	public static void run(){
		
		// some definitions
		String personURI    = "http://somewhere/JohnSmith";
		String fullName     = "John Smith";

		// create an empty Model
		Model model = ModelFactory.createDefaultModel();

		// create the resource
		Resource johnSmith = model.createResource(personURI);

		// add the property
		 johnSmith.addProperty(VCARD.FN, fullName);
		 
		 model.write(System.out);
		
	}

}
