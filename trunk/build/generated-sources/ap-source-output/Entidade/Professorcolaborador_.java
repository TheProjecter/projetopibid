package Entidade;

import Entidade.Projeto;
import Entidade.Tarefa;
import Entidade.Tiposituacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-19T14:13:57")
@StaticMetamodel(Professorcolaborador.class)
public class Professorcolaborador_ { 

    public static volatile SingularAttribute<Professorcolaborador, Integer> id;
    public static volatile SingularAttribute<Professorcolaborador, Tiposituacao> tipoSituacaoid;
    public static volatile SingularAttribute<Professorcolaborador, String> tel;
    public static volatile SingularAttribute<Professorcolaborador, String> cel;
    public static volatile SingularAttribute<Professorcolaborador, String> instituicao;
    public static volatile CollectionAttribute<Professorcolaborador, Tarefa> tarefaCollection;
    public static volatile SingularAttribute<Professorcolaborador, String> nome;
    public static volatile SingularAttribute<Professorcolaborador, String> email1;
    public static volatile SingularAttribute<Professorcolaborador, String> endereco;
    public static volatile CollectionAttribute<Professorcolaborador, Projeto> projetoCollection;
    public static volatile CollectionAttribute<Professorcolaborador, Tarefa> tarefaCollection1;
    public static volatile SingularAttribute<Professorcolaborador, String> email2;

}