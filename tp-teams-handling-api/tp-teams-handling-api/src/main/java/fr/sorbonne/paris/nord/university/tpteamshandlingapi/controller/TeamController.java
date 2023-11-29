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

import java.util.List;


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

    @GetMapping
    public List<TeamDto> getAllTeam(){

        return teamManager.getAllTeam();
    }

    @GetMapping(path = "/{id}")
    public TeamDto getTeamById(@PathVariable long id){
        return teamManager.getTeamById(id);
    }

    @DeleteMapping(path ="/{id}")
    public ResponseEntity<String> deleteTeamById(@PathVariable long id) {
        try {
            teamManager.deleteTeamById(id);
            return new ResponseEntity<>("Team with id+ " + id + "has been deleted successfully.", HttpStatus.OK);
        } catch (Exception excp) {
            System.out.println(excp.getMessage());
            return new ResponseEntity<>("Team with " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }
};






