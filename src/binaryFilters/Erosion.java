/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryFilters;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author DaniLecx
 */
public class Erosion {

    public static BufferedImage getImage(BufferedImage srcImg) {

        BufferedImage tmp = new BufferedImage(srcImg.getWidth(), srcImg.getHeight(), BufferedImage.TYPE_INT_RGB);
        
        Color[] pixel = new Color[9];
        int width = srcImg.getWidth();
        int height = srcImg.getHeight();
        Color min;

        for (int i = 1; i < width - 1; i++) {
            for (int j = 1; j < height - 1; j++) {
                min = new Color(255,255,255);
                // Get smallest value (darker)
                pixel[0] = new Color(srcImg.getRGB(i - 1, j - 1));
                pixel[1] = new Color(srcImg.getRGB(i - 1, j));
                pixel[2] = new Color(srcImg.getRGB(i - 1, j + 1));
                pixel[3] = new Color(srcImg.getRGB(i, j + 1));
                pixel[4] = new Color(srcImg.getRGB(i + 1, j + 1));
                pixel[5] = new Color(srcImg.getRGB(i + 1, j));
                pixel[6] = new Color(srcImg.getRGB(i + 1, j - 1));
                pixel[7] = new Color(srcImg.getRGB(i, j - 1));
                pixel[8] = new Color(srcImg.getRGB(i, j));
                for (int k = 0; k < 9; k++) {
                    if(pixel[k].getBlue() < min.getBlue())
                        min = pixel[k];
                }
                
                tmp.setRGB(i, j, min.getRGB());
            }
        }

        return tmp;
    }
}
