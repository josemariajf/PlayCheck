package Modelo.Entidades;

import Modelo.Entidades.Usuario;
import Modelo.Entidades.Videojuego;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-11-27T19:19:51")
@StaticMetamodel(Valoracion.class)
public class Valoracion_ { 

    public static volatile SingularAttribute<Valoracion, Date> fecha;
    public static volatile SingularAttribute<Valoracion, Integer> valoracionId;
    public static volatile SingularAttribute<Valoracion, Short> puntuacion;
    public static volatile SingularAttribute<Valoracion, Videojuego> juegoId;
    public static volatile SingularAttribute<Valoracion, Usuario> userId;

}