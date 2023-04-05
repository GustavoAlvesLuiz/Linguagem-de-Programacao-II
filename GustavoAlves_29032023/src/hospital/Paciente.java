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
public class Paciente {
    private String nomePaciente, cpfPaciente, rgPaciente;
    
    Paciente(String nomePaciente, String cpfPaciente, String rgPaciente){
        this.nomePaciente = nomePaciente;
        this.cpfPaciente = cpfPaciente;
        this.rgPaciente = rgPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getRgPaciente() {
        return rgPaciente;
    }

    public void setRgPaciente(String rgPaciente) {
        this.rgPaciente = rgPaciente;
    }
    
    
}
