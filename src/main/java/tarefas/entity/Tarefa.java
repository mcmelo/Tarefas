package tarefas.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
 * Classe que representa a tabela TAREFA
 * @generated
 */
@Entity
@Table(name = "\"TAREFA\""


)
@XmlRootElement
public class Tarefa implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = -1797038618l;
	
	/**
	 * @generated
	 */
	@Id
    
	@Column(name = "id", insertable=true, updatable=true)
	private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "dataprev", nullable = true, unique = false, insertable=true, updatable=true)
	private java.util.Date dataprev;
	
	/**
	 * @generated
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "datarealiz", nullable = true, unique = false, insertable=true, updatable=true)
	private java.util.Date datarealiz;
	
	/**
	 * @generated
	 */
	@ManyToOne
	@JoinColumn(name="fk_responsavel", referencedColumnName = "id", insertable=true, updatable=true)
	private Responsavel responsavel;
	
	/**
	 * @generated
	 */
	@Column(name = "descricao", nullable = false, unique = false, length=200, insertable=true, updatable=true)
	private java.lang.String descricao;
	
	
	/**
	 * Construtor
	 * @generated
	 */
	public Tarefa(){
	}

	
	/**
	 * Obtém id
	 * @param id id
	 * return id
	 * @generated
	 */
	public java.lang.String getId(){
		return this.id;
	}
	
	/**
	 * Define id
	 * @param id id
	 * @generated
	 */
	public Tarefa setId(java.lang.String id){
		this.id = id;
		return this;
	}
	
	/**
	 * Obtém dataprev
	 * @param dataprev dataprev
	 * return dataprev
	 * @generated
	 */
	public java.util.Date getDataprev(){
		return this.dataprev;
	}
	
	/**
	 * Define dataprev
	 * @param dataprev dataprev
	 * @generated
	 */
	public Tarefa setDataprev(java.util.Date dataprev){
		this.dataprev = dataprev;
		return this;
	}
	
	/**
	 * Obtém datarealiz
	 * @param datarealiz datarealiz
	 * return datarealiz
	 * @generated
	 */
	public java.util.Date getDatarealiz(){
		return this.datarealiz;
	}
	
	/**
	 * Define datarealiz
	 * @param datarealiz datarealiz
	 * @generated
	 */
	public Tarefa setDatarealiz(java.util.Date datarealiz){
		this.datarealiz = datarealiz;
		return this;
	}
	
	/**
	 * Obtém responsavel
	 * @param responsavel responsavel
	 * return responsavel
	 * @generated
	 */
	public Responsavel getResponsavel(){
		return this.responsavel;
	}
	
	/**
	 * Define responsavel
	 * @param responsavel responsavel
	 * @generated
	 */
	public Tarefa setResponsavel(Responsavel responsavel){
		this.responsavel = responsavel;
		return this;
	}
	
	/**
	 * Obtém descricao
	 * @param descricao descricao
	 * return descricao
	 * @generated
	 */
	public java.lang.String getDescricao(){
		return this.descricao;
	}
	
	/**
	 * Define descricao
	 * @param descricao descricao
	 * @generated
	 */
	public Tarefa setDescricao(java.lang.String descricao){
		this.descricao = descricao;
		return this;
	}
	
	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
	
	/**
	 * @generated
	 */	
	@Override
  	public boolean equals(Object obj) {
    
	    if(this == obj)
	      return true;
	    
	    if(obj == null)
	      return false;
	    
	    if(!(obj instanceof Tarefa))
	      return false;
	    
	    Tarefa other = (Tarefa)obj;
	    
		if(this.id == null && other.id != null)
	    	return false;
	    else if(!this.id.equals(other.id))
	     	return false;
	

	    return true;
	    
	}
}
