package com.ayush;
import java.util.HashMap;
import java.util.Map;

public class MapProgramming {
    public static void main(String[] args) {

        Map<String, String> language = new HashMap<>();
        language.put("Java", "a compiled high level, object-oriented, platform independent language");
        language.put("Python", "an interpreted, object oriented, high-level programming language with dynamic semantics");
        language.put("Algol", "an algorithmic language");
        language.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        System.out.println(language.put("Lisp", "Therein lies madness"));
        if(language.containsKey("Java")){
            System.out.println("Java is already in map");
        }else{
            language.put("Java", "this course is about java");
        }
        System.out.println(language.get("Java"));
        System.out.println("===============================================================================");
        //language.remove("Lisp");
        if(language.remove("Algol","a family of algorithmic language.")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algo not removed, key/value pair not found.");
        }
        System.out.println(language.replace("Lisp","a functional programming with imperative features"));
        if(language.replace("Lisp","Therein lies madness","a functional programming language with imperative features")){
            System.out.println("Lisp replaced.");
        }else{
            System.out.println("Lisp is not replace, old value does not matched.");
        }
        System.out.println(language.replace("Scala","this will not we added"));
        for(String key:language.keySet()){
            System.out.println(key+":"+language.get(key));
        }
    }
}
