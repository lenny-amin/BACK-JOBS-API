package com.uap.proiv.jobs.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import com.uap.proiv.jobs.client.JobApiRepository;
import com.uap.proiv.jobs.dto.Job;

@ExtendWith (MockitoExtension.class)
public class JobServiceImplTest {
    @Mock
    JobApiRepository jobApiRepository;

    @InjectMocks
    JobServiceImpl jobServiceImpl;

    List<Job> jobs;

    @BeforeEach
    void setup(){
        jobs = new ArrayList<>();
        Job job1 = new Job ();
        job1.setId(1);
        job1.setName("Developer");
        job1.setSalary(5000);
        job1.setHours(0);
        
    }
}
