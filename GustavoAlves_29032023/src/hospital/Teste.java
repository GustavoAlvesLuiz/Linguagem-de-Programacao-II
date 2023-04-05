/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 08463037607
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Internacao> listInternacao = new ArrayList(); 
        Paciente p = new Paciente("Roberto", "098.675.980.07", "MG-0986754");
        
        Enfermeiro e = new Enfermeiro();
        System.out.println("Digite o nome do enfermeiro: ");
        e.setNomeEnfermeiro(entrada.nextLine());
        System.out.println("Digite o cpf do enfermeiro: ");
        e.setCpfEnfermeiro(entrada.nextLine());
        System.out.println("Digite o rg do enfermeiro: ");
        e.setRgEnfermeiro(entrada.nextLine());
        System.out.println("Digite o salario do enfermeiro: ");
        e.setSalarioEnfermeiro(entrada.nextDouble());
        
        Medico m = new Medico(p, "Alan", e);
        m.visualizarImagem();
        Internacao i = new Internacao("Virose");
        i.Motivo();
        i.valorTotalInternacao(10, 5, 200);
        
        
    }
}
