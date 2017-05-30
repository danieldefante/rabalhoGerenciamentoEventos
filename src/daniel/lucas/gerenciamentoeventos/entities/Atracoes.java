package daniel.lucas.gerenciamentoeventos.entities;
// Generated May 29, 2017 10:42:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Atracoes generated by hbm2java
 */
@Entity
@Table(name="atracoes"
    ,catalog="gerenciadoreventos"
)
public class Atracoes  implements java.io.Serializable {


     private Integer id;
     private Contatos contatos;
     private Enderecos enderecos;
     private String nome;
     private Set<EventosAtracoes> eventosAtracoeses = new HashSet<EventosAtracoes>(0);

    public Atracoes() {
    }

	
    public Atracoes(Contatos contatos, String nome) {
        this.contatos = contatos;
        this.nome = nome;
    }
    public Atracoes(Contatos contatos, Enderecos enderecos, String nome, Set<EventosAtracoes> eventosAtracoeses) {
       this.contatos = contatos;
       this.enderecos = enderecos;
       this.nome = nome;
       this.eventosAtracoeses = eventosAtracoeses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="contato_id", nullable=false)
    public Contatos getContatos() {
        return this.contatos;
    }
    
    public void setContatos(Contatos contatos) {
        this.contatos = contatos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="endereco_id")
    public Enderecos getEnderecos() {
        return this.enderecos;
    }
    
    public void setEnderecos(Enderecos enderecos) {
        this.enderecos = enderecos;
    }

    
    @Column(name="nome", nullable=false, length=100)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="atracoes")
    public Set<EventosAtracoes> getEventosAtracoeses() {
        return this.eventosAtracoeses;
    }
    
    public void setEventosAtracoeses(Set<EventosAtracoes> eventosAtracoeses) {
        this.eventosAtracoeses = eventosAtracoeses;
    }




}


