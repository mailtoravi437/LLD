package org.example.TextProcessingStrategy;

public class TextProcessor {
    private TextProcessingStrategy textProcessingStrategy;
    TextProcessor(TextProcessingStrategy textProcessingStrategy){
        this.textProcessingStrategy = textProcessingStrategy;
    }

    public void process(String text){
        textProcessingStrategy.process(text);
    }
}
