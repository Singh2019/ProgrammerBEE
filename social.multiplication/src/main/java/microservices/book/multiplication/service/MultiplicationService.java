package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;

/**
 * This service generates our domian Multi
 * 
 * */
public interface MultiplicationService {
     Multiplication createRandomMultipication();
}
