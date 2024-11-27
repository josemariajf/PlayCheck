package Modelo.Entidades;

import Modelo.Entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-11-27T19:19:51")
@StaticMetamodel(Valoracionweb.class)
public class Valoracionweb_ { 

    public static volatile SingularAttribute<Valoracionweb, Integer> valoracionWebid;
    public static volatile SingularAttribute<Valoracionweb, Integer> puntuacion;
    public static volatile SingularAttribute<Valoracionweb, Date> fechaValoracion;
    public static volatile SingularAttribute<Valoracionweb, String> comentario;
    public static volatile SingularAttribute<Valoracionweb, Usuario> userId;

}