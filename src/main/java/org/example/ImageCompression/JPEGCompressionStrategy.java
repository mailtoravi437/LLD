package org.example.ImageCompression;

public class JPEGCompressionStrategy implements ImageCompressionStrategy{
    @Override
    public void compress(String filename) {
        System.out.println("JPEG Compression"+filename);
    }
}
