abstract class  Personagem{
  
  private String nome;
  private String editora;
  private int pfinicial;
  private int peinicial;
  private int pf;
  private int pe;
  private boolean mimico;
  private boolean drenador;
  private Poder poder;
  
 
  public String getNome() {
  return nome;
  }
  public void setNome(String nome) {
  	this.nome = nome;
  }
  public String getEditora() {
  	return editora;
  }
  public void setEditora(String editora) {
  	this.editora = editora;
  }
  public int getPfinicial() {
  	return pfinicial;
  }
  public void setPfinicial(int pfinicial) {
  	this.pfinicial = pfinicial;
  }
  public int getPeinicial() {
  	return peinicial;
  }
  public void setPeinicial(int peinicial) {
  	this.peinicial = peinicial;
  }
  public int getPf() {
  	return pf;
  }
  public void setPf(int pf) {
  	this.pf = pf;
  }
  public int getPe() {
  	return pe;
  }
  public void setPe(int pe) {
  	this.pe = pe;
  }
  public boolean isMimico() {
  	return mimico;
  }
  public void setMimico(boolean mimico) {
  	this.mimico = mimico;
  }
  public boolean isDrenador() {
  	return drenador;
  }
  public void setDrenador(boolean drenador) {
  	this.drenador = drenador;
  }
  public Poder getPoder() {
  	return poder;
  }
  public void setPoder(Poder poder) {
  	this.poder = poder;
  }
  
  public void Drenar(Personagem oponente){
      
  }
  public void ClonarPoderes(Personagem oponente){
      
  }
  public void AdicionarPoder(Poder poder){
      
  }
  public void RemoverPoder(Poder poder){
  }
}