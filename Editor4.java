import java.awt.Color;
/**
 * Demonstrates the morphing operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and the number of morphing steps (an int). 
 * For example, to morph the cake into grayscaled  in 50 steps, use:
 * java Editor4 cake.ppm 50
 */
class Editor4 {
    public static void main(String[] args) {
        String image1 = args[0];
		int n = Integer.parseInt(args[1]);

		Color[][] sourceImage = Runigram.read(image1);
		Color[][] targetImage = Runigram.grayScaled(sourceImage);
		
        Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
    }
}