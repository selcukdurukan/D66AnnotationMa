package com.ba.boost;

import java.lang.annotation.Annotation;

@KnowledgeRuntime(knowledge = "Main", author = "Durukan", date = "30/11/2022")
public class Main {
    public static void main(String[] args) {

        Class<?> c;
        try{
            c = Class.forName("com.ba.boost.Main");
            Annotation[] ann = c.getDeclaredAnnotations();
            for (Annotation a: ann) {
                Class<?> annType = a.annotationType();
                System.out.println("Annotation type: " +annType);
                System.out.println(a.toString());
            }

            KnowledgeRuntime infoAnn = c.getAnnotation(KnowledgeRuntime.class);
            System.out.println("Knowledge: " + infoAnn.knowledge());
            System.out.println("Date: " +infoAnn.date());
            System.out.println("Author: " + infoAnn.author());

        } catch (Exception e) {
            
        }

    }
}