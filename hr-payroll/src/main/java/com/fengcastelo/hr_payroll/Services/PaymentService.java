package com.fengcastelo.hr_payroll.Services;

import org.springframework.stereotype.Service;

import com.fengcastelo.hr_payroll.Entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
