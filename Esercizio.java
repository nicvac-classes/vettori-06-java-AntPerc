
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Esercizio {
public static void main(String args[]) {
        int n, i, iMin;
        Scanner in = new Scanner(System.in);
        System.out.println("Quanti atleti ci sono in gara?");
        n = in.nextInt();
        List<String> nomi = new ArrayList<>(n);
        List<String> nazionali = new ArrayList<>(n);
        List<Float> tempi = new ArrayList<>(n);
        for (i = 0; i < n; i++) {
            System.out.println("nome " + (i + 1) + "° atleta: ");
            nomi.add(in.next());
            System.out.println("Nazionale " + (i + 1) + "° atleta: ");
            nazionali.add(in.next());
            System.out.println("Tempo " + (i + 1) + "° atleta: ");
            tempi.add(in.nextFloat());
        }
        System.out.println("Informazioni inserite");
        for (i = 0; i < n; i++) {
            System.out.println((i + 1) + "° atleta: " + nomi.get(i) + "; nazionale: " + nazionali.get(i)
                    + "; tempo: " + tempi.get(i));
        }
        System.out.println("Ricerca dell'atleta vincitore");
        float min;
        iMin = 0;
        min = tempi.get(0);
        for (i = 0; i < nomi.size(); i++) {
            if (tempi.get(i) < min) {
                iMin = i;
                min = tempi.get(i);
            }
        }
        System.out.println("Atleta vincitore: " + nomi.get(iMin)
                + "; nazionale: " + nazionali.get(iMin) + "; tempo: " + tempi.get(iMin));
    }
}