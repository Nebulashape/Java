// name file TrigtableDeg.java
// compile javac Trigtablerad.java
// run      jave Trigtablerad
class TrigTableDeg {
    public static void main (String args[]){
      double c,s,t;
      int d = 0; //degrees
      double r= 0, rround = 0; //radian
      double pi = 3.141592653589793238462643383279502884197169399375105820974;
      int i = 15;
      String un = "UN";
      System.out.println("radian measurement is represented by rad");
        System.out.println("\t\t rad \t\t| cos(radian) \t\t| sin(rad) \t\t| tan (rad)");
        while (d <= (360){
          //convert angle to radians r
          r = d * (pi/180.0);
          c = Math.round(Math.cos(r));
          c = Math.round(r*1000.0)/1000.0;
          s = Math.round(Math.sin(r));
          s = Math.round(r*1000.0)/1000.0;
          t = Math.round(Math.tan(r));
          t =  Math.round(r*1000.0)/1000.0;

        if  ((rround == 1.571)||(rround == 4.712))

        {  System.out.println("\t" +rround+ "\t|\t " +c+ "\t|\t " + s + "\t|\t  + UN");
          }else{
          System.out.println("\t" +rround+ "\t|\t " +c+ "\t|\t " + s + "\t|\t " + t);
        }

          d = d + i;

        }

      }

    }
