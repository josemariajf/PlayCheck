package Modelo.Entidades;

import Modelo.Entidades.Videojuego;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-11-27T19:19:51")
@StaticMetamodel(Genero.class)
public class Genero_ { 

    public static volatile SingularAttribute<Genero, Integer> generoId;
    public static volatile CollectionAttribute<Genero, Videojuego> videojuegoCollection;
    public static volatile SingularAttribute<Genero, String> nombre;

}