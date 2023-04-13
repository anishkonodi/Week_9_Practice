//Write a Java class called Rectangle that has fields for the rectangle's width and height. Write a custom Comparator implementation called AreaComparator that sorts Rectangle objects in ascending order based on their area (i.e., width x height). Then, modify the Rectangle class to implement the Comparable interface, so that Rectangle objects are sorted in ascending order based on their perimeter (i.e., 2 x width + 2 x height). Test your implementation by creating a list of Rectangle objects and sorting them using both the AreaComparator and the Comparable implementation.

import java.util.*;
class Rectangle implements Comparable<Rectangle>{
  double width,height;
  Rectangle(double width,double height){
    this.height=height;
    this.width=width;
  }
 double getArea(){
   return width*height;
 }
 double getPerimeter(){
   double p=2*(width+height);
   return p;
 }
  public int compareTo(Rectangle r){
    if(getPerimeter()>r.getPerimeter()){
      return -1;
    }
    else if(getPerimeter()<r.getPerimeter()){
      return 1;
    }
    else{
      return 0;
    }
  }
}
class AreaComparator implements Comparator<Rectangle>{
  public int compare(Rectangle r1,Rectangle r2){
    if(r1.getArea()>r2.getArea()){
      return -1;
    }
    else if(r1.getArea()<r2.getArea()){
      return 1;
    }
    else{
      return 0;
    }
  }
}
class RectangleDemo{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    ArrayList<Rectangle> rect=new ArrayList<Rectangle>();
    for(int i=0;i<3;i++){
      rect.add(new Rectangle(s.nextDouble(),s.nextDouble()));
    }
    System.out.println("sorted based on area");
    Collections.sort(rect,new AreaComparator());
    for(Rectangle r:rect){
      System.out.println(r.height+"  "+r.width+" Area is "+r.getArea());
    }

    System.out.println("Sorted based on Perimeter");
    Collections.sort(rect);
    for(Rectangle r:rect){
      System.out.println(r.height+"  "+r.width+" perimeter is "+r.getPerimeter());
    }
  }
}

