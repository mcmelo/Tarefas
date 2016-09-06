package tarefas.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;

import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;

import java.util.*;

import tarefas.entity.*;
import tarefas.business.*;


/**
 * Controller para expor serviços REST de Responsavel
 * 
 * @author local
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/tarefas/Responsavel")
public class ResponsavelREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ResponsavelBusiness")
    private ResponsavelBusiness responsavelBusiness;

    /**
     * @generated
     */
      @Autowired
      @Qualifier("TarefaBusiness")
      private TarefaBusiness tarefaBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Responsavel post(@Validated @RequestBody final Responsavel entity) throws Exception {
        return responsavelBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Responsavel put(@Validated @RequestBody final Responsavel entity) throws Exception {
        return responsavelBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Responsavel put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Responsavel entity) throws Exception {
        return responsavelBusiness.put(entity);
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        responsavelBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<Responsavel>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(responsavelBusiness.list(pageable   )), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Tarefa")    
  public HttpEntity<PagedResources<Tarefa>> findTarefa(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(responsavelBusiness.findTarefa(instanceId,  pageable )), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Tarefa/{relationId}")    
  public void deleteTarefa(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.tarefaBusiness.delete(relationId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/Tarefa/{relationId}")
  public Tarefa putTarefa(@Validated @RequestBody final Tarefa entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
	return this.tarefaBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/Tarefa")
  public Tarefa postTarefa(@Validated @RequestBody final Tarefa entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
	Responsavel responsavel = this.responsavelBusiness.get(instanceId);
	entity.setResponsavel(responsavel);
	return this.tarefaBusiness.post(entity);
  }   



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Responsavel get(@PathVariable("id") java.lang.String id) throws Exception {
        return responsavelBusiness.get(id);
    }
}
