package de.vignold.vignoldmanagement.controller;

import de.vignold.vignoldmanagement.dto.JobDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/jobs")
public class JobController {

    @GetMapping("/all")
    public List<JobDTO> findAll()
    {
        //insert your logic here and return it
        return null;
    }
}
