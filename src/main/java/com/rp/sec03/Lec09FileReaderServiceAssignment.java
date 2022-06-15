package com.rp.sec03;

import com.rp.courseutil.Util;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Lec09FileReaderServiceAssignment {
    public static void main(String[] args) {
        FileReaderService readerService = new FileReaderService();

        Path path = Paths.get("src/main/resources/assignment/sec01/file01.txt");
        readerService.read(path).subscribe(Util.subscriber());
    }
}
