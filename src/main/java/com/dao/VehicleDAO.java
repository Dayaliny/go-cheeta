package com.dao;

import com.dto.request.VehicleCategoryReq;
import com.dto.response.CommonResponse;
import com.dto.response.VehicleCategoriesRes;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface VehicleDAO {
    List<VehicleCategoriesRes> getVehicleCategories();

    CommonResponse createVehicleCategory(VehicleCategoryReq vehicleCategoryReq);
}
