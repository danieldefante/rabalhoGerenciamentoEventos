package daniel.lucas.gerenciamentoeventos.entities;
// Generated May 29, 2017 10:42:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EventosFuncionarios generated by hbm2java
 */
@Entity
@Table(name="eventos_funcionarios"
    ,catalog="gerenciadoreventos"
)
public class EventosFuncionarios  implements java.io.Serializable {


     private EventosFuncionariosId id;
     private Eventos eventos;
     private Pessoas pessoas;
     private BigDecimal valor;

    public EventosFuncionarios() {
    }

    public EventosFuncionarios(EventosFuncionariosId id, Eventos eventos, Pessoas pessoas, BigDecimal valor) {
       this.id = id;
       this.eventos = eventos;
       this.pessoas = pessoas;
       this.valor = valor;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="eventoId", column=@Column(name="evento_id", nullable=false) ), 
        @AttributeOverride(name="pessoaId", column=@Column(name="pessoa_id", nullable=false) ) } )
    public EventosFuncionariosId getId() {
        return this.id;
    }
    
    public void setId(EventosFuncionariosId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="evento_id", nullable=false, insertable=false, updatable=false)
    public Eventos getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pessoa_id", nullable=false, insertable=false, updatable=false)
    public Pessoas getPessoas() {
        return this.pessoas;
    }
    
    public void setPessoas(Pessoas pessoas) {
        this.pessoas = pessoas;
    }

    
    @Column(name="valor", nullable=false, precision=15)
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }




}


