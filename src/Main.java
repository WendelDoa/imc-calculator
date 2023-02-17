//Programa para calcular IMC por Wendel
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // v Repetição
        int Option = 0;
        while (Option == 0) {

            // v Pega dados do usuário
            String Nome = JOptionPane.showInputDialog("Digite seu nome: ");
            int Idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
            double Peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: (xxx.xx)"));
            double Altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: (x.xx) "));

            // v Faz o calculo
            double Imc = Peso/(Altura*Altura);

            // v Compara o resultado
            String Resultado;
            if (Imc < 18.5) {
                Resultado = ("Abaixo do peso!");
            }
            else if (Imc > 18.6 && Imc < 24.9) {
                Resultado = ("Peso ideal!");
            }
            else if (Imc > 25 && Imc < 29.9) {
                Resultado = ("Acima do peso!");
            }
            else if (Imc > 30 && Imc < 34.9) {
                Resultado = ("Obesidade grau 1!");
            }
            else if (Imc > 35 && Imc < 39.9) {
                Resultado = ("Obesidade grau 2!");
            }
            else {
                Resultado = ("Obesidade grau 3!");
            }

            // v Mostra os resultados
            String mensagem = String.format("Oi "+Nome+"\nSua idade é: "+Idade+String.format("\nSeu IMC é: %.2f",Imc)+"\nVocê está em: "+Resultado);
            JOptionPane.showMessageDialog(null, mensagem);

            // v Pergunta se quer continuar
            Option = JOptionPane.showConfirmDialog(null,"Escolha:","Deseja continuar?",JOptionPane.YES_NO_OPTION);
        }
    }
}