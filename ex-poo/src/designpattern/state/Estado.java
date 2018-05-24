package designpattern.state;

public class Estado {
    public static void main(String[] args) {
      Porta porta = new Porta();   // Fechada
      porta.click();
      porta.complete();
      porta.timeout();
      porta.click();
      porta.status();
    }
  }
