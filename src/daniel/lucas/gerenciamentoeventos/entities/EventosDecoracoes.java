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
 * EventosDecoracoes generated by hbm2java
 */
@Entity
@Table(name="eventos_decoracoes"
    ,catalog="gerenciadoreventos"
)
public class EventosDecoracoes  implements java.io.Serializable {


     private EventosDecoracoesId id;
     private Decoracoes decoracoes;
     private Eventos eventos;
     private BigDecimal valor;

    public EventosDecoracoes() {
    }

    public EventosDecoracoes(EventosDecoracoesId id, Decoracoes decoracoes, Eventos eventos, BigDecimal valor) {
       this.id = id;
       this.decoracoes = decoracoes;
       this.eventos = eventos;
       this.valor = valor;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="eventoId", column=@Column(name="evento_id", nullable=false) ), 
        @AttributeOverride(name="decoracaoId", column=@Column(name="decoracao_id", nullable=false) ) } )
    public EventosDecoracoesId getId() {
        return this.id;
    }
    
    public void setId(EventosDecoracoesId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="decoracao_id", nullable=false, insertable=false, updatable=false)
    public Decoracoes getDecoracoes() {
        return this.decoracoes;
    }
    
    public void setDecoracoes(Decoracoes decoracoes) {
        this.decoracoes = decoracoes;
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


