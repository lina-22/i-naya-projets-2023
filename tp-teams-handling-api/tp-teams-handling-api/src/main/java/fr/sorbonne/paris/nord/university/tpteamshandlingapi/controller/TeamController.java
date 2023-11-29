package fr.sorbonne.paris.nord.university.tpteamshandlingapi.controller;

import fr.sorbonne.paris.nord.university.tpteamshandlingapi.dto.TeamDto;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.entity.TeamEntity;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.manager.TeamManager;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.service.TeamService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/teams")
@AllArgsConstructor
public class TeamController {
//    public TeamController(TeamService teamService, ModelMapper modelMapper){
//        this.teamService =teamService;
//        this.modelMapper =modelMapper;
//    }
    @GetMapping("/hello")
    public String getTeams() {
        return "Hello World";
    }
//    private TeamService teamService;
//    TeamEntity teamToAdd;
//    private ModelMapper modelMapper;
//    @PostMapping(path = "/teams")
//    public ResponseEntity<TeamDto>createTeam(@RequestBody TeamDto teamDto) {
//       System.out.println("test here :" );
//        // convert DTO to entity
//        TeamEntity teamRequest = modelMapper.map(teamDto, TeamEntity.class);
//        TeamEntity teamEntity = teamService.insert(teamRequest);
//        // convert entity to DTO
//        TeamDto teamResponse = modelMapper.map(teamEntity, TeamDto.class);
//
//        return new ResponseEntity<TeamDto>(teamResponse, HttpStatus.CREATED);


//    }
    private final TeamManager teamManager;

    @PostMapping

    public TeamDto createTeam(@RequestBody TeamDto teamDto){

        return teamManager.createTeam(teamDto);
    }
};






