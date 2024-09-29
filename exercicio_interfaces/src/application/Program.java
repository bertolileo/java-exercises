package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractServices;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número: ");
		Integer number = sc.nextInt();
		System.out.print("Data (dd/mm/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Entre com o número de parcelas: ");
		Integer months = sc.nextInt();
		
		Contract contract = new Contract(number, date, totalValue);
		ContractServices service = new ContractServices(new PaypalService());
		service.processContract(contract, months);
		
		System.out.println("Parcelas:");
		System.out.println(contract);
		
		sc.close();
	}

}
