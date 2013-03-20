package Entidade;

import Entidade.Escola;
import Entidade.Projeto;
import Entidade.Tarefa;
import Entidade.Tiposituacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-19T14:13:57")
@StaticMetamodel(Supervisor.class)
public class Supervisor_ { 

    public static volatile SingularAttribute<Supervisor, Integer> id;
    public static volatile SingularAttribute<Supervisor, Tiposituacao> tipoSituacaoid;
    public static volatile SingularAttribute<Supervisor, String> tel;
    public static volatile SingularAttribute<Supervisor, String> cel;
    public static volatile SingularAttribute<Supervisor, Escola> idEscola;
    public static volatile CollectionAttribute<Supervisor, Tarefa> tarefaCollection;
    public static volatile SingularAttribute<Supervisor, String> nome;
    public static volatile SingularAttribute<Supervisor, Projeto> pROJETOid;
    public static volatile SingularAttribute<Supervisor, String> email1;
    public static volatile SingularAttribute<Supervisor, String> endereco;
    public static volatile SingularAttribute<Supervisor, String> email2;

}