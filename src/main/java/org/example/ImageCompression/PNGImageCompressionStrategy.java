package org.example.ImageCompression;

public class PNGImageCompressionStrategy implements ImageCompressionStrategy{

    @Override
    public void compress(String fileName){
        System.out.println("Compressing PNG" + fileName);
    }

}
