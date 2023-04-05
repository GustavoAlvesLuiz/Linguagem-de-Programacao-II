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
public class Internacao {
    private int numInternacao, qtdDias;
    private String motivoInternacao;
    private double valorDia, valorInternacao, valorTotalInternacao;
    private static int contInternacao;
    
    Internacao(String motivoInternacao){
       Internacao.contInternacao = Internacao.contInternacao+1;
        numInternacao = Internacao.contInternacao;
        System.out.println("Numero da Internacao: "+getNumInternacao());
        this.motivoInternacao = motivoInternacao;
    }

    public int getNumInternacao() {
        return numInternacao;
    }

    public void setNumInternacao(int numInternacao) {
        this.numInternacao = numInternacao;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public double getValorInternacao() {
        return valorInternacao;
    }

    public void setValorInternacao(double valorInternacao) {
        this.valorInternacao = valorInternacao;
    }

    public double getValorTotalInternacao() {
        return valorTotalInternacao;
    }

    public void setValorTotalInternacao(double valorTotalInternacao) {
        this.valorTotalInternacao = valorTotalInternacao;
    }
    
    public void valorTotalInternacao(double valorDia, int qtdDias, double valorInternacao){
        this.valorInternacao = (valorDia * qtdDias) + valorInternacao;
        System.out.println("Valor da Internacao: "+getValorInternacao());
    }
    
    public void valorTotal(double valorInternacao){
        this.valorTotalInternacao = this.valorInternacao + valorInternacao;
        System.out.println("Valor total de todas as internacoes: "+getValorTotalInternacao());
    }
    
    public void Motivo(){
        System.out.println("Motivo da Internacao: "+getMotivoInternacao());
    }
}
