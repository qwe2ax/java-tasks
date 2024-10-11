package org.example.aspects;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public int calculateSquare(int))")
    public void beforeCalculateSquareAdvice() {
        System.out.println("beforeCalculateSquareAdvice: Попытка вычислить квадрат числа");
    }

    @AfterReturning("execution(public int calculateSquare(int))")
    public void afterReturnCalculateSquareAdvice() {
        System.out.println("afterReturnCalculateSquareAdvice: Квадрат числа вычислен");
    }

    @AfterThrowing("execution(public int calculateSquare(int))")
    public void afterThrowingCalculateSquareAdvice() {
        System.out.println("afterThrowingCalculateSquareAdvice: Возникла ошибка при вычислении квадрата числа");
    }

    @After("execution(public int calculateSquare(int))")
    public void afterCalculateSquareAdvice() {
        System.out.println("afterCalculateSquareAdvice: Метод calculateSquare завершил свою работу");
    }

    @Around("execution(public int calculateSquare(int))")
    public void aroundCalculateSquareAdvice() {
        System.out.println("aroundCalculateSquareAdvice: qqq");
    }

}
