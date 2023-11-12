package model;

public class Disciplina extends Produto{
    private int chTotal;
    private double perctCumprido;

    
    public Disciplina(int chTotal, double perctCumprido) {
        this.chTotal = chTotal;
        this.perctCumprido = perctCumprido;
    }
    public int getChTotal() {
        return chTotal;
    }
    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }
    public double getPerctCumprido() {
        return perctCumprido;
    }
    public void setPerctCumprido(double perctCumprido) {
        this.perctCumprido = perctCumprido;
    }

    
}
