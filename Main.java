class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

  //Vamos Criar os Herois
  Heroi superMan = new Heroi("Clark Kent","Super Man","Dc Comics",100,70,100,0,false,false);

  System.out.printf("%s\n%s\n%s\n%s\n%d\n%d\n%d\n", superMan.getNomeReal(), superMan.getNome(), superMan.getEditora(), superMan.getPfinicial(), superMan.getPeinicial(), superMan.getPf(), superMan.getPe());
  
  }
}

