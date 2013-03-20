package Entidade;

import Entidade.Projeto;
import Entidade.Tarefa;
import Entidade.Tiposituacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-19T14:13:57")
@StaticMetamodel(Bolsista.class)
public class Bolsista_ { 

    public static volatile SingularAttribute<Bolsista, Integer> id;
    public static volatile SingularAttribute<Bolsista, Tiposituacao> tipoSituacaoid;
    public static volatile SingularAttribute<Bolsista, String> tel;
    public static volatile SingularAttribute<Bolsista, String> cel;
    public static volatile CollectionAttribute<Bolsista, Tarefa> tarefaCollection;
    public static volatile SingularAttribute<Bolsista, String> nome;
    public static volatile SingularAttribute<Bolsista, Projeto> pROJETOid;
    public static volatile SingularAttribute<Bolsista, String> email1;
    public static volatile SingularAttribute<Bolsista, String> endereco;
    public static volatile CollectionAttribute<Bolsista, Tarefa> tarefaCollection1;
    public static volatile SingularAttribute<Bolsista, String> email2;
    public static volatile SingularAttribute<Bolsista, String> matricula;

}