import java.util.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

// C:\Users\Dummy\IdeaProjects\ImageEditor\src\image.jpg
// C:\Users\Dummy\OneDrive\Desktop\\uymmy\Output\image.jpg

public class Image_Editor {



    // Convert to GrayScale

    public static BufferedImage ToGrayScale(BufferedImage inputImage, int width, int height)
    {


        //  Setting Image type to Gray
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY );

        // Setting pixel values
        for (int i=0; i<height; i++)
            for(int j=0; j<width; j++)
                outputImage.setRGB(j, i, inputImage.getRGB(j,i));

        return outputImage;

    }


    // Function calculating pixel values for brightness and clipping them between (0-255)
    private static Color getColor(int val, Color pixel) {
        int red = pixel.getRed();
        int blue = pixel.getBlue();
        int green = pixel.getGreen();

        //  Adjust the brightness by multiplying the pixel value by brightness factor
        red += (int) (0.01* val *red);
        blue += (int) (0.01* val *blue);
        green += (int) (0.01* val *green);

        //  Clip the result to ensure it stays within the valid pixel value range (0-255)
        if(red>255) red = 255;
        if(blue>255) blue=255;
        if(green>255) green=255;
        if(red<0) red = 0;
        if(blue<0) blue=0;
        if(green<0) green=0;

        return new Color(red, green, blue);
    }



    // Changing brightness
    public static BufferedImage Brightness(BufferedImage inputImage, int width, int height, int val)
    {

        BufferedImage outputImage = new BufferedImage(width, height,BufferedImage.TYPE_3BYTE_BGR);

        for(int i=0; i<height; i++)
            for(int j=0; j<width; j++)
            {
                //  Get RGB values of input image for each pixel
                Color pixel = new Color(inputImage.getRGB(j, i));

                //  Create a new pixel in the output image with the adjusted value
                Color newPixel = getColor(val, pixel);
                outputImage.setRGB(j, i, newPixel.getRGB());
            }

        return outputImage;
    }




    // Horizontal Flip
    public static BufferedImage Horizontal_Flip(BufferedImage inputImage, int width, int height)
    {

        BufferedImage outputImage = new BufferedImage(width,height, BufferedImage.TYPE_3BYTE_BGR);


        for(int i=0; i<height; i++)
            for(int j=0; j<width; j++)

                //Copy the pixel value from the input image to the corresponding position in the new image horizontally
                outputImage.setRGB(j, i, inputImage.getRGB(j, height-1-i));

        return outputImage;
    }



    // Vertical Flip
    public static BufferedImage Vertical_Flip(BufferedImage inputImage, int width, int height)
    {
        // Create a new pixel in the output image with the adjusted value
        BufferedImage outputImage = new BufferedImage(width,height, BufferedImage.TYPE_3BYTE_BGR);

        for(int i=0; i<height; i++)
            for(int j=0; j<width; j++)
                //Copy the pixel value from the input image to the corresponding position in the new image vertically
                outputImage.setRGB(j, i, inputImage.getRGB(width-1-j, i));

        return outputImage;
    }


    // Clockwise rotation
    public static BufferedImage Rotate_Clockwise(BufferedImage inputImage, int width, int height)
    {
        BufferedImage outputImage = new BufferedImage(height, width, BufferedImage.TYPE_3BYTE_BGR);

        for(int i=0; i<height; i++)
            for(int j=0; j<width; j++)
            {
                //Calculate the corresponding position in the original image based on the rotation angle.
                //Set the pixel value in the rotated image.
                outputImage.setRGB(height-1-i, j, inputImage.getRGB(j,i));
            }
        return outputImage;
    }


    //AntiClockwise rotation
    public static BufferedImage Rotate_AntiClockwise(BufferedImage inputImage, int width, int height)
    {

        BufferedImage outputImage = new BufferedImage(height, width, BufferedImage.TYPE_3BYTE_BGR);

        for(int i=0; i<height; i++)
            for(int j=0; j<width; j++)
            {
                //Calculate the corresponding position in the original image based on the rotation angle.
                //Set the pixel value in the rotated image.
                outputImage.setRGB(i, width-1-j, inputImage.getRGB(j,i));
            }
        return outputImage;
    }

    // Gaussian Blur
    public static BufferedImage gaussianBlur(BufferedImage img, int width, int height, int radius) {
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Iterate through each pixel in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int sumR = 0, sumG = 0, sumB = 0, totalPixs = 0;

                /* Iterate through the pixels within the specified radius around the current pixel */
                for (int dy = -radius; dy <= radius; dy++) {
                    for (int dx = -radius; dx <= radius; dx++) {
                        int newX = Math.min(Math.max(x + dx, 0), width - 1);
                        int newY = Math.min(Math.max(y + dy, 0), height - 1);

                        // Get the sum of RGB values of the pixel within the radius
                        Color pixel = new Color(img.getRGB(newX, newY));
                        sumR += pixel.getRed();
                        sumG += pixel.getGreen();
                        sumB += pixel.getBlue();
                        totalPixs++;
                    }
                }

                // Compute the weighted average of neighboring pixels using the Gaussian kernel
                Color blurredPixel = new Color(sumR / totalPixs, sumG / totalPixs, sumB / totalPixs);

                // Set the pixel value in the output image to the computed average.
                outputImage.setRGB(x, y, blurredPixel.getRGB());
            }
        }
        return outputImage;
    }

    // Negative Image
    public static BufferedImage negativeImage(BufferedImage inputImage, int width, int height)
    {
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);

        for(int i=0; i<height; i++)
        {
            for(int j=0; j<width; j++)
            {
                // Extract the Red, Green, and Blue color channels
                Color pixel =  new Color(inputImage.getRGB(j,i));

                // Calculate the complement (255 - channel value) of each color channel
                Color newPixel = new Color(255-pixel.getRed(),
                                           255-pixel.getGreen(),
                                           255-pixel.getBlue());

                // Create a new pixel in the negative image with the inverted color channels
                outputImage.setRGB(j, i, newPixel.getRGB());
            }
        }
        return outputImage;
    }




        public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Welcome\nInput your file name: ");

        String input_filename = sc.next();

        //  Making file object
        File inputFile = new File( input_filename );

        try {
            // Input image object
            BufferedImage inputImage = ImageIO.read(inputFile);

            while(true) {
                // Get the dimensions of the image
                int width = inputImage.getWidth();
                int height = inputImage.getHeight();

                // Show the Menu to the user
                System.out.println("SELECT ANY OF THE FOLLOWING OPERATIONS\n"+
                        "1. Convert to GrayScale\n"+
                        "2. Change Brightness\n"+
                        "3. Horizontal Flip\n"+
                        "4. Vertical Flip\n"+
                        "5. Rotate Clockwise\n"+
                        "6. Rotate Anti-Clockwise\n"+
                        "7. Gaussian Blur\n"+
                        "8. Negative Filter");

                int operation = sc.nextInt();

                // Declaring output image object
                BufferedImage outputImage;

                // Perform the task chosen by user
                switch (operation) {

                    case 1:
                     outputImage = ToGrayScale(inputImage, width, height);
                     break;
                    case 2:
                     {
                        System.out.print("Enter the brightness change factor in percentage, enter negative value for darker img: ");
                        //                    int val = sc.nextInt();
                        outputImage = Brightness(inputImage, width, height, sc.nextInt());
                    }
                    break;

                    case 3:
                    outputImage = Horizontal_Flip(inputImage, width, height);
                    break;

                    case 4: outputImage = Vertical_Flip(inputImage, width, height);
                    break;

                    case 5: outputImage = Rotate_Clockwise(inputImage, width, height);
                    break;
                    case 6: outputImage = Rotate_AntiClockwise(inputImage, width, height);
                    break;
                    case 7:
                    {
                        System.out.print("Enter the strength on BLur: ");
                        outputImage = gaussianBlur(inputImage, width, height, sc.nextInt());
                    }
                    break;

                    case 8: outputImage = negativeImage(inputImage, width, height);
                    break;
                    default:
                     {
                        System.out.println("Invalid input");
                        return;
                    }

                }

                // Ask the user to exit or keep perform tasks
                System.out.print("DO YOU WANT TO PERFORM ANY OTHER OPERATIONS?\nY/N: ");
                char task = Character.toLowerCase(sc.next().charAt(0));
                if (task == 'y') {
                    inputImage = outputImage;
                    continue;
                }


                System.out.println("Enter output path for your file with filename.extension: ");
                File outputFile = new File(sc.next());

                ImageIO.write(outputImage, "jpg", outputFile);
                break;
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}