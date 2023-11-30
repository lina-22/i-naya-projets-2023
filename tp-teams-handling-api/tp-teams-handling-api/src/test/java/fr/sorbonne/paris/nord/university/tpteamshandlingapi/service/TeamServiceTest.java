package fr.sorbonne.paris.nord.university.tpteamshandlingapi.service;

import fr.sorbonne.paris.nord.university.tpteamshandlingapi.entity.TeamEntity;
import fr.sorbonne.paris.nord.university.tpteamshandlingapi.repository.TeamRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class TeamServiceTest {


    @InjectMocks
    private TeamService underTest;
    @Mock
    private TeamRepository repository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void should_getAllTeam() {
        //given -

        List<TeamEntity>teamEntityList = new ArrayList<>();
        TeamEntity teamEntity1 = new TeamEntity(1L, "test name 1", "slogan 1");
        TeamEntity teamEntity2 = new TeamEntity(2L, "test name 2", "slogan 2");
        TeamEntity teamEntity3 = new TeamEntity(3L, "test name 3", "slogan 3");
        teamEntityList.add(teamEntity1);
        teamEntityList.add(teamEntity2);
        teamEntityList.add(teamEntity3);

        //when -
        when(underTest.getAllTeam()).thenReturn(teamEntityList);

        //test -
        List<TeamEntity>result = underTest.getAllTeam();

        //then -
        verify(repository, times(1)).findAll();
    }

    @Test
    void should_findById() {
        //given -
        //when -
        //then -
    }

    @Test
    void should_insert() {
        //given -
        //when -
        //then -
    }

    @Test
    void should_delete() {
        //given -
        //when -
        //then -
    }
}