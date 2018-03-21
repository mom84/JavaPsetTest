package at.refugeescode.JavaPsetTest.pset1.parser;//package oop.pset1.parser;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public abstract class Parser {
//
//    public List<Object> asList(String filepath){
//        try {
//            return Files.lines(Paths.get(filepath))
//                    .skip(1)
//                    .map(line -> line.split(";"))
//                    .map(toObject())
//                    .collect(Collectors.toList());
//        } catch (IOException e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
//    }
//
//    protected abstract Function<String[], Object> toObject();
//
//}
