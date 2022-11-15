class Heroi extends Personagem {
  private String nomeReal;
  
  public String getNomeReal() {
		return nomeReal;
	}
	public void setNomeReal(String nomeReal){
		this.nomeReal = nomeReal;
	}
  public  Heroi(String nomeReal, String nome, String editora, int pfInicial, int peInicial, int pf, int pe, boolean mimico, boolean drenador){
    this.nomeReal = nomeReal;
    this.getNome();
    this.getEditora();
    this.getPfinicial();
    this.getPeinicial();
    this.getPf();
    this.isMimico();
    this.isDrenador();
  }
}