public class Evento {

	public List atividades;
	public List eventossatelites;
	public Tipo tipo;
	private String nome;
	private String cidade;
	private int vagas;
	private int horas;
	private String ministrante;
	private String descricao;

	public enum Tipo {
		Semana, Escola, Salao, Mostra, Seminario
	}
	
	public Evento(String nome, String cidade, Tipo tipo) {
		this.nome = nome;
		this.cidade = cidade;
		this.tipo = tipo;
		this.atividades = new List();
		this.eventossatelites = new List();
	}
	
	public EventoSatelite novoEventoSatelite(String nome, Tipo tipo) {
		EventoSatelite e = new EventoSatelite(this, nome, tipo);
		this.eventossatelites.append(e);
		return e;
	}
	
	public Atividade novaAtividade(String descricao, int vagas, Atividade.Tipo tipo) {
		Atividade a = new Atividade(this, descricao, vagas, tipo);
		this.atividades.append(a);
		return a;
	}

	public Atividade novaAtividade(String descricao, int vagas, int horas, Atividade.Tipo tipo) {
		Atividade a = new Atividade(this, descricao, vagas, horas, tipo);
		this.atividades.append(a);
		return a;
	}
	
	public Atividade novaAtividade(String descricao, String ministrante, int vagas, int horas, Atividade.Tipo tipo) {
		Atividade a = new Atividade(this, descricao, ministrante, vagas, horas, tipo);
		this.atividades.append(a);
		return a;
	}
	
	public Atividade novaAtividade(String descricao, String ministrante, Atividade.Tipo tipo) {
		Atividade a = new Atividade(this, descricao, ministrante, tipo);
		this.atividades.append(a);
		return a;
	}

	public String getDescricao() {
		return this.descricao;
	}
	
	public String getNome() {
		return this.nome;
	}
//
	public Tipo getTipo() {
		return this.tipo;
	}

	public List getEventossatelites() {
		return eventossatelites;
	}

	public int getVagas() { 
		return this.vagas;
	}

	public int getHoras() {
		return this.horas;
	}

	public String getMinistrante() {
		return this.ministrante;
	}

	public String getCidade() {
		return this.cidade;
	}

	public Atividade[] getAtividades() {
		
		Atividade[] atividades = new Atividade[this.atividades.count()];
		for(int i=0; i<atividades.length; i++) {
			atividades[i] = (Atividade)this.atividades.get(i);
		}
		return atividades;
	}

	public EventoSatelite[] getEventosSatelites() {
		
		EventoSatelite[] es = new EventoSatelite[this.eventossatelites.count()];
		
		for(int j=0; j<es.length; j++) {
			es[j] = (EventoSatelite)this.eventossatelites.get(j);
		}
		
		return es;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atividades == null) ? 0 : atividades.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((eventossatelites == null) ? 0 : eventossatelites.hashCode());
		result = prime * result + horas;
		result = prime * result + ((ministrante == null) ? 0 : ministrante.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + vagas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (atividades == null) {
			if (other.atividades != null)
				return false;
		} else if (!atividades.equals(other.atividades))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (eventossatelites == null) {
			if (other.eventossatelites != null)
				return false;
		} else if (!eventossatelites.equals(other.eventossatelites))
			return false;
		if (horas != other.horas)
			return false;
		if (ministrante == null) {
			if (other.ministrante != null)
				return false;
		} else if (!ministrante.equals(other.ministrante))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipo != other.tipo)
			return false;
		if (vagas != other.vagas)
			return false;
		return true;
	}



	

}
