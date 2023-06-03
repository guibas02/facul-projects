package atv3;

import javax.swing.JOptionPane;

public class Atv3 {

    public static void main(String[] args) {
                
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Fala seu peso em kg: "));
        
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Fala sua altura em cm: "));
        
        float alturaMetros = altura / 100;
        
        float imc = calcularImc(peso, alturaMetros);
        String classificacao = classificacaoImc(imc);
        
        JOptionPane.showMessageDialog(null, "seu imc é: " + imc);
        JOptionPane.showMessageDialog(null, "a sua classificação de imc é : " + classificacao);
        
    } 
    
    public static float calcularImc(float peso, float alturaMetros){
        return peso / (alturaMetros * alturaMetros);
    } 
    
    public static String classificacaoImc(float imc){
        if (imc < 18.5){
            return "abaixo do peso";
    } else if (imc < 25){
        return "peso normal";
    } else if (imc < 30) {
        return "sobrepeso";
    } else {
        return "obesidade";
    }
    }
}

