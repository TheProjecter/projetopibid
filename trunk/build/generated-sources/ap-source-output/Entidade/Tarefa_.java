package Entidade;

import Entidade.Alunocolaborador;
import Entidade.Bolsista;
import Entidade.Professorcolaborador;
import Entidade.Supervisor;
import Entidade.Tiposituacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-19T14:13:57")
@StaticMetamodel(Tarefa.class)
public class Tarefa_ { 

    public static volatile CollectionAttribute<Tarefa, Alunocolaborador> alunocolaboradorCollection;
    public static volatile CollectionAttribute<Tarefa, Alunocolaborador> alunocolaboradorCollection1;
    public static volatile CollectionAttribute<Tarefa, Supervisor> supervisorCollection;
    public static volatile CollectionAttribute<Tarefa, Bolsista> bolsistaCollection;
    public static volatile SingularAttribute<Tarefa, String> dataPrecisaoConclusao;
    public static volatile SingularAttribute<Tarefa, String> descricao;
    public static volatile SingularAttribute<Tarefa, String> observacao;
    public static volatile CollectionAttribute<Tarefa, Professorcolaborador> professorcolaboradorCollection1;
    public static volatile SingularAttribute<Tarefa, Integer> id;
    public static volatile SingularAttribute<Tarefa, Tiposituacao> tipoSituacaoid;
    public static volatile SingularAttribute<Tarefa, String> titulo;
    public static volatile SingularAttribute<Tarefa, String> dataEfetivaConclusao;
    public static volatile SingularAttribute<Tarefa, String> dataPrevisaoInicio;
    public static volatile SingularAttribute<Tarefa, String> responsavel;
    public static volatile CollectionAttribute<Tarefa, Professorcolaborador> professorcolaboradorCollection;
    public static volatile SingularAttribute<Tarefa, String> dataCadastro;
    public static volatile CollectionAttribute<Tarefa, Bolsista> bolsistaCollection1;

}