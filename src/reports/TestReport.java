package reports;

import java.util.ArrayList;
import java.util.List;

import program.ClientRel;
import model.Client;

public class TestReport {
	public static void main(String[] args)
	{
		try{
			List<Client> clients = new ArrayList<Client>();
			
			Client c1 = new Client();
			c1.setNome("GPTW Brasil");
			c1.setEndereco("Rua Francisco Leitão, 72");
			c1.setComplemento("");
			c1.setTelefone("3922-7777");
			c1.setUf("SP");
			
			Client c2 = new Client();
			c2.setNome("Etec Zona Leste");
			c2.setEndereco("Avenida Aguia de Haia, 2166 ");
			c2.setComplemento("");
			c2.setTelefone("3002-3004");
			c2.setUf("SP");
			
			Client c3 = new Client();
			c3.setNome("Saga");
			c3.setEndereco("Rua Antunes, 2022");
			c3.setComplemento("A");
			c3.setTelefone("2526-2524");
			c3.setUf("SP");
			
			
			clients.add(c1);
			clients.add(c2);
			clients.add(c3);
			
			
			ClientRel reports = new ClientRel();
			reports.imprimir(clients);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
