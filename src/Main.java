public class Main {
    public static void main(String[] args) {
        String[][] moradores = {
                {"Davi", "Matheus", "Cauã", "David"},
                {"Marcos", "Vanessa", "Yuri"},
                {"Gustavo", "Ivan", "Marcos"}
        };

        for (int i = 0; i < moradores.length; i++) {
            int H = 1;
            System.out.println("No " + (i + 1) + "º andar tem " + moradores[i].length + " pessoas, que são:");

            for (int j = 0; j < moradores[i].length; j++) {
                if (H == moradores[i].length) {
                    System.out.println(" e " + moradores[i][j]);
                    System.out.println();
                } else if (H == 1) {
                    System.out.print(moradores[i][j]);
                } else {
                    System.out.print(" " + moradores[i][j]);
                }
                H++;
            }
        }
    }
}