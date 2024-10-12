package org.example.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    @Before("@annotation(org.example.annotations.AdditionalLogging)")
    public void beforeCalculateSquareAdvice(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("AdditionalLogging annotation: Попытка выполнить метод: " + methodName);
    }

    @AfterReturning("@annotation(org.example.annotations.AdditionalLogging)")
    public void afterReturnCalculateSquareAdvice(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("AdditionalLogging annotation: Успешно возвращен метод: " + methodName);
    }

    @AfterThrowing("@annotation(org.example.annotations.AdditionalLogging)")
    public void afterThrowingCalculateSquareAdvice(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("AdditionalLogging annotation: Возникла ошибка при выполнении метода: " + methodName);
    }

    @After("@annotation(org.example.annotations.AdditionalLogging)")
    public void afterCalculateSquareAdvice(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("AdditionalLogging annotation: " + methodName + " завершил свою работу");
    }

//    @Around("@annotation(org.example.annotations.AdditionalLogging)")
//    public Object aroundCalculateSquareAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
//        String methodName = joinPoint.getSignature().getName();
//        System.out.println("AdditionalLogging annotation: " + methodName +  " начал работу");
//        Object result = joinPoint.proceed();
//        System.out.println("AdditionalLogging annotation: " + methodName + " завершил работу");
//        return result;
//    }

}
