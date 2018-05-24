package designpattern.state;

public class PortaAntesDeRefatorar {

		private String estado;
		
		public PortaAntesDeRefatorar() {
			setEstado("Porta Aberta");
		}
		
		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		public String getEstado() {
			return estado;
		}
		
		void clicar(){
			switch (estado) {
			case "Porta Abrindo":
				setEstado("Porta Permanentemente Aberta");
				break;
			case "Porta Aberta":
				setEstado("Porta Permanentemente Aberta");
				break;
			case "Porta Permanentemente Aberta":
				setEstado("Porta Permanentemente Aberta");
				break;
			case "Porta Fechando":
				setEstado("Porta Permanentemente Aberta");
				break;
			case "Porta Fechada":
				setEstado("Porta Permanentemente Aberta");
				break;
			}
		}
		void fimDeCiclo() {
			
		}
		void timeOut() {
			
		}
		
		public static void main(String[] args) {
			
		}
}
