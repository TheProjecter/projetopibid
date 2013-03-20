package Entidade;

import Entidade.Projeto;
import Entidade.Tarefa;
import Entidade.Tiposituacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-19T14:13:57")
@StaticMetamodel(Alunocolaborador.class)
public class Alunocolaborador_ { 

    public static volatile SingularAttribute<Alunocolaborador, Integer> id;
    public static volatile SingularAttribute<Alunocolaborador, Tiposituacao> tipoSituacaoid;
    public static volatile SingularAttribute<Alunocolaborador, String> tel;
    public static volatile SingularAttribute<Alunocolaborador, String> cel;
    public static volatile CollectionAttribute<Alunocolaborador, Tarefa> tarefaCollection;
    public static volatile SingularAttribute<Alunocolaborador, String> nome;
    public static volatile SingularAttribute<Alunocolaborador, String> email1;
    public static volatile SingularAttribute<Alunocolaborador, String> endereco;
    public static volatile CollectionAttribute<Alunocolaborador, Projeto> projetoCollection;
    public static volatile CollectionAttribute<Alunocolaborador, Tarefa> tarefaCollection1;
    public static volatile SingularAttribute<Alunocolaborador, String> email2;
    public static volatile SingularAttribute<Alunocolaborador, String> matricula;

}