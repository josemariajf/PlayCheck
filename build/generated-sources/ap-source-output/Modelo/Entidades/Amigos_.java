package Modelo.Entidades;

import Modelo.Entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-11-27T19:19:51")
@StaticMetamodel(Amigos.class)
public class Amigos_ { 

    public static volatile SingularAttribute<Amigos, Integer> amigoId;
    public static volatile SingularAttribute<Amigos, Usuario> user2Id;
    public static volatile SingularAttribute<Amigos, Usuario> user1Id;
    public static volatile SingularAttribute<Amigos, Date> fechaAmistad;

}