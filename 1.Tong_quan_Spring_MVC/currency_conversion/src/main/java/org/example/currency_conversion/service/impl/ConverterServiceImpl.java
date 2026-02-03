package org.example.currency_conversion.service.impl;

import org.example.currency_conversion.service.ConverterServiceInterface;

public class ConverterServiceImpl implements ConverterServiceInterface {
    @Override
    public double convert(double usd, double rate) {
        return usd * rate;
    }
}
