package Entidade;

import Entidade.Alunocolaborador;
import Entidade.Bolsista;
import Entidade.Escola;
import Entidade.Professorcolaborador;
import Entidade.Projeto;
import Entidade.Supervisor;
import Entidade.Tarefa;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-19T14:13:57")
@StaticMetamodel(Tiposituacao.class)
public class Tiposituacao_ { 

    public static volatile SingularAttribute<Tiposituacao, Integer> id;
    public static volatile CollectionAttribute<Tiposituacao, Alunocolaborador> alunocolaboradorCollection;
    public static volatile CollectionAttribute<Tiposituacao, Supervisor> supervisorCollection;
    public static volatile CollectionAttribute<Tiposituacao, Bolsista> bolsistaCollection;
    public static volatile CollectionAttribute<Tiposituacao, Tarefa> tarefaCollection;
    public static volatile SingularAttribute<Tiposituacao, String> situacao;
    public static volatile CollectionAttribute<Tiposituacao, Escola> escolaCollection;
    public static volatile CollectionAttribute<Tiposituacao, Professorcolaborador> professorcolaboradorCollection;
    public static volatile CollectionAttribute<Tiposituacao, Projeto> projetoCollection;

}