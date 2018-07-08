package co.uk.emilyo.cbt.node.impl.example;

import co.uk.emilyo.cbt.node.Node;

/**
 * Created by Emilio on 08/07/2018.
 */
public class Example2Node extends Node {
    public Object action(Object o) {
        String s = (String) o;
        Integer i = 1;
        Integer j = 0;
        if("ciao".equals(s)) return i;
        else return j;
    }
}
