package Entidade;

import Entidade.Alunocolaborador;
import Entidade.Atividadeprojeto;
import Entidade.Bolsista;
import Entidade.Coordenador;
import Entidade.Professorcolaborador;
import Entidade.Supervisor;
import Entidade.Tiposituacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-19T14:13:57")
@StaticMetamodel(Projeto.class)
public class Projeto_ { 

    public static volatile SingularAttribute<Projeto, String> proposta;
    public static volatile CollectionAttribute<Projeto, Alunocolaborador> alunocolaboradorCollection;
    public static volatile CollectionAttribute<Projeto, Supervisor> supervisorCollection;
    public static volatile CollectionAttribute<Projeto, Bolsista> bolsistaCollection;
    public static volatile SingularAttribute<Projeto, String> cursoVinculado;
    public static volatile CollectionAttribute<Projeto, Atividadeprojeto> atividadeprojetoCollection;
    public static volatile SingularAttribute<Projeto, Integer> id;
    public static volatile SingularAttribute<Projeto, String> dataConclusao;
    public static volatile SingularAttribute<Projeto, Tiposituacao> tipoSituacaoid;
    public static volatile SingularAttribute<Projeto, String> titulo;
    public static volatile SingularAttribute<Projeto, String> dataInicio;
    public static volatile SingularAttribute<Projeto, String> nomeInstituicao;
    public static volatile SingularAttribute<Projeto, Coordenador> cOORDENADORid;
    public static volatile CollectionAttribute<Projeto, Professorcolaborador> professorcolaboradorCollection;
    public static volatile SingularAttribute<Projeto, String> resultadoPretendido;
    public static volatile SingularAttribute<Projeto, String> acaoPrevista;

}