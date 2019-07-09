package microservices.book.multiplication.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import microservices.book.multiplication.domain.Multiplication;


import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiplicationServiceTest {
     @MockBean
     RandomGeneratorService randomGeneratorService;
     
     @Autowired
     MultiplicationService multiplicationService;
     
     @Test
     public void createRandomMultipicationTest() {
    	 // you need to do static import for given from BDDMockito
    	 given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);
    	 
    	 Multiplication multiplication = multiplicationService.createRandomMultipication();
    	 
    	 assertThat(multiplication.getFactorA()).isEqualTo(50);
    	 assertThat(multiplication.getFactorB()).isEqualTo(30);
    	 assertThat(multiplication.getResult()).isEqualTo(1500);
    	 
     }
}
