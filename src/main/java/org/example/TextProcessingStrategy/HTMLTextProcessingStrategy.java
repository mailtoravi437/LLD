package org.example.TextProcessingStrategy;

public class HTMLTextProcessingStrategy implements TextProcessingStrategy{
    @Override
    public void process(String text) {
        System.out.println("HTML text processing"+text);
    }
}
