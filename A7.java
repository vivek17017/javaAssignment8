package assignments;

public class A7 {
    public void driver(){

    }
}



class Complex{
    private int real,imag;
    public void setComplexNumber(int r,int i)
    {
        real=r;
        imag=i;
    }
    void printValues()
    {
        System.out.println("real="+real+" imaginary="+imag);
    }
}
class Time{
    int hr,min,sec;
    void setTime(int h,int m,int s)
    {
        hr=h;
        min=m;
        sec=s;
    }
    void showTime()
    {
        System.out.println(hr+" hr "+min+" min "+sec+" sec");
    }
}
class Cuboid{
    int length,breadth,height;
    void setLength(int l){
        length=l;
    }
    void setBreadth(int b){
        breadth=b;
    }
    void setHeight(int h){
        height=h;
    }
    int getLength(){
        return length;
    }
    int getBreadth(){
        return breadth;
    }
    int getHeight(){
        return height;
    }
    int calculateVolume(){
        return (length*breadth*height);
    }
    int calculateSurfaceArea(){
        return (2*(length*breadth+breadth*height+length*height));
    }
}

