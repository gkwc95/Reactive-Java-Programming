package com.rp.sec03;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.Locale;

public class Lec06FluxGenerateAssignment {
    public static void main(String[] args) {
        Flux.generate(synchronousSink -> {
            String country = Util.faker().country().name();
            System.out.println("emitting +" + country);
            synchronousSink.next(country);
            if (country.toLowerCase().equals("canada"))
                synchronousSink.complete();
        }).subscribe(Util.subscriber());
    }
}
