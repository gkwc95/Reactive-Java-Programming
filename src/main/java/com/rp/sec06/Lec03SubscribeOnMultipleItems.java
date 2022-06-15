package com.rp.sec06;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class Lec03SubscribeOnMultipleItems {
    public static void main(String[] args) {
        Flux<Object> flux= Flux.create(fluxSink->{
            for(int i = 0; i < 20;i++){
                fluxSink.next(i);
            }
            fluxSink.complete();
        }).doOnNext(i->printThreadName("Next "+i));

        flux
                .subscribeOn(Schedulers.boundedElastic())
                .subscribe(v->printThreadName("sub" +v));

        Util.sleepSeconds(5);
    }



    private static void printThreadName(String msg){
        System.out.println(msg + "\t\t: Thread : " + Thread.currentThread().getName());
    }
}
