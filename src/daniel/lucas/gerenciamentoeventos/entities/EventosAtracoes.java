package daniel.lucas.gerenciamentoeventos.entities;
// Generated May 18, 2017 8:46:06 PM by Hibernate Tools 4.3.1


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
 * EventosAtracoes generated by hbm2java
 */
@Entity
@Table(name="eventos_atracoes"
    ,catalog="gerenciadoreventos"
)
public class EventosAtracoes  implements java.io.Serializable {


     private EventosAtracoesId id;
     private Atracoes atracoes;
     private Eventos eventos;
     private BigDecimal valor;

    public EventosAtracoes() {
    }

    public EventosAtracoes(EventosAtracoesId id, Atracoes atracoes, Eventos eventos, BigDecimal valor) {
       this.id = id;
       this.atracoes = atracoes;
       this.eventos = eventos;
       this.valor = valor;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="eventoId", column=@Column(name="evento_id", nullable=false) ), 
        @AttributeOverride(name="atracaoId", column=@Column(name="atracao_id", nullable=false) ) } )
    public EventosAtracoesId getId() {
        return this.id;
    }
    
    public void setId(EventosAtracoesId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="atracao_id", nullable=false, insertable=false, updatable=false)
    public Atracoes getAtracoes() {
        return this.atracoes;
    }
    
    public void setAtracoes(Atracoes atracoes) {
        this.atracoes = atracoes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="evento_id", nullable=false, insertable=false, updatable=false)
    public Eventos getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }

    
    @Column(name="valor", nullable=false, precision=15)
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }




}

