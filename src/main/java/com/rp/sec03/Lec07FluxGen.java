package com.rp.sec03;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec07FluxGen {
    public static void main(String[] args) {
        Flux.generate(
                ()->1,
                (count, sink)->{
                    String country = Util.faker().country().name();
                    sink.next(country);
                    if (count >= 10 || country.toLowerCase().equals("canada")){
                        sink.complete();
                    }
                    return count+1;
                }
        ).subscribe(Util.subscriber());
    }
}
