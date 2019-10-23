/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtres;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Eliott
 */
public class PrewittFilter {
    
    public static BufferedImage PrewittImage(BufferedImage ImgIn)
    {
        BufferedImage b = new BufferedImage(ImgIn.getWidth(), ImgIn.getHeight(), ImgIn.getType());
        Graphics g = b.getGraphics();
        g.drawImage(ImgIn, 0, 0, null);
        g.dispose();
        BufferedImage ImgOut = b;
        int p[] = new int[9]; 
        int res = 0;
        int res2 = 0;
        int x, y;

        for(x = 1; x < ImgIn.getWidth()-1;x++)
        {
            for(y = 1; y < ImgIn.getHeight()-1 ; y++)
            {
                p[0] = ImgIn.getRGB(x - 1, y - 1);
                p[1] = ImgIn.getRGB(x, y - 1);
                p[2] = ImgIn.getRGB(x + 1, y - 1);
                p[3] = ImgIn.getRGB(x - 1, y);
                p[4] = ImgIn.getRGB(x , y); 
                p[5] = ImgIn.getRGB(x + 1, y);
                p[6] = ImgIn.getRGB(x - 1, y + 1);
                p[7] = ImgIn.getRGB(x , y + 1);
                p[8] = ImgIn.getRGB(x + 1, y + 1);
  
                for(int k = 0 ; k < p.length ; k++)
                {
                    p[k] = p[k]&0xff;
                }
                
                res = -p[0] + p[2] - p[3] + p[5] - p[6] + p[8];
                res /= 3;
                if(res < 0)
                    res = 0;
                
                res = (res<<24) | (res<<16) | (res<<8) | res; 
                
                res2 = -p[0] + p[6] - p[1] + p[7] - p[2] + p[8];
                res2 /= 3;
                
                if(res2 < 0)
                    res2 = 0;
                
                res = (res<<24) | (res<<16) | (res<<8) | res;
                res2 = (res2<<24) | (res2<<16) | (res2<<8) | res2;
                res = res | res2;
                
                ImgOut.setRGB(x, y, res); 
            }
        }
        
        return ImgOut;
    }
    
}
