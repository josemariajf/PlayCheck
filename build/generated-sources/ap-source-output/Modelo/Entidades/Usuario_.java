package Modelo.Entidades;

import Modelo.Entidades.Amigos;
import Modelo.Entidades.Comentarios;
import Modelo.Entidades.ListaJuegos;
import Modelo.Entidades.Resena;
import Modelo.Entidades.Valoracion;
import Modelo.Entidades.Valoracionweb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-11-27T19:19:51")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile CollectionAttribute<Usuario, Comentarios> comentariosCollection;
    public static volatile SingularAttribute<Usuario, Date> fechaNacimiento;
    public static volatile SingularAttribute<Usuario, String> avatarUrl;
    public static volatile SingularAttribute<Usuario, Date> fechaRegistro;
    public static volatile CollectionAttribute<Usuario, Amigos> amigosCollection;
    public static volatile CollectionAttribute<Usuario, Valoracion> valoracionCollection;
    public static volatile CollectionAttribute<Usuario, Resena> resenaCollection;
    public static volatile CollectionAttribute<Usuario, ListaJuegos> listaJuegosCollection;
    public static volatile SingularAttribute<Usuario, Integer> userId;
    public static volatile SingularAttribute<Usuario, String> rol;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile CollectionAttribute<Usuario, Valoracionweb> valoracionwebCollection;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, String> username;
    public static volatile CollectionAttribute<Usuario, Amigos> amigosCollection1;

}