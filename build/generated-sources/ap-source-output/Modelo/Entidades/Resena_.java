package Modelo.Entidades;

import Modelo.Entidades.Comentarios;
import Modelo.Entidades.Usuario;
import Modelo.Entidades.Videojuego;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-11-27T19:19:51")
@StaticMetamodel(Resena.class)
public class Resena_ { 

    public static volatile SingularAttribute<Resena, Date> fecha;
    public static volatile CollectionAttribute<Resena, Comentarios> comentariosCollection;
    public static volatile SingularAttribute<Resena, String> contenido;
    public static volatile SingularAttribute<Resena, Videojuego> juegoId;
    public static volatile SingularAttribute<Resena, Integer> resenaId;
    public static volatile SingularAttribute<Resena, Usuario> userId;

}