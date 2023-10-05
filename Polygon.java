class Polygon {

  double width;
  double height;

  public Polygon()
  {
      width = 5;
      height = 5;
  }

  public Polygon(double w, double h)
  {
      width=w;
      height=h;
  }

  public void setWidth(double w)
  {
    width = w;
  }
  public void setHeight(double h)
  {
    height = h;
  }

  public double getArea()
   {
      return 0;
   }

}

class Triangle extends Polygon {

  public double getArea()
   {
      double area = (1/2)*(width*height);
      return area;
   }
}

class Rectangle extends Polygon {

  public double calcArea()
   {
      double area = (width*height);
      return area ;
   }
}

class Main {
  public static void main(String[] args) {

    Triangle tri = new Triangle();
    System.out.println("Triangle's width: "+tri.width+"cm");
    System.out.println("Triangle's height: "+tri.height+"cm");
    System.out.println("Triangle's area: "+tri.getArea()+"cm^2");

    Rectangle rec = new Rectangle();
    System.out.println("\nRectangle's width: "+rec.width+"cm");
    System.out.println("Rectangle's height: "+rec.height+"cm");
    System.out.println("Rectangle's area: "+rec.calcArea()+"cm^2");
  }
}