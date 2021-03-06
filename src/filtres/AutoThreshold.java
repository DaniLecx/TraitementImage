/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtres;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author DaniLecx
 */
public class AutoThreshold {
//otsu method
    public static int getThreshold(BufferedImage srcImg) {
        
        byte[] srcData = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write( srcImg, "jpg", baos );
            baos.flush();
            srcData = baos.toByteArray();
            baos.close();
        } catch (IOException ex) {
            Logger.getLogger(AutoThreshold.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        
        int ptr, maxLevelValue, threshold;
        int histData[] = new int[256];

        // Clear histogram data
        // Set all values to zero
        ptr = 0;
        while (ptr < histData.length) {
            histData[ptr++] = 0;
        }

        // Calculate histogram and find the level with the max value
        ptr = 0;
        maxLevelValue = 0;
        while (ptr < srcData.length) {
            int h = 0xFF & srcData[ptr];
            histData[h]++;
            if (histData[h] > maxLevelValue) {
                maxLevelValue = histData[h];
            }
            ptr++;
        }

        // Total number of pixels
        int total = srcData.length;

        float sum = 0;
        for (int t = 0; t < 256; t++) {
            sum += t * histData[t];
        }

        float sumB = 0;
        int wB = 0;
        int wF = 0;

        float varMax = 0;
        threshold = 0;

        for (int t = 0; t < 256; t++) {
            wB += histData[t];	// Weight Background
            if (wB == 0) {
                continue;
            }

            wF = total - wB;		// Weight Foreground
            if (wF == 0) {
                break;
            }

            sumB += (float) (t * histData[t]);

            float mB = sumB / wB;		// Mean Background
            float mF = (sum - sumB) / wF;	// Mean Foreground

            // Calculate Between Class Variance
            float varBetween = (float) wB * (float) wF * (mB - mF) * (mB - mF);

            // Check if new maximum found
            if (varBetween > varMax) {
                varMax = varBetween;
                threshold = t;
            }
        }

        return threshold;
    }
}
