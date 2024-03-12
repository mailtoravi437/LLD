package org.example.TextProcessingStrategy;

public class Main {
    public static void main(String[] args){
        TextProcessor processor = new TextProcessor(new HTMLTextProcessingStrategy());
        processor.process("R");
    }
}
