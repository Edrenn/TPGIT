package core;

import core.Entities.Droits;
import core.Entities.User;
import java.util.ArrayList;
import core.JsonManager;
import core.Configuration;

public class Main {


	public static void main (String arg[]) {
		
		
		Droits write = new Droits(1, 1, "write", "Orange");
		Droits read = new Droits(1, 0, "read", "Orange");
		Droits move = new Droits(1, 1, "move", "Orange");
		
		ArrayList<Droits> totoDroit = new ArrayList();
		totoDroit.add(write);
		totoDroit.add(read);
		
		ArrayList<Droits> tataDroit = new ArrayList();
		tataDroit.add(read);
		tataDroit.add(move);
		
		User toto = new User("Toto", "Jean", "totoJ", "jeanT", totoDroit);
		User tata = new User("Tata", "Camille", "tataC", "CamilleT", tataDroit);

		Configuration configuration = new Configuration();
		JsonManager jsonManager = JsonManager.getInstance();
		//ArrayList<String> result = jsonManager.readFromFile("conf.prog", "../../", Class<T>);
		
	}



}