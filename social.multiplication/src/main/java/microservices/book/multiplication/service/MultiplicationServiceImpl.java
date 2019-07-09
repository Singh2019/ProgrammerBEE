package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;

public class MultiplicationServiceImpl implements MultiplicationService{
	
	private RandomGeneratorService  randomGeneratorService;

	public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
		super();
		this.randomGeneratorService = randomGeneratorService;
	}



	@Override
	public Multiplication createRandomMultipication() {
		
		int factorA = randomGeneratorService.generateRandomFactor();
		int factorB = randomGeneratorService.generateRandomFactor();
		
		return new Multiplication(factorA, factorB);
		
		
	}

}
