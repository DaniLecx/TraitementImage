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
public class BelgianFilter {
    
    public static BufferedImage getImage(BufferedImage ImgIn, int Sigma)
    {
        BufferedImage b = new BufferedImage(ImgIn.getWidth(), ImgIn.getHeight(), ImgIn.getType());
        Graphics g = b.getGraphics();
        g.drawImage(ImgIn, 0, 0, null);
        g.dispose();
        BufferedImage ImgOut = b;
        int tempSigma = (int) (((3 * Sigma)-0.01)+1);
        int tailleMatrice = ((2*tempSigma) + 1);
        double p[] = new double[tailleMatrice*tailleMatrice];
        double matCoef[] = new double[tailleMatrice*tailleMatrice];
        double matReel[] = new double[tailleMatrice*tailleMatrice];
        int x, y, ligne, col, pos;
        double totalCoef, valeurFin;
        
        System.out.println("Sigma = " + Sigma);
        System.out.println("tempSigma = " + tempSigma);
        System.out.println("tailleMatrice = " + tailleMatrice);
        System.out.println("tailleMatrice² = " + (tailleMatrice*tailleMatrice));
        
        for(x = tempSigma; x < ImgIn.getWidth()-tempSigma; x++)
        {
            for(y = tempSigma; y < ImgIn.getHeight()-tempSigma; y++)
            {
                totalCoef = 0;
                valeurFin = 0;
                for(col = 0-tempSigma; col <= tempSigma; col++)
                {
                    for(ligne = 0-tempSigma; ligne <= tempSigma; ligne++)
                    {
                        pos = col+tempSigma+((ligne+tempSigma)*tailleMatrice);
                        matCoef[pos] = (1/((2*Sigma*Sigma)*Math.PI))*Math.exp(((-col*col)+(ligne*ligne))/(2*Sigma*Sigma));
                        totalCoef += matCoef[pos];
                    } 
                }
                
                for(col = 0-tempSigma; col <= tempSigma; col++)
                {
                    for(ligne = 0-tempSigma; ligne <= tempSigma; ligne++)
                    {
                        pos = col+tempSigma+((ligne+tempSigma)*tailleMatrice);
                        p[pos] = ImgIn.getRGB(x+col, y+ligne)&0xff; 
                        matReel[pos] = matCoef[pos] / totalCoef;
                        valeurFin += p[pos] * matReel[pos];
                    }  
                }
                
                p[tailleMatrice] = ((int)valeurFin<<24) | ((int)valeurFin<<16) | ((int)valeurFin<<8) | (int)valeurFin; 
                ImgOut.setRGB(x, y, (int)p[tailleMatrice]);
            }
        }
        
        return ImgOut;
    }
}
