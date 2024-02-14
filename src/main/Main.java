package main;

import marvel.Marvel;
import thor.Thor;

public class Main {
    public static void main(String[] args) {
        Marvel thor = new Thor();    //The output will be same ,
        thor.displayInfo();          //if we put class name thor because of overriding!

    }
}
