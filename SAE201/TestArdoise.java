import ardoise.*;


public class TestArdoise {

    public static void main(String []args ) throws ColineaireException, InterruptedException{
        
        Ardoise ardoise = new Ardoise();

        PointPlan p1t = new PointPlan(80, 140);
        PointPlan p2t = new PointPlan(130, 100);
        PointPlan p3t = new PointPlan(180, 140);

        PointPlan p1m = new PointPlan(80, 140);
        PointPlan p2m = new PointPlan(180, 198);

        PointPlan p1tour = new PointPlan(9, 100);
        PointPlan p2tour= new PointPlan(20, 198);

        PointPlan p1p = new PointPlan(120, 170);
        PointPlan p2p = new PointPlan(140, 198);

        PointPlan p1oiseau1 = new PointPlan(118, 13);
        PointPlan p2oiseau1 = new PointPlan(123, 20);
        PointPlan p3oiseau1 = new PointPlan(128, 13);

        PointPlan p1oiseau2 = new PointPlan(133, 30);
        PointPlan p2oiseau2 = new PointPlan(136, 32);
        PointPlan p3oiseau2 = new PointPlan(138, 30);

        PointPlan p1oiseau3 = new PointPlan(142, 14);
        PointPlan p2oiseau3 = new PointPlan(144, 17);
        PointPlan p3oiseau3 = new PointPlan(146, 14);

        PointPlan p1montagne1 = new PointPlan(3, 14);
        PointPlan p2montagne1 = new PointPlan(43, 3);
        PointPlan p3montagne1 = new PointPlan(112, 14);

        PointPlan p1montagne2 = new PointPlan(152, 7);
        PointPlan p2montagne2 = new PointPlan(166, 3);
        PointPlan p3montagne2 = new PointPlan(172, 7);

        PointPlan p1branche1 = new PointPlan(170, 52);
        PointPlan p2branche1 = new PointPlan(173, 45);
        PointPlan p3branche1 = new PointPlan(177, 52);

        PointPlan p2branche2 = new PointPlan(184, 57);
        PointPlan p3branche2 = new PointPlan(177, 60);

        PointPlan p2branche3 = new PointPlan(174, 66);
        PointPlan p3branche3 = new PointPlan(170, 60);

        PointPlan p2branche4 = new PointPlan(164, 57);
        PointPlan p3branche4 = new PointPlan(170, 52);


        Chapeau toit = new Chapeau(p1t, p2t, p3t);
        Quadrilatere maison = new Quadrilatere(p1m, p2m);
        Quadrilatere tour = new Quadrilatere(p1tour, p2tour);
        Quadrilatere porte = new Quadrilatere(p1p, p2p);
        Maisons maison_entier = new Maisons(toit, maison, porte);
        Chapeau oiseau1 = new Chapeau(p1oiseau1, p2oiseau1, p3oiseau1);
        Chapeau oiseau2 = new Chapeau(p1oiseau2, p2oiseau2, p3oiseau2);
        Chapeau oiseau3 = new Chapeau(p1oiseau3, p2oiseau3, p3oiseau3);
        Triangle montagne1 = new Triangle(p1montagne1, p2montagne1, p3montagne1);
        Triangle montagne2 = new Triangle(p1montagne2, p2montagne2, p3montagne2);
        Chapeau branche1 = new Chapeau(p1branche1, p2branche1, p3branche1);
        Chapeau branche2 = new Chapeau(p3branche1, p2branche2, p3branche2);
        Chapeau branche3 = new Chapeau(p3branche2, p2branche3, p3branche3);
        Chapeau branche4 = new Chapeau(p3branche3, p2branche4, p3branche4);
        Etoiles etoile_entier = new Etoiles(branche1, branche2, branche3, branche4);



        ardoise.ajouterForme(tour);
        ardoise.ajouterForme(maison_entier);
        ardoise.ajouterForme(oiseau1);
        ardoise.ajouterForme(oiseau2);
        ardoise.ajouterForme(oiseau3);
        ardoise.ajouterForme(montagne1);
        ardoise.ajouterForme(montagne2);
        ardoise.ajouterForme(etoile_entier);  
        oiseau1.deplacer(10, 20);
        oiseau2.deplacer(10, 20);
        oiseau3.deplacer(10, 20);
        ardoise.dessinerGraphique();


        }
 }