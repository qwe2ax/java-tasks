package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.services.interfaces.MathService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MathController {
    private final MathService mathService;

    public int getSquare(int num) {
        return mathService.calculateSquare(num);
    }
}
