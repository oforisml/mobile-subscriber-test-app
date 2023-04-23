package com.samuel.ProjectMobileSubscribers.DTO;
import com.samuel.ProjectMobileSubscribers.Entity.ServiceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class SubscriberDTO {

    private Integer id;

    private String msisdn = "";

    private Integer customerIdOwner;

    private Integer customerIdUser;

    private ServiceType serviceType;

    private String serviceStartDate;

}
