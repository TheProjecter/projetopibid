package Entidade;

import Entidade.Coordenador;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-19T14:13:57")
@StaticMetamodel(Login.class)
public class Login_ { 

    public static volatile SingularAttribute<Login, Integer> id;
    public static volatile SingularAttribute<Login, String> login;
    public static volatile SingularAttribute<Login, String> senha;
    public static volatile SingularAttribute<Login, Coordenador> coordenadorId;

}