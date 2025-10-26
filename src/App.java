public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la pirámide: "));
        char relleno = System.console().readLine("Introduzca el carácter de relleno: ").charAt(0);
        for (int i = 1; i <= altura; i++) {
            System.out.printf("%" + (altura - i + 1) + "s", "");
            System.out.print(relleno);
            if (i > 1) {
                for (int j = 0; j < 2 * (i - 1) - 1; j++) {
                    if (i == altura) {
                        System.out.print(relleno);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print(relleno);
            }
            System.out.println();
        }
    }
}
