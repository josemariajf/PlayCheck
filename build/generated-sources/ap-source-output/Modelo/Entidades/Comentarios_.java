package Modelo.Entidades;

import Modelo.Entidades.Resena;
import Modelo.Entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-11-27T19:19:51")
@StaticMetamodel(Comentarios.class)
public class Comentarios_ { 

    public static volatile SingularAttribute<Comentarios, Date> fecha;
    public static volatile SingularAttribute<Comentarios, String> contenido;
    public static volatile SingularAttribute<Comentarios, Resena> resenaId;
    public static volatile SingularAttribute<Comentarios, Usuario> userId;
    public static volatile SingularAttribute<Comentarios, Integer> comentarioId;

}