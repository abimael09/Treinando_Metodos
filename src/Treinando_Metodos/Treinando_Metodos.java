package Treinando_Metodos;

import java.util.Scanner;
import javax.swing.*;

public class Treinando_Metodos {
    
    public static void main(String[] args) {
        
      double areaRetangulo = retangulo(); 
      JOptionPane.showMessageDialog(null, "Área do Retângulo = " + areaRetangulo);
    }
    
    public static double retangulo() {
        
        double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a Base:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura:"));
        double areaRetangulo = base * altura;
        
        return areaRetangulo;
    }
}
