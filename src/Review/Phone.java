package Review;

public class Phone {
}
class CameraPhone extends Phone{
    int imageSize;
    int memorySize;

    public CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }
    public int numPictures(){
       return (memorySize*100)/imageSize;
    }
}