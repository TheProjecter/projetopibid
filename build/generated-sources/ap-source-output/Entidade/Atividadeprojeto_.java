package Entidade;

import Entidade.Projeto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-03-19T14:13:57")
@StaticMetamodel(Atividadeprojeto.class)
public class Atividadeprojeto_ { 

    public static volatile SingularAttribute<Atividadeprojeto, Integer> id;
    public static volatile SingularAttribute<Atividadeprojeto, Projeto> projetoId;
    public static volatile SingularAttribute<Atividadeprojeto, String> mesInicio;
    public static volatile SingularAttribute<Atividadeprojeto, String> mesFinal;
    public static volatile SingularAttribute<Atividadeprojeto, String> atividade;

}