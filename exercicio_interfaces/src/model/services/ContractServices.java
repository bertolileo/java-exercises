package model.services;

import java.util.Calendar;

import model.entities.Contract;
import model.entities.Installment;

public class ContractServices {
	
	private OnlinePaymentService paymentService;
	
	public ContractServices(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, Integer months) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(contract.getDate());
		for (int i = 1; i <= months; i++) {	
			calendar.add(Calendar.MONTH, 1);
			Double interestValue = paymentService.interest(contract.getTotalValue() / months, i);
			contract.addItem(new Installment(calendar.getTime(), paymentService.paymentFee(interestValue)));
		}
	}
}
