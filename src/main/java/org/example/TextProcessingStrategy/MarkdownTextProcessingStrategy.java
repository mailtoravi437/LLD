package org.example.TextProcessingStrategy;

public class MarkdownTextProcessingStrategy implements TextProcessingStrategy{
    @Override
    public void process(String text) {
        System.out.println("Markdown"+text);
    }
}
