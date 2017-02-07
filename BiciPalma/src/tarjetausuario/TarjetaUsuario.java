package tarjetausuario;

public class TarjetaUsuario {
	
		//variables
	
		private String id = "000000000";
		private boolean activada = false;
		
		//constructors
		
		public TarjetaUsuario() {
			
		}
		
		public TarjetaUsuario(String id, boolean activada){
			
			this.id = id;
			this.activada = activada;
			
		}
		
		//getters
		
		public String getId() {
			return this.id;
		}
		
		public Boolean getActivada() {
			return this.activada;
		}

}
