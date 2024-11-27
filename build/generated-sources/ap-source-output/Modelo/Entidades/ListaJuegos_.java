package Modelo.Entidades;

import Modelo.Entidades.Usuario;
import Modelo.Entidades.Videojuego;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-11-27T19:19:51")
@StaticMetamodel(ListaJuegos.class)
public class ListaJuegos_ { 

    public static volatile SingularAttribute<ListaJuegos, String> estado;
    public static volatile SingularAttribute<ListaJuegos, Integer> listaId;
    public static volatile SingularAttribute<ListaJuegos, Videojuego> juegoId;
    public static volatile SingularAttribute<ListaJuegos, Usuario> userId;

}