package com.company;

import java.io.File;
import java.util.*;

// Her er lidt kode vi legede med i Dat21A den 9 februar 2022...
public class Main
{

    public static void main(String[] args)
    {
        System.out.println("*****************************************************************************");

        File dataFile = new File("data/MobyDick.txt");
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        try
        {
            Scanner scanner = new Scanner(dataFile);
            while(scanner.hasNext())
            {
                String ord = scanner.next();
                 arrayList.add(ord);
            }
        }
        catch (Exception e)
        {
            System.out.println("Shit pomme frit. Det gik galt");
            System.out.println(e);
        }

        hashSet = new HashSet(arrayList);

        System.out.println("Filen indeholder " + arrayList.size() + " antal ord");
        System.out.println("Filen indeholder " + hashSet.size() + " forskellige ord");
        System.out.println("*****************************************************************************");



        //******************************************************************************
        //og nu laver vi noget helt andet................
        ArrayList<Integer> aList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        HashSet<Integer> hSet = new HashSet<>();

        Random randGen = new Random();
        for (int i=0; i<1000; i++)
        {
            aList.add(randGen.nextInt(1000));
            linkedList.add(randGen.nextInt(1000));
            hashSet.add(randGen.nextInt(1000));
        }

        long time1 = System.nanoTime();
        aList.contains(7);
        long time2 = System.nanoTime();
        long delta = time2 - time1;
        System.out.println("Finde noget i ArrayList tager " + delta/1000 + " microsekunder");

        time1 = System.nanoTime();
        linkedList.contains(7);
        time2 = System.nanoTime();
        delta = time2 - time1;
        System.out.println("Finde noget i LinkedList tager " + delta/1000 + " microsekunder");

        time1 = System.nanoTime();
        hashSet.contains(7);
        time2 = System.nanoTime();
        delta = time2 - time1;
        System.out.println("Finde noget i HashSet tager " + delta/1000 + " microsekunder");

        System.out.println("*****************************************************************************");



        //******************************************************************************
        //og nu laver vi noget helt andet................

        ArrayList<Country> arrList = new ArrayList<>();
        arrList.add(new Country("Danmark",12,66,54.76f));
        arrList.add(new Country("Holland",10, 122, 52.33f));
        arrList.add(new Country("Sverige",33, 77, 58.33f));
        arrList.add(new Country("Italy",22, 111, 44.12f));
        arrList.add(new Country("South Africa",44, 33, -34.12f));

        System.out.println("Original liste: " + arrList);
        Collections.sort(arrList);
        System.out.println("Natural sort: " + arrList);
        Collections.sort(arrList, new CompareCountryBNP());
        System.out.println("BNP sort: " + arrList);
        //Collections.sort(arrList, new CompareCountryLatitude());
        //System.out.println("Latitude sort: " + arrList);

    }
}
