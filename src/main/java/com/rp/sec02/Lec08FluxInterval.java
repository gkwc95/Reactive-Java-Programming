package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class Lec08FluxInterval {
    public static void main(String[] args) {
        Flux.interval(Duration.ofMillis(100)).take(10)
                .subscribe(Util.onNext());
        Util.sleepSeconds(5);
    }
}
