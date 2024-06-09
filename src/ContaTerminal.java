public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da sua agência");
            String agenciaNumero = scanner.next();

            System.out.println("Digite o número da sua conta");
            int contaNumero = scanner.nextInt();

            System.out.println("Qual valor você vai depositar na sua conta?");
            double saldoConta = scanner.nextDouble();

            System.out.println("Qual é o seu nome?");
            String nomeCliente = scanner.next();

            System.out.println("Olá " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agenciaNumero + " , sua conta é " + contaNumero + " e seu saldo " + saldoConta + " já está disponível para saque");
        }   
    }
}