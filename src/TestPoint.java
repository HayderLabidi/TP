public class TestPoint {
    public static void main(String[] args){
        point p =new point();
        point q=new point();
        p.setCoordonneePoint(5,3);
        q.setCoordonneePoint(25,9);
        p.affichPoint();
        q.affichPoint();

        if (p.origin()){
            System.out.println("l'orgine de repere est p");
        }else{
            System.out.println("le cordonnee de p non nule");
        }

        if (p.Egal(q)){
            System.out.println("la point p egale la point q");

        }else{
            System.out.println("la point p differant a la point q");

        }
        p.affichPoint();
        point rs=p.symetrie();
        System.out.println("le symetrie de cette point est "+rs.abs +","+rs.ord);
        System.out.println("le nombre de point ="+point.nombre);


    }
}
