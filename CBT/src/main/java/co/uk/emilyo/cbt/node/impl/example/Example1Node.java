package co.uk.emilyo.cbt.node.impl.example;

import co.uk.emilyo.cbt.node.Node;

/**
 * Created by Emilio on 08/07/2018.
 */
public class Example1Node extends Node {
    public Object action(Object o) {
        String test = (String) o;
        System.out.println(test);
        return test;
    }
}
