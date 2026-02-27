package uk.ac.richmond;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main3 {
    public static void main(String[] args) {
        List<String> names = List.of("Jack", "Ed", "suzan", "Pat", "Sam", "Stuart", "Ed");

        //Function
        /*
        names.stream()
                .filter(name -> name.substring(0, 1).equalsIgnoreCase("S"))
                .toList()
                .forEach(System.out::println);

        names.stream()
                .filter(name -> name.equalsIgnoreCase("jack"))
                .findFirst()
                .ifPresent(name -> System.out.println(name));
        */



        /*
        names.stream()
                .filter(name -> name.length() > 3)
                .toList()
                .forEach(name -> System.out.println("The name is: "+ name));
        */


        names.stream()
                .map(name -> name + "-" + name.length())
                .toList()
                .forEach(mod_name -> System.out.println(mod_name));



    }
}