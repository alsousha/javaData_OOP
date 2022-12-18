package oop.lec4.contact;

import java.util.Arrays;

public enum Group {
    FRIEND,
    FAMILY,
    WORK,
    OTHER;

    public static Group getEnum(String s){
        for(Group g : Group.values()){
            if(g.name().equals(s)) return g;
        }
        return null;
        //throw new IllegalArgumentException("No Enum specified for this string");
    }
}
