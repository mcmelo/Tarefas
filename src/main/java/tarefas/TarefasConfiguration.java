package tarefas;

import org.springframework.orm.jpa.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.transaction.*;
import org.springframework.transaction.annotation.*;


/**
 * Classe que configura os beans para persistencia
 * 
 * @author local
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "tarefas-EntityManagerFactory",
        transactionManagerRef = "tarefas-TransactionManager"
)
class TarefasConfiguration {
  

    @Bean(name="tarefas-EntityManagerFactory")
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("tarefas");
        return factoryBean;
    }

    @Bean(name = "tarefas-TransactionManager")
    public PlatformTransactionManager transactionManager() {
        return new JpaTransactionManager(entityManagerFactory().getObject());
    }


}


