package com.controller.impl;

import com.controller.VehicleController;
import com.business.VehicleBusiness;
import com.dto.request.VehicleCategoryReq;
import com.dto.response.CommonResponse;
import com.dto.response.VehicleCategoriesRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class vehicleConrollerImpl implements VehicleController {

    @Autowired
    VehicleBusiness vehicleBusiness;
    @Override
    @PatchMapping("/vehicle/create/category")
    public CommonResponse createVehicleCategory(@RequestBody VehicleCategoryReq vehicleCategoryReq) {
        return vehicleBusiness.createVehicleCategory(vehicleCategoryReq);
    }

    @Override
    @PatchMapping("/vehicle/get/categories")
    public List<VehicleCategoriesRes> getVehicleCategories() {
        return vehicleBusiness.getVehicleCategories();
    }
}
