package Traingle_Casification_class_1.Traingle_Casification_class_1;


/**
 * Hello world!
 *
 */

enum Triangle_Types {
	  equilateral,
	  isosceles,
	  Scalene,
	  Nottriangle,
    ERROR
    
	} 

class TriangleClassifier {
	
	private static Triangle_Types triangle;
	

	
	public static void classifyTriangle(int a, int b, int c) {

		if (isTriangle(a, b, c)) {

			if(isIsosceles(a, b, c)) {

				triangle= Triangle_Types.isosceles;

			}

			else if(isEquilateral(a, b, c)) {

				triangle= Triangle_Types.equilateral;

			}

			else   if (isScalene(a, b, c)){

				triangle=Triangle_Types.Scalene;

			}

			else {

				triangle=Triangle_Types.ERROR;

			}

		}

		else {

			triangle = Triangle_Types.Nottriangle;

		}

		       

	    }
	
	private static boolean isTriangle(int a, int b, int c) {

        return b + a > c && a + c > b && b + c > a;

    }



    private static boolean isIsosceles(int a, int b, int c) {

        return a + b > c && a + c > b && b + c > a && ((a==b && a!=c) || (b==c && b!=a) || (c==a && c!=b));

    }





    private static boolean isEquilateral(int a, int b, int c ) {

        return  b + a > c && a + c > b && b + c > a && ( a == b) &&( b == c )&&( c==a);

    }
    //

    private static boolean isScalene(int a, int b, int c ) {

        return a + b > c && b + c > a && a + c > b && a != b && b != c && c!=a;

    }

    

    private static boolean impossible(int a , int b , int c) {

    	return (a!=b && a==c && b==c)||(a==b && a!=c && b==c)||(a==b && a==c && b!=c) ;

    }

    

    public static Triangle_Types get_type() {

    	return triangle;

    }
}



	    