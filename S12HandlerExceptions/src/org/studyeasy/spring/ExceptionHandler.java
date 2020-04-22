package org.studyeasy.spring;

import org.springframework.web.bind.annotation.ControllerAdvice;


@ControllerAdvice
public class ExceptionHandler {
//On utilise @ExceptionHandler pour gerer l'exception d'un controller en particulier
	//HandlerExceptionResolver pour tt exception de l'appli, le corps nul
	//@ControllerAdvice pour tt exception de l'appli en controlant le corps et le code d'état
	
	
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class) 
	public String exceptionHandler(Exception ex) { //recupere les exception est go view error
		return "error";
	}
	
	
}
