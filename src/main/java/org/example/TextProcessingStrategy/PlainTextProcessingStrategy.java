package org.example.TextProcessingStrategy;

public class PlainTextProcessingStrategy implements TextProcessingStrategy{
    @Override
    public void process(String text){
        System.out.println("Processing plain text: " + text);
    }
}
