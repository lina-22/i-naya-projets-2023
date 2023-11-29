package fr.sorbonne.paris.nord.university.tpteamshandlingapi.manager;

import fr.sorbonne.paris.nord.university.tpteamshandlingapi.dto.TeamDto;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.entity.TeamEntity;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeamManager {
    private TeamService teamService;

    public TeamDto createTeam(TeamDto teamDto){

        TeamEntity teamToAdd = toTeamEntity(teamDto);
        TeamEntity addedTeam = teamService.insert(teamToAdd);
        return toTeamDto(addedTeam);

    }

    // ******************* the dto to model data transfer****************
    public TeamEntity toTeamEntity(TeamDto teamDto){
        TeamEntity teamEntity = new TeamEntity();
        teamEntity.setName(teamDto.getName());
        return teamEntity;
    }

    public TeamDto toTeamDto(TeamEntity teamEntity){
        TeamDto teamDto = new TeamDto();
        teamDto.setId(teamEntity.getId());
        teamDto.setName(teamEntity.getName());
        teamDto.setSlogan(teamEntity.getSlogan());
        return  teamDto;
    }
}
