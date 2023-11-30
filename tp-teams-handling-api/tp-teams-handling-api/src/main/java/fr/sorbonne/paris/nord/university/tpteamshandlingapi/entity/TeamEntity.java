package fr.sorbonne.paris.nord.university.tpteamshandlingapi.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="team")
@Data
public class TeamEntity {
//    id IDENTITY NOT NULL PRIMARY KEY,
//    name VARCHAR(200),
//    slogan VARCHAR(500)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private int id;
    @Column(name = "name", nullable = true)
    private String name;

    @Column(name="slogan", nullable = true)
    private String slogan;


}
