package EpamAssignment.EPAMCollections;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in) ;
        CustomImplementation<Object> ci = new CustomImplementation<Object>() ;
        ci.add(543) ;
        ci.add(552) ;
        ci.add(532) ;
        ci.add(554) ;
        ci.add(560) ;
        ci.add("CHANDU");
        ci.add("POOJI");
        ci.add("BHAVYA");
        ci.add("VALLI");
        ci.add("MEGHA");
        ci.display() ;
        int x = sc.nextInt() ;
        System.out.println("Element retrived from custom array list which is at index "+x+" is : "+ci.get(x)) ;
        int y = sc.nextInt() ;
        System.out.println("Element removed from custom array list present at particular index "+y+" is :"+ci.remove(y)) ;
        System.out.println("After performing all array list operations the final array list is :") ;
        ci.display() ;
    }
}