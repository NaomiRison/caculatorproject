package Naomi2;

/**
 * Created by nrris on 7/10/2016.
 */
public class Operations {


    private int x;
    private int y;
    public  static  int result;


       public Operations( int x, int y){

        this.x=x;
        this.y=y;
        System.out.println( " you typed : " +  x + "  and " + y);
    }
      public int Division(int x, int y ){


           result= x/y;
          return result;

      }


    public int Addition(int x, int y ){


        result= x+y;
        return result;

    }
    public int subtraction(int x, int y ){


        result= x-y;
        return result;

    }
    public int mutiplication(int x, int y ){


        result= x*y;
        return result;

    }

}

