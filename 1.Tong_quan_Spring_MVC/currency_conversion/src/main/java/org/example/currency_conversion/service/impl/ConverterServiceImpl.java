package org.example.currency_conversion.service.impl;

import org.example.currency_conversion.service.ConverterService;

public class ConverterServiceImpl implements ConverterService {
    @Override
    public double convert(double usd, double rate) {
        return usd * rate;
    }
}
