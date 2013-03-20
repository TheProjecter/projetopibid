package Entidade;

import Entidade.Supervisor;
import Entidade.Tiposituacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-19T14:13:57")
@StaticMetamodel(Escola.class)
public class Escola_ { 

    public static volatile SingularAttribute<Escola, String> nomeDiretor;
    public static volatile SingularAttribute<Escola, String> nomeViceDiretorTarde;
    public static volatile SingularAttribute<Escola, String> emailViceTarde;
    public static volatile CollectionAttribute<Escola, Supervisor> supervisorCollection;
    public static volatile SingularAttribute<Escola, String> emailViceNoite;
    public static volatile SingularAttribute<Escola, String> tel;
    public static volatile SingularAttribute<Escola, String> nomeViceDiretorManha;
    public static volatile SingularAttribute<Escola, String> nomeViceDiretorNoite;
    public static volatile SingularAttribute<Escola, String> emailViceManha;
    public static volatile SingularAttribute<Escola, Integer> id;
    public static volatile SingularAttribute<Escola, String> emaiDiretor;
    public static volatile SingularAttribute<Escola, Tiposituacao> tipoSituacaoid;
    public static volatile SingularAttribute<Escola, String> email;
    public static volatile SingularAttribute<Escola, String> esfera;
    public static volatile SingularAttribute<Escola, String> nome;
    public static volatile SingularAttribute<Escola, String> endereco;

}