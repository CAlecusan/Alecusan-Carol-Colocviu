package com.parking;

import com.parking.Judet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Judet> judetList = new ArrayList<>();
        String filePath = "C:\\Carol Paradigme\\Alecusan Carol Colocviu\\src\\main\\java\\com\\parking\\judete.txt";
        String fileOutput = "C:\\Carol Paradigme\\Alecusan Carol Colocviu\\src\\main\\java\\com\\parking\\output.txt";
        try(Scanner sc = new Scanner(new File(filePath))) {
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(" ");
                String codiso = data[0];
                String name = data[1];
                String region = data[2];
                Integer nrLoc = Integer.valueOf(data[3]);
                Integer surfaceArea = Integer.valueOf(data[4]);
                judetList.add(new Judet(codiso, name, region, surfaceArea, nrLoc));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        judetList.sort(Comparator.comparing(j-> j.getNrLocuitori()));
        WriteToFile(judetList, fileOutput);



    }
    private static void WriteToFile(List<Judet> judetList,String fileOutput) {
        try(PrintWriter pw = new PrintWriter(fileOutput)){
            for (Judet judet : judetList){
                pw.println(judet.toString());
                System.out.println();
            }
            System.out.println("Successfully wrote List data to " + fileOutput);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private static void WriteInConsole(List<Judet> judetList) {
        for(Judet judet : judetList){
            System.out.println(judet.toString());
        }
    }
    private static void Search(List<Judet> judetList,String search) {
        List<Judet> searchList = new ArrayList<>();
        try(Scanner sc = new Scanner(new File(search))) {
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(" ");
                String codiso = data[0];
                String name = data[1];
                String region = data[2];
                Integer nrLoc = Integer.valueOf(data[3]);
                Integer surfaceArea = Integer.valueOf(data[4]);
                for(Judet judet : judetList){
                    if(judet.getCodIso().equals(codiso) || judet.getNume().equals(name)){
                        searchList.add(judet);
                    }
                }
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
