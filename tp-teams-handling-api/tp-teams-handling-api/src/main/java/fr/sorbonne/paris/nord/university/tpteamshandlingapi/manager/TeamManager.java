package fr.sorbonne.paris.nord.university.tpteamshandlingapi.manager;

import fr.sorbonne.paris.nord.university.tpteamshandlingapi.dto.TeamDto;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.entity.TeamEntity;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TeamManager {
    private TeamService teamService;

    public TeamDto createTeam(TeamDto teamDto){

        TeamEntity teamToAdd = toTeamEntity(teamDto);
        TeamEntity addedTeam = teamService.insert(teamToAdd);
        return toTeamDto(addedTeam);

    }

    public List<TeamDto> getAllTeam(){
        List<TeamDto>teamDtoList = new ArrayList<>();
        List<TeamEntity>teamEntityList = teamService.getAllTeam();
        teamEntityList.forEach(data->{
            teamDtoList.add(toTeamDto(data));
        });
        return teamDtoList;
    }

    public TeamDto getTeamById(long id){
        return toTeamDto(teamService.findById(id).get());
    }

    public void deleteTeamById(long id){
        teamService.delete(id);
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
