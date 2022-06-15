package com.rp.sec04;

import com.rp.courseutil.Util;
import com.rp.sec04.helper.OrderService;
import com.rp.sec04.helper.UserService;
import reactor.core.publisher.Flux;

public class Lec12FlatMap {
    public static void main(String[] args) {

        /*UserService.getUsers()
                .concatMap(user-> OrderService.getOrders(user.getUserId()))
                .subscribe(Util.subscriber());

        Util.sleepSeconds(60);*/
        Flux<Integer> range =Flux.range(1,10);
        range.map(i->i*10).subscribe(System.out::println);
    }
}
