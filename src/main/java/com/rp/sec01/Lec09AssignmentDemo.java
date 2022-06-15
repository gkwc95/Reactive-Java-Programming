package com.rp.sec01;

import com.rp.assignment.FileService;
import com.rp.courseutil.Util;

public class Lec09AssignmentDemo {
    public static void main(String[] args) {
        FileService.read("file01.txt").subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete());
    }
}
