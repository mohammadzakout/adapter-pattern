
interface  JPEGImageConverter {

    JpegImage converter();
    
}


class PNGToJPEGConverter implements JPEGImageConverter{

PngImage image ; 


public PNGToJPEGConverter (PngImage image ){

this.image = image ; 


}

    @Override
    public JpegImage converter() {
// convert process 

        return new JpegImage();
    }

}