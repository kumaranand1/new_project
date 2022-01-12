package question4;
public class Victory2 {

    public static void printwish(String wish){
        
        for(int i=0;i<=21;i++)
        {
            System.out.print(wish);
        }
    }

    public static void main(String[] arg) {
        printwish("/");
        System.out.println("\n|| Victory is mine! ||");
        printwish("\\");

        for (int j = 0; j <= 3; j++) {
            System.out.println("\n|| Victory is mine! ||");
            printwish("\\");
        }

    }

}