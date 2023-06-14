import java.util.ArrayList;

import ardoise.Forme;
import ardoise.Segment;

public class Maisons extends Forme{
    private Chapeau toit;
    private Quadrilatere corps;
    private Quadrilatere porte;

    public Maisons() {
        super();
    }

    public Maisons(Chapeau c, Quadrilatere q, Quadrilatere p) {
        this.toit = c;
        this.corps = q;
        this.porte = p;
        this.setNomForme("Maison");
    }

    public Chapeau getToit() {
        return this.toit;
    }

    public Quadrilatere getCorps() {
        return this.corps;
    }

    public Quadrilatere getPorte() {
        return this.porte;
    }
    
    public void setToit(Chapeau c) {
        this.toit = c;
    }

    public void setCorps(Quadrilatere q) {
        this.corps = q;
    }

    public void setPorte(Quadrilatere p) {
        this.porte = p;
    }

    @Override
    public void deplacer(int x, int y) {

    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> s1 = new ArrayList<Segment>(this.toit.dessiner());
        ArrayList<Segment> s2 = new ArrayList<Segment>(this.corps.dessiner());
        ArrayList<Segment> s3 = new ArrayList<Segment>(this.porte.dessiner());

        ArrayList<Segment> s = new ArrayList<Segment>();

        for(int i = 0; i<s1.size(); i++) {
            s.add(s1.get(i));
        }

        for(int i = 0; i<s2.size(); i++) {
            s.add(s2.get(i));
        }

        for(int i = 0; i<s3.size(); i++) {
            s.add(s3.get(i));
        }

        return s;
    }

    @Override
    public String typeForme() {
        return "GF";
    }

    public String toString() {
        return "Maison : [ Toit = " + this.getToit() + ", Corps = " + this.getCorps() + ", Porte = " + this.getPorte() + " ]";
    }
}
