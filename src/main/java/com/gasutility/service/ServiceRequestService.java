package com.gasutility.service;


import java.util.List;

import com.gasutility.entities.ServiceRequest;

public interface ServiceRequestService {

   
    ServiceRequest createServiceRequest(ServiceRequest serviceRequest);

    List<ServiceRequest> getServiceRequestsByUserId(Long userId);

    ServiceRequest updateServiceRequest(Long requestId, ServiceRequest updatedRequest);

    List<ServiceRequest> getAllServiceRequests();

    void deleteServiceRequest(Long requestId);

	ServiceRequest getServiceRequestById(Long requestId);
	
    ServiceRequest resolveServiceRequest(Long requestId); // New method to mark service request as resolved

}
