package Java_opgave_3_6;

public class Bmi {

        static double bmiBeregning(double hojde, double vaegt) {

            final double MIN_HOJDE = 0.01;
            final double MAX_HOJDE = 3.0;

            double resultat = vaegt / Math.pow(hojde, 2);

            resultat = Math.round(resultat*10.0)/10.0;

            if (hojde>MAX_HOJDE || hojde<MIN_HOJDE ) {
                System.out.println("Ugyldig højde: " + hojde);
                System.out.println("Højden skal være mellem " + MIN_HOJDE + " og " + MAX_HOJDE + " meter.");
                return -1;
            } else
            System.out.println(resultat);
            return resultat;
        }

}
