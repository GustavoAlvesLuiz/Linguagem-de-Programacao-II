/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;



/**
 *
 * @author 08463037607
 */
public class Medico {
    private String nomeMedico, cpfMedico, rgMedico;
    private double salarioMedico;
    Paciente p1;
    Enfermeiro e1;
    
    
    Medico(Paciente p1, String nomeMedico, Enfermeiro e1){
        this.p1 = p1;
        this.nomeMedico = nomeMedico;
        this.e1 = e1;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getCpfMedico() {
        return cpfMedico;
    }

    public void setCpfMedico(String cpfMedico) {
        this.cpfMedico = cpfMedico;
    }

    public String getRgMedico() {
        return rgMedico;
    }

    public void setRgMedico(String rgMedico) {
        this.rgMedico = rgMedico;
    }

    public double getSalarioMedico() {
        return salarioMedico;
    }

    public void setSalarioMedico(double salarioMedico) {
        this.salarioMedico = salarioMedico;
    }
    
   public void visualizarImagem(){
       System.out.println("Nome do Paciente: "+p1.getNomePaciente());
       System.out.println("Nome do Medico: "+nomeMedico);
       System.out.println("Nome do Enfermeiro: "+e1.getNomeEnfermeiro());
   }
    
}

