public class point {
    int ord;
    int abs;
    static int nombre;
    int numero;

    point() {
        abs = 0;
        ord = 0;
        nombre++;
    }
    void setCoordonneePoint(int u, int v) {
        abs = u;
        ord = v;
    }
    void Translate(int u, int v) {
        abs = abs + u;
        ord = ord + v;
    }

    void affichPoint() {
        System.out.println("les cordonner de la point est " + abs + ", " + ord);
    }

    boolean origin() {
        return abs == 0 && ord == 0;
    }
    boolean Egal(point q) {
        return abs == q.abs && ord == q.ord;
    }
    void autrePointe(point p) {
        abs = p.abs;
        ord = p.ord;
    }
    point symetrie(){
        point ps=new point();
        ps.abs=0-abs;
        ps.ord=0-ord;
        return ps;
    }
}
