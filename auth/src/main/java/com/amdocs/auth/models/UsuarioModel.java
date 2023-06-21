@Entity
@Table(name="usuario")
public class UsuarioModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Getter
    @Setter
    long id;

    @Getter
    @Setter
    String nombre;

    @Getter
    @Setter
    String password;
}
