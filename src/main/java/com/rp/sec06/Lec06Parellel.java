package com.rp.sec06;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.util.ArrayList;
import java.util.List;

public class Lec06Parellel {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Flux.range(1,10)
                .parallel()
                .runOn(Schedulers.parallel())
                .subscribe(v->list.add(v));

        Util.sleepSeconds(5);
        System.out.println(list.size());
    }



    private static void printThreadName(String msg){
        System.out.println(msg + "\t\t: Thread : " + Thread.currentThread().getName());
    }
}
