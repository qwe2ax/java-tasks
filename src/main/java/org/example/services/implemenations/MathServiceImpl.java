package org.example.services.implemenations;

import org.example.annotations.AdditionalLogging;
import org.example.services.interfaces.MathService;
import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

    @AdditionalLogging
    @Override
    public int calculateSquare(int num) {
        if (num == 3) {
            throw new IllegalArgumentException("3 is not allowed");
        }
        return num * num;
    }
}
