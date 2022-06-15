package com.rp.sec04;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec02HandleAssignment {
    public static void main(String[] args) {
        Flux.generate(synchronousSink -> {
            String country = Util.faker().country().name();
            synchronousSink.next(country);
        }).map(Object::toString).handle((country, synchronousSink)->{
            synchronousSink.next(country);
            if (country.toLowerCase().equals("canada")){
                synchronousSink.complete();
            }
        }).subscribe(Util.subscriber());
    }
}
