package com.OOP.Inheritance;

import com.OOP.Encapsulation.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Project extends BaseEntity {

    private String projectCode;
    private String projectName;
    private User assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private String projectStatus;
    private String projectDetail;

    public Project(long id, LocalDateTime insertDateTime, long insertUserID, LocalDateTime lastUpdateDateTime,
                   long lastUpdateUserId, String projectCode, String projectName, User assignedManager, LocalDate startDate,
                   LocalDate endDate, String projectStatus, String projectDetail) {
        super(id, insertDateTime, insertUserID, lastUpdateDateTime, lastUpdateUserId); // to assign id to project we need super keyword
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectStatus = projectStatus;
        this.projectDetail = projectDetail;
    }

}