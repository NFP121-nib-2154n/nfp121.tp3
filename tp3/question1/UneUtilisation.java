package question1;

public class UneUtilisation {

    public static void main(String[] args) throws Exception {
        Pile p1 = new Pile(6);
        Pile p2 = new Pile(10);
        // p1 est ici une pile de polygones réguliers PolygoneRegulier.java

        p1.empiler(new PolygoneRegulier(5, 100));
        p1.empiler("polygone");
        p1.empiler(new Integer(100));
        System.out.println(" la pile p1 = " + p1); // Quel est le résultat ?

        p2.empiler(new Integer(1000));
        p1.empiler(p2);
        System.out.println(" la p1 = " + p1); // Quel est le résultat ?

        try {
            p1.empiler(new PolygoneRegulier(4,100));
            String s = (String) p1.depiler();
            /*Object D = p1.depiler();
            if(D instanceof PolygoneRegulier){
            String str = D.toString();
        }*/
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("(Exception lev�e successivement)");    
        } // catch
    } // main()
} // UneUtilisation
