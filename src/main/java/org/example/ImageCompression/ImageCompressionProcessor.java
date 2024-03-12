package org.example.ImageCompression;

import java.awt.*;

public class ImageCompressionProcessor {

     private ImageCompressionStrategy imageCompressionStrategy;

    public void setImageCompressionStrategy(ImageCompressionStrategy imageCompressionStrategy) {
        this.imageCompressionStrategy = imageCompressionStrategy;
    }

    public void compress(String filename){
        imageCompressionStrategy.compress(filename);
    }
}
