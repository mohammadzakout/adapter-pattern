public class test {
    public static void main(String[] args) {

        JpegImage jpegImage = new JpegImage(); 
        IOSPreviewer iosPreviewer = new IOSPreviewer(); 
        iosPreviewer.viewImage(jpegImage);
        PngImage pngImage = new PngImage();
JpegImage jpegImage2 = new PNGToJPEGConverter(pngImage).converter() ;
        iosPreviewer.viewImage(jpegImage2);

    }
}
