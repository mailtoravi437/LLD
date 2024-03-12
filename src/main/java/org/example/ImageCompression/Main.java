package org.example.ImageCompression;

public class Main {
    public static void main(String[] args){
        ImageCompressionProcessor processor = new ImageCompressionProcessor();
        processor.setImageCompressionStrategy(new PNGImageCompressionStrategy());
        processor.compress("Ravi");

    }
}
