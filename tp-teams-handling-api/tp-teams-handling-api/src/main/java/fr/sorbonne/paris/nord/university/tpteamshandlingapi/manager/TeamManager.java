package fr.sorbonne.paris.nord.university.tpteamshandlingapi.manager;

import fr.sorbonne.paris.nord.university.tpteamshandlingapi.dto.TeamDto;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.entity.TeamEntity;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.service.TeamService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class TeamManager {

    private final TeamService teamService;
    private static final Logger lOGGER = Logger.getLogger( TeamManager.class.getName() );


    public TeamManager(TeamService teamService){
        this.teamService = teamService;
    }


    public TeamDto createTeam(TeamDto teamDto) {
        TeamEntity teamToAdd = toTeamEntity(teamDto);
        lOGGER.info(teamToAdd.toString());
        TeamEntity addedTeam = teamService.insert(teamToAdd);
        lOGGER.info(addedTeam.toString());
        return toTeamDto(addedTeam);

    }

    public List<TeamDto> getAllTeam() {
        List<TeamDto> teamDtoList = new ArrayList<>();
        List<TeamEntity> teamEntityList = teamService.getAllTeam();
        teamEntityList.forEach(data -> {
            teamDtoList.add(toTeamDto(data));
        });
        return teamDtoList;
    }

    public TeamDto getTeamById(long id) {
        return toTeamDto(teamService.findById(id).get());
    }

    public void deleteTeamById(long id) {
        teamService.delete(id);
    }


    // ******************* the dto to model data transfer****************
    public TeamEntity toTeamEntity(TeamDto teamDto) {
        lOGGER.info("to entity : " + teamDto.toString());
        TeamEntity teamEntity = new TeamEntity();
        teamEntity.setName(teamDto.getName());
        teamEntity.setSlogan(teamDto.getSlogan());
        return teamEntity;
    }

    public TeamDto toTeamDto(TeamEntity teamEntity) {
        TeamDto teamDto = new TeamDto();
        teamDto.setId(teamEntity.getId());
        teamDto.setName(teamEntity.getName());
        teamDto.setSlogan(teamEntity.getSlogan());
        return teamDto;
    }
}
