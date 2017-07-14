package example;
class example {

int x;              //data member declaration
int y;
String name;
void hello () {
 System.out.println("Hello");
}

 public static void main(String args[]) {
	example pnt =new example();                         //data member initialization using default constructor  example() 
                                                            // during object creation
	System.out.println("pnt is :" + pnt.name + " " + pnt.x + " " + pnt.y); 
 }
}

