package com.rp.sec01;

import com.rp.courseutil.Util;

import java.util.concurrent.CompletableFuture;

public class Lec07MonoFromFuture {
    public static void main(String[] args) {

    }
    private static CompletableFuture<String> getName(){
        return CompletableFuture.supplyAsync(()-> Util.faker().name().fullName());
    }
}
