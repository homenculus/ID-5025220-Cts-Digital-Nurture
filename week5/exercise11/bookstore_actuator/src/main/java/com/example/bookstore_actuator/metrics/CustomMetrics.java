package com.example.bookstore_actuator.metrics;

import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.MeterBinder;

@Component
public class CustomMetrics implements MeterBinder {

    @Override
    public void bindTo(MeterRegistry meterRegistry) {
        meterRegistry.gauge("custom.book.count", this, CustomMetrics::getCustomMetric);
    }

    private double getCustomMetric() {
        // Custom logic to return a metric value
        return 100.0; // Example value
    }
}
