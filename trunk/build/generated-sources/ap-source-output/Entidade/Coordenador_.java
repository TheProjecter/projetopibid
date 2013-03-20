package Entidade;

import Entidade.Login;
import Entidade.Projeto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-19T14:13:57")
@StaticMetamodel(Coordenador.class)
public class Coordenador_ { 

    public static volatile SingularAttribute<Coordenador, Integer> id;
    public static volatile SingularAttribute<Coordenador, String> tel;
    public static volatile SingularAttribute<Coordenador, String> cel;
    public static volatile SingularAttribute<Coordenador, String> link;
    public static volatile SingularAttribute<Coordenador, String> nome;
    public static volatile CollectionAttribute<Coordenador, Login> loginCollection;
    public static volatile SingularAttribute<Coordenador, String> email1;
    public static volatile CollectionAttribute<Coordenador, Projeto> projetoCollection;
    public static volatile SingularAttribute<Coordenador, String> email2;

}