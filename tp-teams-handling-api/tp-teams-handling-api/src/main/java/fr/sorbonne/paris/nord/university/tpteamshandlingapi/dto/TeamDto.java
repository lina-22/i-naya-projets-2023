package fr.sorbonne.paris.nord.university.tpteamshandlingapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamDto {
//    private int id;
    private Long id;
    private String name;
    private String slogan;
}
