import java.util.ArrayList;

import ardoise.Forme;
import ardoise.Segment;

public class Etoiles extends Forme{
    private Chapeau chapeau1;
    private Chapeau chapeau2;
    private Chapeau chapeau3;
    private Chapeau chapeau4;

    public Etoiles() {
        super();
    }

    public Etoiles(Chapeau c1, Chapeau c2, Chapeau c3, Chapeau c4) {
        this.chapeau1 = c1;
        this.chapeau2 = c2;
        this.chapeau3 = c3;
        this.chapeau4 = c4;
        this.setNomForme("Étoile");
    }

    public Chapeau getChapeau1() {
        return this.chapeau1;
    }

    public Chapeau getChapeau2() {
        return this.chapeau2;
    }

    public Chapeau getChapeau3() {
        return this.chapeau3;
    }

    public Chapeau getChapeau4() {
        return this.chapeau4;
    }

    public void setChapeau1(Chapeau c) {
        this.chapeau1 = c;
    }

    public void setChapeau2(Chapeau c) {
        this.chapeau2 = c;
    }

    public void setChapeau3(Chapeau c) {
        this.chapeau3 = c;
    }

    public void setChapeau4(Chapeau c) {
        this.chapeau4 = c;
    }



    @Override
    public void deplacer(int x, int y) {
        this.getChapeau1().deplacer(x, y);
        this.getChapeau2().deplacer(x, y);
        this.getChapeau3().deplacer(x, y);
        this.getChapeau4().deplacer(x, y);
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> s1 = new ArrayList<Segment>(this.getChapeau1().dessiner());
        ArrayList<Segment> s2 = new ArrayList<Segment>(this.getChapeau2().dessiner());
        ArrayList<Segment> s3 = new ArrayList<Segment>(this.getChapeau3().dessiner());
        ArrayList<Segment> s4 = new ArrayList<Segment>(this.getChapeau4().dessiner());

        ArrayList<Segment> s = new ArrayList<>();

        for(int i = 0; i<s1.size(); i++) {
            s.add(s1.get(i));
        }

        for(int i = 0; i<s2.size(); i++) {
            s.add(s2.get(i));
        }

        for(int i = 0; i<s3.size(); i++) {
            s.add(s3.get(i));
        }

        for(int i = 0; i<s4.size(); i++) {
            s.add(s4.get(i));
        }

        return s;
    }

    @Override
    public String typeForme() {
        return "GF";
    }

    public String toString() {
        return "Étoile : [ Chapeau1 = "+ this.getChapeau1() + ", Chapeau2 = " + this.getChapeau2() + ", Chapeau3 = " + this.getChapeau3() + ", Chapeau4 = " + this.getChapeau4() + " ]";
    }
}
