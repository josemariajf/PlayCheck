package Modelo.Entidades;

import Modelo.Entidades.Genero;
import Modelo.Entidades.ListaJuegos;
import Modelo.Entidades.Resena;
import Modelo.Entidades.Valoracion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-11-27T19:19:51")
@StaticMetamodel(Videojuego.class)
public class Videojuego_ { 

    public static volatile SingularAttribute<Videojuego, String> descripcion;
    public static volatile SingularAttribute<Videojuego, Date> fechaLanzamiento;
    public static volatile SingularAttribute<Videojuego, Integer> juegoId;
    public static volatile SingularAttribute<Videojuego, String> metacritic;
    public static volatile CollectionAttribute<Videojuego, Valoracion> valoracionCollection;
    public static volatile CollectionAttribute<Videojuego, Resena> resenaCollection;
    public static volatile SingularAttribute<Videojuego, String> enlaceCompra;
    public static volatile CollectionAttribute<Videojuego, ListaJuegos> listaJuegosCollection;
    public static volatile SingularAttribute<Videojuego, String> nombre;
    public static volatile SingularAttribute<Videojuego, String> imagenUrl;
    public static volatile SingularAttribute<Videojuego, String> desarrollador;
    public static volatile SingularAttribute<Videojuego, String> etiquetas;
    public static volatile SingularAttribute<Videojuego, String> genero;
    public static volatile CollectionAttribute<Videojuego, Genero> generoCollection;

}