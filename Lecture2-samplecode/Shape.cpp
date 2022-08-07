// Shape_example.cpp
// Lecture 02 - Slide Deck
// Shape Class Inheritence Example
// IT2030 - Object Oriented Programming
// (c) SLIIT 2018

# include <iostream>
# include <string>
using namespace std;

class Shape
{
  protected:
	      string name;
  public:
	  Shape();
	  Shape ( string tname) {
	    name = tname;
	  }
	  void print() {
		  cout <<"\nThen name of shape is:"<< name;
	  }		 
	  virtual int area( ){}
};

class Rectangle: public Shape{
    protected:
		  int width;
		  int height;
    public : 
		  Rectangle (string tname, int w, int h) : Shape ( tname){
	    		width = w;
	    		height = h;
        	}
		  int area() {
			  return width * height;
		  }
		  void print() {
			  Shape::print();
			  cout <<"\nThe height of rectangle is: "<< height;
        		cout <<"\nThe width of rectangle is: "<< width;

	     }
};

class Circle: public Shape{
    protected:
		  int radius;
		
    public : 
		  Circle (string tname, int r) : Shape ( tname) {
	    		radius = r;
      }
		  int area( ) {
			  return 2 * 22/7.0 * radius* radius;
		  }
		  void print() {
			  Shape::print();
        cout <<"\nThe radius of circle is: "<< radius;
      }
};


int main() {
	Rectangle R("Rectangle", 4 , 6);
	Circle C("Circle", 3 );

	R.print();
	cout <<"\nThe area of rectangle is: "<<R.area();

	cout<<"\n\n*****************************";

	C.print();
	cout <<"\nThe area of circle is: "<<C.area();
}